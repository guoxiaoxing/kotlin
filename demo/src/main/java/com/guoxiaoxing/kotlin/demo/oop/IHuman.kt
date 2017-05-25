package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 上午10:15
 */
interface IHuman {

    val prop: Int

    val propertyWithImplemention: String
        get() = "foo"

    fun say()
}