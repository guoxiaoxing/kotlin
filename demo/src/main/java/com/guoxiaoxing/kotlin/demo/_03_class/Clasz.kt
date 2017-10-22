package com.guoxiaoxing.kotlin.demo._03_class

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/22 上午11:58
 */
class Clasz(val name: String) : BaseClass(), BaseInterface {

    private var outerProperty = "I am a outer property"

    /**************************************** 构造方法与初始化 *********************************************/

    init {
        //TODO 初始化类，在类创建时被调用
    }

    override fun implementInterface() {
        TODO("not implemented")
    }

    override fun useAbstractClass() {
        TODO("not implemented")
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
}
