package com.guoxiaoxing.kotlin.demo.oop

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/5/25 上午9:53
 */
abstract class AbsPerson {

    var inferredTYpe = 2

    val isEmpty: Boolean
        get() = false

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            value.substring(0, 3)
        }

    var setterVisibility: String = "abc"
        private set

    var setterWithAnnotation: Any? = null
//    @Inject set


    var counter = 0
    set(value) {
        if(value > 0){
            field = value
        }
    }


    abstract fun say()
}