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

- 01Kotlin实践指南：基础语法
- 02Kotlin实践指南：类型系统
- 03Kotlin实践指南：泛型
- 04Kotlin实践指南：注解与反射
- 05Kotlin实践指南：Lambda与高阶函数
- 06Kotlin实践指南：DSL构建

# 附录

Kotlin生态系统

>Kotlin与整个Java生态系统完全兼容，也就是说你在搜寻解决方案时，现有的Java类库完全可以被使用，除此之外，纯Kotlin的类库也在欣欣向荣的发展。

注：下方没有给出链接的是大家所熟知的各个领域的Java第三方库，而给出链接的则是由纯Kotlin实现的第三方库。

测试

- JUnit
- TestNG
- [kotlintest](https://github.com/kotlintest/kotlintest): Kotlin test framework based on the excellent Scalatest
- [spek](https://github.com/spekframework/spek): A specification framework for Kotlin
- [hamkrest](https://github.com/npryce/hamkrest): A reimplementation of Hamcrest to take advantage of Kotlin language features.
- [mockito-kotlin](https://github.com/nhaarman/mockito-kotlin): A small library that provides helper functions to work with Mockito in Kotlin.

依赖注入

- Dagger
- [Kodein](https://github.com/SalomonBrys/Kodein): Kodein is a very simple and yet very useful dependency retrieval container. it is very easy to use and configure.

序列化

- Jackson
- [jackson-module-kotlin](https://github.com/FasterXML/jackson-module-kotlin): Module that adds support for serialization/deserialization of Kotlin (http://kotlinlang.org) classes and data classes.
- Gson
- [Kotson](https://github.com/SalomonBrys/Kotson): Kotlin bindings for JSON manipulation via Gson

网络请求

- Okhttp
- Retrofit
- [Fuel](https://github.com/kittinunf/Fuel): The easiest HTTP networking library for Kotlin/Android

响应式编程

- RxJava
- RxAndroid
- [RxKotlin](https://github.com/ReactiveX/RxKotlin): RxJava bindings for Kotlin