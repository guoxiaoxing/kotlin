package com.guoxiaoxing.kotlin.demo._03_class

import android.content.Context
import android.view.View
import android.widget.ImageView

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 上午11:58
 */
class Clasz(override val name: String) : BaseClass(), BaseInterface {

    private var outerProperty = "I am a outer property"

    /**************************************** 构造方法与初始化 *********************************************/

    init {
        //TODO 初始化类，在类创建时被调用
    }

    /**
     * 从构造函数
     *
     * 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数， 可以直接委托或者通过别
     * 的次构造函数间接委托。委托到同一个类的另一个构造函数用 this 关键字即可
     */
    constructor(name: String, age: Int) : this(name) {
        println("I am a secondary constructor")
    }

    override fun extendClass() {
        println("I override the BaseClass")
    }


    override fun implementInterface() {
        println("I implment the BaseInterface")
    }

    /**************************************** 嵌套类与内部类 ***********************************************/

    /**
     * 嵌套类，不持有外部类引用，也无法使用外部类成员变量
     */
    class nestClass() {

        fun nestMethod() {
        }
    }

    /**
     * 内部类，持有外部类引用，可以使用外部类成员变量
     */
    inner class innerClass() {

        fun nestMethod() {
            outerProperty = "I cam use outerProperty"
        }
    }

    /***************************************** 匿名内部类 **************************************************/

    fun useAnonymousInnerClass(){
//        view.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//            }
//        })
    }
}
