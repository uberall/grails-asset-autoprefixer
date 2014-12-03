package asset.pipeline

/**
 * Created by philipp on 03/12/14.
 */
class AutoprefixedAssetFile extends AbstractAssetFile {
    static final String contentType = 'text/css'
    static extensions = ['css', 'less']
    static compiledExtension = 'css'
    static processors = [AutoprefixerProcessor]

    String directiveForLine(String line) {
        null
    }
}
