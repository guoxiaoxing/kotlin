package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/9 下午3:39
 */
class Property{

    var a: String
        get() = a
        set(value) {
            a = value
        }

    val b: Int = 1

    lateinit var name: String

    constructor(name: String){
        this.name = name
    }

}