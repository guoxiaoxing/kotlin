package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 上午9:34
 */
class Teacher : Person, IPerson{

    override val name: String
        get() = super.name

    constructor(name: String) : super(name)

    override fun say() {
        super.say()
    }
}