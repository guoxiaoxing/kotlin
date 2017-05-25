package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.

 * @author guoxiaoxing
 * *
 * @since 2017/5/24 下午4:31
 */
open class Person {

    open val name : String = ""

    constructor(name: String)

    constructor(name: String, age: Int) : this(name)

    open fun say(){

        var data = DataClass("jack", 25)
        data.copy(age = 20)
    }


}
