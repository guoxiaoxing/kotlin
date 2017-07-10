package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/10 上午10:56
 */
class Outer {
    private val a: Int = 1

    inner class Inner {
        fun print() = a
    }
}