package com.guoxiaoxing.kotlin.demo._01_expression

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/19 上午11:29
 */
class Rectangle(val height: Int, val width: Int) {

    val isSqure: Boolean
        get() = height == width

}