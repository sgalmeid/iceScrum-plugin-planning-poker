grails.project.work.dir = "target"

//Relative path or absolute path to iceScrum core plugins
grails.plugin.location.'icescrum-core-domain' =  '../../iceScrum/plugins/icescrum-core-domain'
grails.plugin.location.'icescrum-core-services' =  '../../iceScrum/plugins/icescrum-core-services'
grails.plugin.location.'icescrum-core-webcomponents' =  '../../iceScrum/plugins/icescrum-core-webcomponents'

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
    }
}