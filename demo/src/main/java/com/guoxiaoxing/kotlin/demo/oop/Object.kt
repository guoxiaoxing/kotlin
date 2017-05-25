package com.guoxiaoxing.kotlin.demo.oop

import com.orhanobut.logger.Logger

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 上午11:24
 */
class Object {

    fun foo() {
        val addHoc = object {
            var x: Int = 0
            var y: Int = 0
        }
        Logger.d(addHoc.x + addHoc.y)
    }
}