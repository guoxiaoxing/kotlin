package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/10 上午11:36
 */
enum class State {

    ERROR {
        override fun signal() = ERROR
    },

    WARN {
        override fun signal() = WARN
    };

    abstract fun signal(): State
}