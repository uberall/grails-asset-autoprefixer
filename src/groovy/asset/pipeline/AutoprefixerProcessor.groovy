package asset.pipeline

import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable

class AutoprefixerProcessor extends AbstractProcessor {

    public static final ThreadLocal threadLocal = new ThreadLocal()
    Scriptable globalScope
    ClassLoader classLoader
    def browsers

    AutoprefixerProcessor(AssetCompiler precompiler) {
        super(precompiler)
        classLoader = this.class.classLoader

        def autoprefixerJsResource = classLoader.getResource('asset/pipeline/js/autoprefixer.js')
        Context cx = Context.enter()

        cx.setOptimizationLevel(-1)
        globalScope = cx.initStandardObjects()
        cx.evaluateString(globalScope, autoprefixerJsResource.getText('UTF-8'), autoprefixerJsResource.file, 1, null)
        browsers = AssetPipelineConfigHolder.config?.autoprefixer?.browsers ?: ['last 2 versions', 'Firefox ESR', '> 5%', 'ie 10','ie 9']
    }

    String process(String input, AssetFile assetFile) {
        try {
            threadLocal.set(assetFile)

            def cx = Context.enter()
            def compileScope = cx.newObject(globalScope)
            compileScope.setParentScope(globalScope)
            compileScope.put("lessSrc", compileScope, input)
            compileScope.put("browserArray", compileScope, browsers)
            cx.evaluateString(compileScope, "autoprefixer({ browsers: browserArray, cascade: false }).process(lessSrc)", "autoprefix command", 0, null)
        } catch (Exception e) {
            throw new Exception("Autoprefixing failed: $e", e)
        } finally {
            Context.exit()
        }
    }
}
