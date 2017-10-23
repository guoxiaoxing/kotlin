package com.guoxiaoxing.kotlin.demo._06_type

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/10/23 下午6:19
 */
class Type {


    fun useType() {
        //定义一个可空类型
        val str1: String? = null

        //用安全调用运算符进行调用
        str1?.length

        //Elvis运算符?:，用来代替null的默认值，这里表示如果str1为null，则将""赋值给str2
        val str2: String = str1 ?: ""

        //as?进行类型转换，如果不是合适的类型，会返回一个null
        str1 as? Int

        //非空断言将可控类型转换为非空类型
        str1!!.length

        //如果我们想要将一个可空类型的参数传给一个只接受非空类型的函数，需要进行显式的null判断
        if(str1 != null){
            useNotNull(str1)
        }

        //当然我们也可以用let表达式来处理这种情况，只有str不为null时，后面的函数才会被执行
        str1?.let { str1 -> useNotNull(str1) }


    }

    fun useNotNull(param: String) {
        println("I do not use null param")
    }
}