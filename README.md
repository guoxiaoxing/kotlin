# Kotlin

<img src="https://github.com/guoxiaoxing/kotlin/raw/master/art/kotlin_banner.png"/>

**关于作者**

>郭孝星，程序员，吉他手，主要从事Android平台基础架构方面的工作，欢迎交流技术方面的问题，可以去我的[Github](https://github.com/guoxiaoxing)提issue或者发邮件至guoxiaoxingse@163.com与我交流。

官方教程

- [Kotlin官网](https://kotlinlang.org/)
- [Kotlin官网中文版](https://www.kotlincn.net/)
- [Kotlin官方论坛](https://discuss.kotlinlang.org/)
- [Kotlin API](https://kotlinlang.org/api/latest/jvm/stdlib/index.html)
- [Kotlin在线资源库](https://kotlin.link/)

书籍推荐

- [Kotlin in Action](https://panxl6.gitbooks.io/kotlin-in-action-in-chinese/content/welcome.html)

官方插件

- [KKotlin Android Extensions](https://www.kotlincn.net/docs/tutorials/android-plugin.html)：编译器扩展，可以让你摆脱代码中的findViewById()调用，并将其替换为合成的编译器生成的属性。
- [Anko](https://github.com/kotlin/anko)：Anko is a Kotlin library which makes Android application development faster a nd easier. It makes your code clean and easy to read, and lets you forget about rough edges of the Android SDK for Java.

前段时间的Google IO 2017会议上Google正式宣布Kotlin将作为Android新的开发语言，这是一个振奋人心的消息，Kotlin具备很多现代
语言的特色，可以称得上Java的现代版，它能让我们从繁琐的语法中解脱出来，提高开发效率。另外值得一提的是Kotlin是完全兼容Java的，
也就是说你可以在项目中混用Kotlin与Java。

Android Stduio 3.0已经正式支持Kotlin，如果你是第一次接触Kotlin，你可以看一下下面3篇文章，跑一下Demo，体会一下Kotlin。

- [Gradle Config for Kotlin in Android](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Get Started with Kotlin on Android]( https://developer.android.com/kotlin/get-started.html)
- [Using Kotlin for Android Development](https://kotlinlang.org/docs/reference/android-overview.html)

文章目录

- [Kotlin项目实践指南(上)]()
- Kotlin项目实践指南(下)

# 附录

Kotlin生态系统

>Kotlin与整个Java生态系统完全兼容，也就是说你在搜寻解决方案时，现有的Java类库完全可以被使用，除此之外，纯Kotlin的类库也在欣欣向荣的发展。

### <a name="libraries-frameworks-tests"></a>Tests <sup>[Back ⇈](#libraries-frameworks-tests-subcategory)</sup>
* [JetBrains/spek](https://github.com/jetbrains/spek) - A specification framework for Kotlin.
* [npryce/hamkrest](https://github.com/npryce/hamkrest) - A reimplementation of Hamcrest to take advantage of Kotlin language features.
* [nhaarman/mockito-kotlin](https://github.com/nhaarman/mockito-kotlin) - Using Mockito with Kotlin.
* [MarkusAmshove/Kluent](https://github.com/MarkusAmshove/Kluent) - Fluent Assertion-Library for Kotlin.
* [winterbe/expekt](https://github.com/winterbe/expekt) - BDD assertion library for Kotlin.
* [kotlintest/kotlintest](https://github.com/kotlintest/kotlintest) - KotlinTest is a flexible and comprehensive testing tool for the Kotlin ecosystem based on and heavily inspired by the superb Scalatest.
* [dmcg/konsent](https://github.com/dmcg/konsent) - An acceptance test library for Kotlin.
* [raniejade/kspec](https://github.com/raniejade/kspec) - Kotlin Specification Framework.
* [EPadronU/balin](https://github.com/EPadronU/balin) - Balin is a browser automation library for Kotlin. It's basically a Selenium-WebDriver wrapper library inspired by Geb.
* [dmcg/k-sera](https://github.com/dmcg/k-sera) - A JMock wrapper for Kotlin.
* [dam5s/aspen](https://github.com/dam5s/aspen) - Aspen is an RSpec and Spek inspired test runner for Kotlin.
* [qwertukg/SeleniumBuilder](https://github.com/qwertukg/SeleniumBuilder) - DSL for Selenium 2.0. Provide a possibility to write tests in Kotlin builder style.

### <a name="libraries-frameworks-dependency-injection"></a>Dependency Injection <sup>[Back ⇈](#libraries-frameworks-dependency-injection-subcategory)</sup>
* [SalomonBrys/Kodein](https://github.com/SalomonBrys/Kodein) - Painless Kotlin Dependency Injection .
* [kohesive/injekt](https://github.com/kohesive/injekt) - (Deprecated, @see Kodein) Dependency Injection / Object Factory for Kotlin.
* [kailan/kodeinject](https://github.com/kailan/kodeinject) - Constructor dependency injection for Kodein.
* [traversals/kapsule](https://github.com/traversals/kapsule) - Minimalist dependency injection library for Kotlin.
* [JLLeitschuh/kotlin-guiced](https://github.com/JLLeitschuh/kotlin-guiced) - Convenience Kotlin API over the Google Guice DI Library.
* [Ekito/koin](https://github.com/Ekito/koin) - A functional Kotlin dependency injection framework for Android and JVM.

### <a name="libraries-frameworks-coroutines"></a>Coroutines <sup>[Back ⇈](#libraries-frameworks-coroutines-subcategory)</sup>
* [Kotlin/kotlin-coroutines](https://github.com/Kotlin/kotlin-coroutines) - Design documents and examples for coroutines in Kotlin.
* [Kotlin/kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Libraries built upon Kotlin coroutines.
* [soywiz/korio](https://github.com/soywiz/korio) - Korio: Kotlin cORoutines I/O: Streams + Async TCP Client/Server + Virtual File System for JVM, Node.JS and Browser.
* [soywiz/korim](https://github.com/soywiz/korim) - Korim: Kotlin cORoutines IMaging utilities depending on Korio.
* [soywiz/korui](https://github.com/soywiz/korui) - Korui: Kotlin cORoutines User Interfaces: korio + kimage + korui
* [konrad-kaminski/spring-kotlin-coroutine](https://github.com/konrad-kaminski/spring-kotlin-coroutine) - Kotlin coroutine support for Spring.

### <a name="libraries-frameworks-functional-programming"></a>Functional Programming <sup>[Back ⇈](#libraries-frameworks-functional-programming-subcategory)</sup>
* [MarioAriasC/funKTionale](https://github.com/MarioAriasC/funKTionale) - Functional constructs for Kotlin.
* [ReactiveX/RxKotlin](https://github.com/ReactiveX/RxKotlin) - RxJava bindings for Kotlin.
* [kittinunf/Result](https://github.com/kittinunf/Result) - The modelling for success/failure of operations in Kotlin.
* [brianegan/bansa](https://github.com/brianegan/bansa) - A state container for Kotlin & Java, inspired by Elm & Redux.
* [pardom/redux-kotlin](https://github.com/pardom/redux-kotlin) - Direct port of Redux for Kotlin.
* [beyondeye/Reduks](https://github.com/beyondeye/Reduks) - A "batteries included" port of Reduxjs for Kotlin+Android
* [pakoito/Komprehensions](https://github.com/pakoito/Komprehensions) - Do comprehensions for Kotlin and 3rd party libraries.
* [h0tk3y/kotlin-monads](https://github.com/h0tk3y/kotlin-monads) - Monads for Kotlin
* [FineCinnamon/Katz](https://github.com/FineCinnamon/Katz) - Typeful functional programming in Kotlin.
* [poetix/klenses](https://github.com/poetix/klenses) - Lenses for Kotlin.
* [reactor/reactor-kotlin-extensions](https://github.com/reactor/reactor-kotlin-extensions/) - Kotlin extensions for Reactor.
* [UrbanCompass/Snail-Kotlin](https://github.com/UrbanCompass/Snail-Kotlin) - An observables framework for Kotlin.

### <a name="libraries-frameworks-json"></a>JSON <sup>[Back ⇈](#libraries-frameworks-json-subcategory)</sup>
* [cbeust/klaxon](https://github.com/cbeust/klaxon) - Lightweight library to parse JSON in Kotlin.
* [SalomonBrys/Kotson](https://github.com/SalomonBrys/Kotson) - Gson for Kotlin, Kotson enables you to parse and write JSON with Google's Gson using a conciser and easier syntax.
* [FasterXML/jackson-module-kotlin](https://github.com/FasterXML/jackson-module-kotlin) - Jackson module that adds support for serialization/deserialization of Kotlin classes and data classes.
* [fboldog/ext4klaxon](https://github.com/fboldog/ext4klaxon) - Type Extensions (Long, Int, Enum, Date) for Klaxon.
* [Jire/KTON](https://github.com/Jire/KTON) - Object notation in pure Kotlin!

### <a name="libraries-frameworks-database"></a>Database <sup>[Back ⇈](#libraries-frameworks-database-subcategory)</sup>
* [JetBrains/Exposed](https://github.com/jetbrains/Exposed) - Exposed is a prototype for a lightweight SQL library written over JDBC driver for Kotlin language.
* [cheptsov/kotlin-nosql](https://github.com/cheptsov/kotlin-nosql) - NoSQL database query and access library for Kotlin.
* [jankotek/mapdb](https://github.com/jankotek/mapdb) - MapDB provides concurrent Maps, Sets and Queues backed by disk storage or off-heap-memory. It is a fast and easy to use embedded Java database engine.
* [seratch/kotliquery](https://github.com/seratch/kotliquery) - A handy database access library in Kotlin.
* [andrewoma/kwery](https://github.com/andrewoma/kwery) - Kwery is an SQL library for Kotlin.
* [square/sqldelight](https://github.com/square/sqldelight) - Generates Java models from CREATE TABLE statements.
* [x2bool/kuery](https://github.com/x2bool/kuery) - Typesafe SQL with Kotlin.
* [Litote/kmongo](https://github.com/Litote/kmongo) - KMongo - Kotlin toolkit for Mongo
* [requery/requery](https://github.com/requery/requery) - Modern SQL based query & persistence for Java/Kotlin/Android.
* [consoleau/kotlin-jpa-specification-dsl](https://github.com/consoleau/kotlin-jpa-specification-dsl) - This library provides a fluent DSL for querying spring data JPA repositories using spring data Specifications.
* [s4kibs4mi/PultusORM](https://github.com/s4kibs4mi/PultusORM) - PultusORM is a sqlite ORM library for kotlin on top of sqlite jdbc driver.
* [Ganet/rxaerospike](https://github.com/Ganet/rxaerospike) - RxJava2 wrapper for aerospike-client-java.
* [Raizlabs/DBFlow](https://github.com/Raizlabs/DBFlow) - A blazing fast, powerful, and very simple ORM android database library that writes database code for you.
* [KotlinPorts/kt-postgresql-async](https://github.com/KotlinPorts/kt-postgresql-async) - Kotlin/Gradle port of mauricio's async driver for postgres/mysql.
* [shyiko/levelkt](https://github.com/shyiko/levelkt) - LevelDB client for Kotlin and/or Java 8+.

### <a name="libraries-frameworks-tools"></a>Tools <sup>[Back ⇈](#libraries-frameworks-tools-subcategory)</sup>
* [Kotlin/dokka](https://github.com/Kotlin/dokka) - Documentation Engine for Kotlin.
* [Levelmoney/kbuilders](https://github.com/Levelmoney/kbuilders) - KBuilders turns your Java builders into beautiful Type-Safe Builders.
* [holgerbrandl/kscript](https://github.com/holgerbrandl/kscript) - Scripting utils for Kotlin.
* [kohesive/keplin](https://github.com/kohesive/keplin) - Secure Kotlin scripting and binary lambda-scripts.
* [shyiko/ktlint](https://github.com/shyiko/ktlint) - Kotlin linter.
* [jtransc/jtransc](https://github.com/jtransc/jtransc) - JVM AOT compiler created in Kotlin.
* [arturbosch/detekt](https://github.com/arturbosch/detekt) - Static code analysis for Kotlin.
* [cypressious/KotlinW](https://github.com/cypressious/KotlinW) - A small wrapper for the Kotlin compiler that can be used to execute .kts scripts.

### <a name="libraries-frameworks-desktop"></a>Desktop <sup>[Back ⇈](#libraries-frameworks-desktop-subcategory)</sup>
* [edvin/tornadofx](https://github.com/edvin/tornadofx) - Lightweight JavaFX Framework for Kotlin/

### <a name="libraries-frameworks-http-clients"></a>Http Clients <sup>[Back ⇈](#libraries-frameworks-http-clients-subcategory)</sup>
* [kittinunf/Fuel](https://github.com/kittinunf/Fuel) - The easiest HTTP networking library for Kotlin/Android.
* [jkcclemens/khttp](https://github.com/jkcclemens/khttp) - Kotlin HTTP requests library.

### <a name="libraries-frameworks-editors"></a>Editors <sup>[Back ⇈](#libraries-frameworks-editors-subcategory)</sup>
* [JetBrains/intellij-community](https://github.com/JetBrains/intellij-community) - IntelliJ IDEA Community Edition
* [alexmt/atom-kotlin-language](https://github.com/alexmt/atom-kotlin-language) - Adds syntax highlighting to Kotlin files in Atom
* [vkostyukov/kotlin-sublime-package](https://github.com/vkostyukov/kotlin-sublime-package) - A Sublime Package for Kotlin.
* [udalov/kotlin-vim](https://github.com/udalov/kotlin-vim) - Kotlin Syntax Highlighter for Vim.
* [sargunster/kotlin-textmate-bundle](https://github.com/sargunster/kotlin-textmate-bundle) - Kotlin bundle for TextMate.
* [ice1000/NppExtension](https://github.com/ice1000/NppExtension) - Kotlin Language extension for Notepad++
* [ftomassetti/kanvas](https://github.com/ftomassetti/kanvas) - A truly hackable editor: simple, lightweight, understandable.
* [mathiasfrohlich/vscode-kotlin](https://github.com/mathiasfrohlich/vscode-kotlin) - Kotlin language support for VS Code.

### <a name="libraries-frameworks-syntax-highlighters"></a>Syntax Highlighters <sup>[Back ⇈](#libraries-frameworks-syntax-highlighters-subcategory)</sup>
* [jneen/rouge](https://github.com/jneen/rouge) - A pure-ruby code highlighter that is compatible with pygments. (wip)
* [isagalaev/highlight.js](https://github.com/isagalaev/highlight.js) - Javascript syntax highlighter. (out-of-date)
* [github/linguist](https://github.com/github/linguist) - For Ruby/Github, uses Sublime package
* [birkenfeld/pygments-main](https://bitbucket.org/birkenfeld/pygments-main) - Python syntax highlighter.
* [cansik/kotlin-latex-listing](https://github.com/cansik/kotlin-latex-listing) - A syntax highlighting template for the Kotlin language in LaTeX listings.

### <a name="libraries-frameworks-game-development"></a>Game Development <sup>[Back ⇈](#libraries-frameworks-game-development-subcategory)</sup>
* [libktx/ktx](https://github.com/libktx/ktx) - Kotlin utilities for LibGDX applications.
* [AlmasB/FXGL](https://github.com/AlmasB/FXGL) - JavaFX 8 Game Library written in Java + Kotlin
* [icela/FriceEngine](https://github.com/icela/FriceEngine) - Make game developing easy again!

### <a name="libraries-frameworks-misc"></a>Misc <sup>[Back ⇈](#libraries-frameworks-misc-subcategory)</sup>
* [Kotlin/kotlinx.reflect.lite](https://github.com/Kotlin/kotlinx.reflect.lite) - Lightweight library allowing to introspect basic stuff about Kotlin symbols.
* [puniverse/quasar](https://github.com/puniverse/quasar/tree/master/quasar-kotlin) - Fibers, Channels and Actors for the JVM.
* [MehdiK/Humanizer.jvm](https://github.com/MehdiK/Humanizer.jvm) - Humanizer.jvm meets all your jvm needs for manipulating and displaying strings, enums, dates, times, timespans, numbers and quantities.
* [mplatvoet/kovenant](https://github.com/mplatvoet/kovenant) - Promises for Kotlin and Android
* [kohesive/klutter](https://github.com/kohesive/klutter) - A mix of random small libraries for Kotlin, the smallest reside here until big enough for their own repository.
* [kohesive/solr-undertow](https://github.com/kohesive/solr-undertow) - Solr Standalone Tiny and High performant server.
* [leprosus/kotlin-hashids](https://github.com/leprosus/kotlin-hashids) - Library that generates short, unique, non-sequential hashes from numbers.
* [mplatvoet/progress](https://github.com/mplatvoet/progress) - Progress for Kotlin.
* [sargunster/CakeParse](https://github.com/sargunster/CakeParse) - Simple parser combinator library for Kotlin.
* [sargunster/KtUnits](https://github.com/sargunster/KtUnits) - Tiny unit conversion library for Kotlin.
* [hotchemi/khronos](https://github.com/hotchemi/khronos) - An intuitive Date extensions in Kotlin.
* [yole/kxdate](https://github.com/yole/kxdate) - Kotlin extensions for Java 8 java.time API
* [ingokegel/jclasslib](https://github.com/ingokegel/jclasslib) - jclasslib bytecode viewer is a tool that visualizes all aspects of compiled Java class files and the contained bytecode.
* [holgerbrandl/krangl](https://github.com/holgerbrandl/krangl) - krangl is a {K}otlin library for data w{rangl}ing
* [debop/koda-time](https://github.com/debop/koda-time) - Joda Time Extensions in Kotlin. (From Java 8 use java.time instead)
* [MicroUtils/kotlin-logging](https://github.com/MicroUtils/kotlin-logging) - Lightweight logging framework for Kotlin. Used as a wrapper for slf4j with Kotlin extensions.
* [cesarferreira/kotlin-pluralizer](https://github.com/cesarferreira/kotlin-pluralizer) - Kotlin extension to pluralize and singularize strings.
* [JoelW-S/groothy](https://github.com/JoelW-S/groothy) - Kotlin implementation of Groovy Truth.
* [Jire/Strukt](https://github.com/Jire/Strukt) - Value types on the JVM, today!
* [moshbit/Kotlift](https://github.com/moshbit/Kotlift) - Kotlift is the first source-to-source language transpiler from Kotlin to Swift.
* [consoleau/kassava](https://github.com/consoleau/kassava) - This library provides some useful kotlin extension functions for implementing toString() and equals() without all of the boilerplate.
* [moove-it/fakeit](https://github.com/moove-it/fakeit) - Generates realistic fake data — like names, emails, dates, countries — to be used in your Android development environment.
* [czyzby/kotlin-times](https://github.com/czyzby/kotlin-times) - A simple utility library for readable loops.
* [phxql/aleksa](https://github.com/phxql/aleksa) - Aleksa is a small framework for writing Alexa Skills in Kotlin.
* [TicketmasterMobileStudio/actions-on-google-kotlin](https://github.com/TicketmasterMobileStudio/actions-on-google-kotlin) - Port of official Node.js SDK to Kotlin. Complete with all features and tests and nearly identical API.
* [cretz/asmble](https://github.com/cretz/asmble) - Compile WebAssembly to JVM and other WASM tools.
* [h0tk3y/better-parse](https://github.com/h0tk3y/better-parse) - A nice parser combinator library for Kotlin
* [Kotlin/kotlinx.atomicfu](https://github.com/Kotlin/kotlinx.atomicfu) - The idiomatic way to use atomic operations in Kotlin.
* [vjames19/kotlin-futures](https://github.com/vjames19/kotlin-futures) - A collections of extension functions to make the JVM Future, CompletableFuture, ListenableFuture API more functional and Kotlin like.

### <a name="libraries-frameworks-extensions"></a>Extensions <sup>[Back ⇈](#libraries-frameworks-extensions-subcategory)</sup>
* [Kotlin/kotlinx.support](https://github.com/Kotlin/kotlinx.support) - Extension and top-level functions to use JDK7/JDK8 features in Kotlin 1.0.

### <a name="libraries-frameworks-configuration"></a>Configuration <sup>[Back ⇈](#libraries-frameworks-configuration-subcategory)</sup>
* [npryce/konfig](https://github.com/npryce/konfig) - A Type Safe Configuration API for Kotlin
* [mariomac/kaconf](https://github.com/mariomac/kaconf) - KickAss Configuration. An annotation-based configuration system for Java and Kotlin
* [config4k/config4k](https://github.com/config4k/config4k) - A Kotlin wrapper for Typesafe Config
* [jdiazcano/cfg4k](https://github.com/jdiazcano/cfg4k) - Flexible and easy to use config library written in kotlin.
* [daviddenton/configur8](https://github.com/daviddenton/configur8) - A Kotlin port of Configur8 - A Type Safe Configuration API for Kotlin, extendable to user-defined types.
* [ufoscout/properlty](https://github.com/ufoscout/properlty) - Simple configuration library with placeholders resolution and zero magic!
* [uchuhimo/konf](https://github.com/uchuhimo/konf) - A type-safe cascading configuration library for Kotlin/Java, supporting most configuration formats

### <a name="libraries-frameworks-graphics"></a>Graphics <sup>[Back ⇈](#libraries-frameworks-graphics-subcategory)</sup>
* [kotlin-graphics/glm](https://github.com/kotlin-graphics/glm) - g-truck glm port, opengl mathematics library
* [kotlin-graphics/kotlin-unsigned](https://github.com/kotlin-graphics/kotlin-unsigned) - Unsigned operators and boxed types (Ubyte, Uint, Ulong and Ushort) for unsigned support.
* [kotlin-graphics/gli](https://github.com/kotlin-graphics/gli) - g-truck gli port, image library
* [kotlin-graphics/uno-sdk](https://github.com/kotlin-graphics/uno-sdk) - Unofficial OpenGL SDK
* [kotlin-graphics/ovr](https://github.com/kotlin-graphics/ovr) - Oculus binding
* [kotlin-graphics/openvr](https://github.com/kotlin-graphics/openvr) - OpenVR binding
* [kotlin-graphics/assimp](https://github.com/kotlin-graphics/assimp) - Open Asset Import Library port
* [GlimpseFramework/glimpse-framework](https://github.com/GlimpseFramework/glimpse-framework) - OpenGL made simple.
* [java-opengl-labs/modern-jogl-examples](https://github.com/java-opengl-labs/modern-jogl-examples) - port of 'Learning Modern 3D Graphic Programming' by J.L.McKesson (jogl)
* [java-opengl-labs/learn-OpenGL](https://github.com/java-opengl-labs/learn-OpenGL) - port of https://learnopengl.com/ tutorial (lwjgl)
* [kotlin-graphics/imgui](https://github.com/kotlin-graphics/imgui) - jvm port of imgui
* [Jonatino/JOGL2D](https://github.com/Jonatino/JOGL2D) - Zero-overhead 2D rendering library for JOGL using Kotlin.

### <a name="libraries-frameworks-data-science"></a>Data Science <sup>[Back ⇈](#libraries-frameworks-data-science-subcategory)</sup>
* [ligee/kotlin-jupyter](https://github.com/ligee/kotlin-jupyter) - Kotlin kernel for Jupyter/iPython.
* [thomasnield/kotlin-statistics](https://github.com/thomasnield/kotlin-statistics) - Advanced math and statistical extensions for Kotlin.
* [holgerbrandl/krangl](https://github.com/holgerbrandl/krangl) - krangl is a {K}otlin library for data w{rangl}ing.
* [kyonifer/koma](https://github.com/kyonifer/koma) - A scientific computing library for Kotlin.
* [MarcinMoskala/KotlinDiscreteMathToolkit](https://github.com/MarcinMoskala/KotlinDiscreteMathToolkit) - Set of extensions for Kotlin that provides Discrete Math functionalities as an Kotlin extension functions.
* [sekwiatkowski/Komputation](https://github.com/sekwiatkowski/Komputation) - A neural network framework written in Kotlin.
* [sanity/pairAdjacentViolators](https://github.com/sanity/pairAdjacentViolators) - A Kotlin implementation of the Pair Adjacent Violators algorithm for isotonic regression.

### <a name="libraries-frameworks-command-line-interface"></a>Command Line Interface <sup>[Back ⇈](#libraries-frameworks-command-line-interface-subcategory)</sup>
* [leprosus/kotlin-cli](https://github.com/leprosus/kotlin-cli) - Kotlin-CLI - command line interface options parser for Kotlin.
* [jimschubert/kopper](https://github.com/jimschubert/kopper) - A simple Kotlin option parser
* [xenomachina/kotlin-argparser](https://github.com/xenomachina/kotlin-argparser) - Easy to use and concise yet powerful and robust command line argument parsing for Kotlin.

### <a name="libraries-frameworks-browsers"></a>Browsers <sup>[Back ⇈](#libraries-frameworks-browsers-subcategory)</sup>
* [wendigo/chrome-reactive-kotlin](https://github.com/wendigo/chrome-reactive-kotlin) - Chrome Debugging Protocol for Kotlin (with RxJava2)


## <a name="projects"></a>Projects <sup>[Back ⇈](#projects-category)</sup>
### <a name="projects-web"></a>Web <sup>[Back ⇈](#projects-web-subcategory)</sup>
* [sdeleuze/spring-boot-kotlin-demo](https://github.com/sdeleuze/spring-boot-kotlin-demo) - Basic Spring Boot app in Kotlin.
* [IRus/kotlin-dev-proxy](https://github.com/IRus/kotlin-dev-proxy) - Simple server for proxy requests and host static files written in Kotlin, Spark Java and Apache HttpClient.
* [ratpack/example-ratpack-gradle-kotlin-app](https://github.com/ratpack/example-ratpack-gradle-kotlin-app) - An example of a Kotlin Ratpack app built with Gradle.
* [mariomac/codebuilder](https://github.com/mariomac/codebuilder) - Demo app about asynchronous architectures for long-response-time web applications.
* [rocketraman/kotlin-web-hello-world](https://github.com/rocketraman/kotlin-web-hello-world) - This project shows how to do a web-based "Hello World!" with Kotlin in combination with various JVM - based web frameworks.
* [ivanpopelyshev/vertx-facebook-messenger](https://github.com/ivanpopelyshev/vertx-facebook-messenger) - Seed project for facebook messenger bots. Vertx, Kotlin.
* [corda/corda](https://github.com/corda/corda) - Corda is a distributed ledger platform designed to record, manage and automate legal agreements between business partners. 
* [spolnik/JAlgoArena](https://github.com/spolnik/JAlgoArena) - JAlgoArena is a highly scalable programming contest platform which you can host on own infrastructure. It allows to define new problems and solve them in Kotlin and Java.
* [mixitconf/mixit](https://github.com/mixitconf/mixit) - MiXiT website
* [derveloper/kiny](https://github.com/derveloper/kiny) - Your super simple private serverless service running your kotlin functions like AWS lambda.
* [ssouris/petclinic-spring5-reactive](https://github.com/ssouris/petclinic-spring5-reactive) - Spring 5 Reactive Petclinic app written in Kotlin.

### <a name="projects-build-tools"></a>Build tools <sup>[Back ⇈](#projects-build-tools-subcategory)</sup>
* [cbeust/kobalt](https://github.com/cbeust/kobalt) - Build system inspired by Gradle.
* [gradle/gradle-script-kotlin](https://github.com/gradle/gradle-script-kotlin) - Kotlin language support for Gradle build scripts.
* [nebula-plugins/nebula-kotlin-plugin](https://github.com/nebula-plugins/nebula-kotlin-plugin) - Provides the Kotlin plugin via the Gradle plugin portal, automatically depends on the standard library, and allows Kotlin library versions to be omitted.
* [pubref/rules_kotlin](https://github.com/pubref/rules_kotlin) - Bazel rules for Kotlin.

### <a name="projects-misc"></a>Misc <sup>[Back ⇈](#projects-misc-subcategory)</sup>
* [brikk/brikk](https://github.com/brikk/brikk) - Brikk dependency manager (Kotlin, KotlinJS, Java, ...).
* [lice-lang/lice](https://github.com/lice-lang/lice) - A Lisp-like language's interpreter written in Kotlin
* [sureshg/InstallCerts](https://github.com/sureshg/InstallCerts) - Create a PKCS12 TrustStore by retrieving server certificates.
* [vicboma1/GameBoyEmulatorEnvironment](https://github.com/vicboma1/GameBoyEmulatorEnvironment) - Front-End developed with Kotlin Experimental for my GameBoy Emulator (coroutines).
* [borisf/classyshark-bytecode-viewer](https://github.com/borisf/classyshark-bytecode-viewer) - View your Kotlin generated classes as Java and bytecode format.

### <a name="projects-desktop"></a>Desktop <sup>[Back ⇈](#projects-desktop-subcategory)</sup>
* [ice1000/Dekoder](https://github.com/ice1000/Dekoder) -  A kotlin music player, materially designed.

### <a name="projects-examples"></a>Examples <sup>[Back ⇈](#projects-examples-subcategory)</sup>
* [Kotlin/kotlin-koans](https://github.com/Kotlin/kotlin-koans) - Kotlin Koans are a series of exercises to get you familiar with the Kotlin Syntax.
* [JetBrains/kotlin-examples](https://github.com/JetBrains/kotlin-examples) - Various examples for Kotlin.
* [JetBrains/swot](https://github.com/jetbrains/swot) - Identify email addresses or domains names that belong to colleges or universities. Help automate the process of approving or rejecting academic discounts.
* [robfletcher/midcentury-ipsum](https://github.com/robfletcher/midcentury-ipsum) - Swingin’ filler text for your jet-age web page.
* [robfletcher/lazybones-kotlin](https://github.com/robfletcher/lazybones-kotlin) - The Lazybones app migrated to Kotlin as a learning exercise.
* [wangjiegulu/KotlinAndroidSample](https://github.com/wangjiegulu/KotlinAndroidSample) - Android sample with kotlin.
* [dodyg/Kotlin101](https://github.com/dodyg/Kotlin101) - 101 examples for Kotlin Programming language.
* [dkandalov/kotlin-99](https://github.com/dkandalov/kotlin-99) - Solve 99 problems with Kotlin!
* [dkandalov/rosettacode-kotlin](https://github.com/dkandalov/rosettacode-kotlin) - Repository with source code from [RosettaCode](http://rosettacode.org/)
* [vicboma1/Kotlin-Koans](https://github.com/vicboma1/Kotlin-Koans) - hese are the simple solutions of the kotlin koans online with intellij project.
* [vicboma1/GettingStartedKotlin](https://github.com/vicboma1/GettingStartedKotlin) - Learn the basics of getting started with kotlin.
* [vicboma1/Kotlin-Examples-Problems](https://github.com/vicboma1/Kotlin-Examples-Problems) - These are the simple solutions of the kotlin example problems online.
* [pakoito/FunctionalAndroidReference](https://github.com/pakoito/FunctionalAndroidReference) - A different Android app showcasing Functional Reactive Programming.
* [bmaslakov/kotlin-algorithm-club](https://github.com/bmaslakov/kotlin-algorithm-club) - Classic algorithms and data structures in Kotlin.
* [gyulavoros/kotlin-todomvc](https://github.com/gyulavoros/kotlin-todomvc) - Kotlin TodoMVC – full-stack Kotlin application demo

### <a name="projects-idea-plugins"></a>Idea Plugins <sup>[Back ⇈](#projects-idea-plugins-subcategory)</sup>
* [Vektah/CodeGlance](https://github.com/Vektah/CodeGlance) - Intelij IDEA plugin for displaying a code mini-map similar to the one found in Sublime.
* [intellij-rust/intellij-rust](https://github.com/intellij-rust/intellij-rust) - Rust IDE built using the IntelliJ Platform.
* [dkandalov/activity-tracker](https://github.com/dkandalov/activity-tracker) - Plugin for IntelliJ IDEs to track and record user activity.


## <a name="android"></a>Android <sup>[Back ⇈](#android-category)</sup>
### <a name="android-libraries"></a>Libraries <sup>[Back ⇈](#android-libraries-subcategory)</sup>
* [Kotlin/anko](https://github.com/Kotlin/anko) - Pleasant Android application development.
* [JakeWharton/kotterknife](https://github.com/JakeWharton/kotterknife) - View injection library for Android.
* [MarcinMoskala/ActivityStarter](https://github.com/MarcinMoskala/ActivityStarter) - Activity starter generator and arguments injection library for Android.
* [MarcinMoskala/KotlinPreferences](https://github.com/MarcinMoskala/KotlinPreferences) - Kotlin Android Library, that makes preference usage in Kotlin simple and fun.
* [MarcinMoskala/PreferenceHolder](https://github.com/MarcinMoskala/PreferenceHolder) - Kotlin Android Library, that makes preference usage in Kotlin simple and fun using object with fields binded to SharedPreferences.
* [nsk-mironov/kotlin-jetpack](https://github.com/nsk-mironov/kotlin-jetpack) - A collection of useful extension methods for Android.
* [pawegio/KAndroid](https://github.com/pawegio/KAndroid) - Kotlin library for Android providing useful extensions to eliminate boilerplate code.
* [chibatching/Kotpref](https://github.com/chibatching/Kotpref) - Android SharedPreference delegation for Kotlin.
* [TouK/bubble](https://github.com/TouK/bubble) - Library for obtaining screen orientation when orientation is blocked in AndroidManifest.
* [ragunathjawahar/kaffeine](https://github.com/ragunathjawahar/kaffeine) - Kaffeine is a Kotlin-flavored Android library for accelerating development.
* [mcxiaoke/kotlin-koi](https://github.com/mcxiaoke/kotlin-koi) - Koi, a lightweight kotlin library for Android Development.
* [BennyWang/KBinding](https://github.com/BennyWang/KBinding) - Android View Model binding framework write in kotlin, base on anko, simple but powerful.
* [inaka/KillerTask](https://github.com/inaka/KillerTask) -  Android AsyncTask wrapper library, written in Kotlin.
* [grandstaish/paperparcel](https://github.com/grandstaish/paperparcel) - Boilerplate reduction library written specifically for working with Kotlin data classes on Android.
* [andre-artus/AnvilKotlin](https://github.com/andre-artus/AnvilKotlin) - Minimal UI library for Android inspired by React.
* [mathcamp/fiberglass](https://github.com/mathcamp/fiberglass) - Easy lightweight SharedPreferences library for Android in Kotlin using delegated properties.
* [nitrico/LastAdapter](https://github.com/nitrico/LastAdapter) - Don't write a RecyclerView adapter again. Not even a ViewHolder!.
* [denisidoro/krouter](https://github.com/denisidoro/krouter) - A lightweight Android activity router.
* [metalabdesign/AsyncAwait](https://github.com/metalabdesign/AsyncAwait) - async/await for Android built upon coroutines introduced in Kotlin 1.1.
* [jupf/staticlog](https://github.com/jupf/staticlog) - StaticLog - super lightweight static logging for Kotlin, Java and Android.
* [zserge/anvil](https://github.com/zserge/anvil) - Minimal UI library for Android inspired by React.
* [DanielMartinus/Stepper-Touch](https://github.com/DanielMartinus/Stepper-Touch) - Fun playful Android stepper widget for counting, written in Kotlin.
* [GlimpseFramework/glimpse-framework-android](https://github.com/GlimpseFramework/glimpse-framework-android) - OpenGL made simple.
* [infotech-group/android-drawable-dsl](https://github.com/infotech-group/android-drawable-dsl) - DSL for constructing the drawables in Kotlin instead of in XML.
* [zsmb13/MaterialDrawerKt](https://github.com/zsmb13/MaterialDrawerKt) - A DSL for creating Material Design navigation drawers without any XML.
* [SnowdreamFramework/ToyBricks](https://github.com/SnowdreamFramework/ToyBricks) - Android Library that provide simpler way to achieve modularity.
* [DanielMartinus/Konfetti](https://github.com/DanielMartinus/Konfetti) - Lightweight particle system to create realistic confetti
* [rahulchowdhury/Mystique](https://github.com/rahulchowdhury/Mystique) - A generalized adapter for RecyclerView on Android which makes it easy to add heterogeneous items to a list.
* [calintat/alps](https://github.com/calintat/alps) - Android library for preferences which includes property delegates and a custom DSL for definining preferences.
* [costular/kotlin-android-utils](https://github.com/costular/kotlin-android-utils) - Android utilities for easier and faster Kotlin programming.
* [rakshakhegde/ObservableFlow](https://github.com/rakshakhegde/ObservableFlow) - Functional Constructs for Databinding + Kotlin + RxJava
* [programmerr47/ganalytics](https://github.com/programmerr47/ganalytics) - A tiny api layer for any analytics in application.

### <a name="android-frameworks"></a>Frameworks <sup>[Back ⇈](#android-frameworks-subcategory)</sup>
* [nekocode/kotgo](https://github.com/nekocode/kotgo) - An android development framwork on kotlin using MVP architecture.
* [lightningkite/kotlin-core](https://github.com/lightningkite/kotlin-core) - A full framework for making Android apps. Based on Anko and Kotson.
* [codenameone/CodenameOne](https://github.com/codenameone/CodenameOne) - Open source cross platform mobile development framework that offers write once run anywhere native development for iOS (iPhone/iPad), Android, Windows & more using Kotlin & Java

### <a name="android-projects"></a>Projects <sup>[Back ⇈](#android-projects-subcategory)</sup>
* [antoniolg/Bandhook-Kotlin](https://github.com/antoniolg/Bandhook-Kotlin) - A showcase music app for Android entirely written using Kotlin language.
* [antoniolg/Kotlin-for-Android-Developers](https://github.com/antoniolg/Kotlin-for-Android-Developers) - Companion App for the book "Kotlin Android Developers".
* [damianpetla/kotlin-dagger-example](https://github.com/damianpetla/kotlin-dagger-example) - Example of Android project showing integration with Kotlin and Dagger 2.
* [dodyg/AndroidRivers](https://github.com/dodyg/AndroidRivers) - RSS Readers for Android.
* [MakinGiants/banjen](https://github.com/MakinGiants/banjen) - Android app to help to tune a banjo.
* [inaka/kotlillon](https://github.com/inaka/kotlillon) - Android Kotlin Examples.
* [MakinGiants/todayhistory](https://github.com/MakinGiants/todayhistory) - App that shows what happened today in history.
* [RxKotlin/Pocket](https://github.com/RxKotlin/Pocket) - This app help user to save links easily, and can export to Evernote as weekly.
* [SidneyXu/AndroidDemoIn4Languages](https://github.com/SidneyXu/AndroidDemoIn4Languages) - Comparison between Java, Groovy, Scala, Kotlin in Android Development.
* [inorichi/tachiyomi](https://github.com/inorichi/tachiyomi) -  Free and open source manga reader for Android.
* [ziggy42/Blum-kotlin](https://github.com/ziggy42/Blum-kotlin) - A simple android Twitter client written in Kotlin
* [TwidereProject/Twidere-Android](https://github.com/TwidereProject/Twidere-Android) - Material Design ready and feature rich Twitter app for Android 4.0+
* [SimpleMobileTools/Simple-Calendar](https://github.com/SimpleMobileTools/Simple-Calendar) - A simple calendar with events, customizable widget and no ads.
* [SimpleMobileTools/Simple-Camera](https://github.com/SimpleMobileTools/Simple-Camera) - A camera with flash, zoom and no ads.
* [SimpleMobileTools/Simple-Draw](https://github.com/SimpleMobileTools/Simple-Draw) - A canvas you can draw on with different colors.
* [SimpleMobileTools/Simple-File-Manager](https://github.com/SimpleMobileTools/Simple-File-Manager) - A simple file manager for browsing and editing files and directories.
* [SimpleMobileTools/Simple-Gallery](https://github.com/SimpleMobileTools/Simple-Gallery) - A gallery for viewing photos and videos without ads.
* [SimpleMobileTools/Simple-Notes](https://github.com/SimpleMobileTools/Simple-Notes) - A simple textfield for adding quick notes without ads.
* [ahong222/happy21](https://github.com/ahong222/happy21) - A simple game of Black-Jack write with kotlin
* [AllanWang/KAU](https://github.com/AllanWang/KAU) - An extensive collection of Kotlin Android Utils

### <a name="android-extensions"></a>Extensions <sup>[Back ⇈](#android-extensions-subcategory)</sup>
* [ajalt/timberkt](https://github.com/ajalt/timberkt) - Easy Android logging with Kotlin and Timber.

### <a name="android-tools"></a>Tools <sup>[Back ⇈](#android-tools-subcategory)</sup>
* [kiruto/debug-bottle](https://github.com/kiruto/debug-bottle) - Debug Bottle is an Android runtime debug / develop tools written using kotlin language.


## <a name="kotlin-javascript"></a>Kotlin JavaScript <sup>[Back ⇈](#kotlin-javascript-category)</sup>
### <a name="kotlin-javascript-javascript"></a>JavaScript <sup>[Back ⇈](#kotlin-javascript-javascript-subcategory)</sup>
* [andrewoma/reakt](https://github.com/andrewoma/reakt) - Reakt is a Kotlin wrapper for facebook's React library.
* [pixijs/pixi-native](https://github.com/pixijs/pixi-native) - The aim of this project is to provide a fast lightweight 2D library that works across all devices.
* [shafirov/klogging](https://github.com/shafirov/klogging) - Kotlin logging, both js and jvm.
* [stangls/kotlin-js-jquery](https://github.com/stangls/kotlin-js-jquery) - A small framework for writing client -side web -applications in Kotlin.
* [Kotlin/kotlin-fullstack-sample](https://github.com/Kotlin/kotlin-fullstack-sample) - Kotlin Full-stack Application Example.
* [danfma/kodando](https://github.com/danfma/kodando) - Kotlin JS bindings and libraries.
* [kengorab/kotlin-javascript-boilerplate](https://github.com/kengorab/kotlin-javascript-boilerplate) - An extremely barebones boilerplate project for compiling Kotlin to Javascript.

### <a name="kotlin-javascript-frontend"></a>Frontend <sup>[Back ⇈](#kotlin-javascript-frontend-subcategory)</sup>
* [olegcherr/Aza-Kotlin-CSS](https://github.com/olegcherr/Aza-Kotlin-CSS) - Kotlin DSL for CSS

### <a name="kotlin-javascript-game-development"></a>Game Development <sup>[Back ⇈](#kotlin-javascript-game-development-subcategory)</sup>
* [perses-games/kudens](https://github.com/perses-games/kudens) - Develop browser games in Kotlin

### <a name="kotlin-javascript-build-tools"></a>Build Tools <sup>[Back ⇈](#kotlin-javascript-build-tools-subcategory)</sup>
* [Kotlin/kotlin-frontend-plugin](https://github.com/Kotlin/kotlin-frontend-plugin) - Gradle Kotlin plugin for frontend development.
* [huston007/kotlin-loader](https://github.com/huston007/kotlin-loader) - Kotlin webpack loader.

### <a name="kotlin-javascript-integration"></a>Integration <sup>[Back ⇈](#kotlin-javascript-integration-subcategory)</sup>
* [kotlin/ts2kt](https://github.com/kotlin/ts2kt) - Converter of TypeScript definition files to Kotlin declarations (stubs).


## <a name="kotlin-native"></a>Kotlin Native <sup>[Back ⇈](#kotlin-native-category)</sup>
### <a name="kotlin-native-projects"></a>Projects <sup>[Back ⇈](#kotlin-native-projects-subcategory)</sup>
* [JetBrains/kotlin-native](https://github.com/JetBrains/kotlin-native) - Kotlin/Native is a LLVM backend for the Kotlin compiler, runtime implementation and native code generation facility using LLVM toolchain.
* [perses-games/konan-sfml](https://github.com/perses-games/konan-sfml) - Kotlin native with SFML example

