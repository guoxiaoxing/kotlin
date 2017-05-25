package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 下午1:56
 */
class CompanionClass {

    companion object Factory {
        fun create(): CompanionClass = CompanionClass()
    }

    fun main() {
        CompanionClass.create()
    }
}