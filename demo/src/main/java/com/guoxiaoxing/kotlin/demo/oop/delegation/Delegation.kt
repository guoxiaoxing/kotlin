package com.guoxiaoxing.kotlin.demo.oop.delegation

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 下午2:03
 */

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {

    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    var b = BaseImpl(10)
    Derived(b).print()
}