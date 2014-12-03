class AssetAutoprefixerGrailsPlugin {
    def version = "1.0"
    def grailsVersion = "2.2 > *"
    def dependsOn = ['asset-pipeline': '2.0 > *']
    def title = "Asset Autoprefixer Plugin"
    def author = "Philipp Eschenbach"
    def authorEmail = "philipp@uberall.com"
    def description = '''
Asset-Pipeline extension to call autoprefixer on less and css files
'''
    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/asset-autoprefixer"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "uberall", url: "https://uberall.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

}
