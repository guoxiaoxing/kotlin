package com.guoxiaoxing.kotlin.demo._01_expression

import com.orhanobut.logger.Logger

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 上午10:12
 */
class Expression {

    /******************************************* 控制表达式 **************************************************/

    fun printControl() {

        val a = 1
        val b = 2

        val ifResult = if (a > b) a else b

        val whenResult = when (a > b) {
            true -> a
            else -> b
        }

        val number = try {
            Integer.parseInt("1")
        } catch (e: NumberFormatException) {
            null
        }


        for (i: Int in 1..100) {
            Logger.d(i)
        }
    }

    /******************************************* 中缀调用 **************************************************/

    /**
     * 用infix定义一个中缀函数
     */
    infix fun Int.shl(x: Int) {
        println("I am a infix method")
    }

    /**
     * 中缀调用
     */
    fun useInfixMethod() {
        1 shl 2
    }
}