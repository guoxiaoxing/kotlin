package com.guoxiaoxing.kotlin.demo._02_method


/***************************************** 顶层函数与属性 ************************************************/

/**
 * 顶层函数，可以直接导包然后使用
 */
val topProperty = "I am a top property"

/**
 * 顶层函数，可以直接导包然后使用
 */
fun topMethod(property: String) {
    println("I am a top method")
}

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 上午10:12
 */
class Method {

    /******************************************* 函数 **************************************************/

    /**
     * 函数
     */
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    /**
     * 函数可以带默认参数
     */
    @JvmOverloads
    fun maxWithDefault(a: Int = 1, b: Int = 2): Int {
        return if (a > b) a else b
    }

    /**
     * vararg关键字标记了可变参数，我们可以输入任意个参数
     */
    fun maxWithVararg(vararg param: String) {
        println("You can input any param")
    }

    /***************************************** 扩展函数与属性 ************************************************/

    /**
     * 为String类添加一个扩展属性extensionProperty，这个String类可以是Kotlin、Java甚至其他任何JVM语言编写的类
     */
    val String.extensionProperty
        get() = "I am a extension property"

    /**
     * 为String类添加一个扩展函数extensionMethod()，这个String类可以是Kotlin、Java甚至其他任何JVM语言编写的类
     */
    fun String.extensionMethod() {
        println("I am a extension method")
    }


    /**
     * 使用扩展函数
     */
    fun useExtensionMethod() {
        val a = "string"
        a.extensionProperty
        a.extensionMethod()
    }

    /******************************************** 局部函数 ***************************************************/

    /**
     * 为了代码的简洁性，我们还可以定义局部函数
     */
    fun outerMethod() {
        fun innerMethod() {

        }
    }
}