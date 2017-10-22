package com.guoxiaoxing.kotlin.demo._03_class

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 下午2:21
 */
class Singleton {

    /**
     * 单例
     */
    companion object {
        val instance by lazy { Singleton() }
    }
}