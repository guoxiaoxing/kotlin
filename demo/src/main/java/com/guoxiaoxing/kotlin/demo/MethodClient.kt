package com.guoxiaoxing.kotlin.demo

import com.guoxiaoxing.kotlin.demo._02_method.topMethod
import com.guoxiaoxing.kotlin.demo._02_method.topProperty

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 上午10:25
 */
object MethodClient {

    @JvmStatic
    fun main(args: Array<String>) {
        topMethod(topProperty)
    }
}
