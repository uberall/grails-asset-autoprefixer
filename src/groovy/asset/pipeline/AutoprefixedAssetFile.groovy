package asset.pipeline

/**
 * @author philipp
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
