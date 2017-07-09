package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.

 * @author guoxiaoxing
 * *
 * @since 2017/7/9 下午3:12
 */
class Teacher(name: String) : Person(name), IBehavior {

    override val age: Int
        get() = super.age

    override fun talk() {
        super<Person>.talk()
        super<IBehavior>.talk()
    }
}
