class AssetAutoprefixerGrailsPlugin {
    def version = '1.0'
    def grailsVersion = '2.2 > *'
    def dependsOn = ['asset-pipeline': '2.0 > *']
    def title = 'Asset Autoprefixer Plugin'
    def author = 'Philipp Eschenbach'
    def authorEmail = 'philipp@uberall.com'
    def description = 'Asset-Pipeline extension to call autoprefixer on less and css files'
    def documentation = 'http://grails.org/plugin/asset-autoprefixer'
    def license = 'APACHE'
    def organization = [name: 'uberall', url: 'https://uberall.com/']
    def developers = [[name: 'David Carter', email: 'david@uberall.com']]
    def issueManagement = [system: 'GitHub', url: 'https://github.com/uberall/grails-asset-autoprefixer/issues']
    def scm = [url: 'https://github.com/uberall/grails-asset-autoprefixer']
}
