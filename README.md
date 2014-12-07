grails-asset-autoprefixer
==================

Grails plugin for autoprefixing assets

Requires asset-pipeline plugin!

Overview
--------
This plugin is an addition to the asset-pipeline plugin created by @bertramdev.

It uses https://github.com/postcss/autoprefixer-core to autoprefix css and less files for the configured browsers.

Usage
-------------
Add

    compile ":asset-autoprefixer:1.0"

to your BuildConfig.groovy.

You must also have asset-pipeline installed in your app with a version greater than 2.0

Configuration
-----------------
You can define which browsers to prefix for by overriding the default value in your Config.groovy

    grails.assets.autoprefixer.browsers = ['last 2 versions', 'Firefox ESR', '> 5%', 'ie 10','ie 9'] // default value
