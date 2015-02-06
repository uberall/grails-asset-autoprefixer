grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn"
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
        mavenRepo "https://raw.github.com/uberall/uberall-plugins/mvn-repo/"
    }
    dependencies {
        compile('com.uberall.plugins:autoprefixer-asset-pipeline:1.0.2')
    }

    plugins {
        build(":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }

        compile(":asset-pipeline:2.0.13") {
            export = false
        }
    }
}

