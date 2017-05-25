package com.guoxiaoxing.kotlin.demo.oop

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.

 * @author guoxiaoxing
 * *
 * @since 2017/5/25 上午9:30
 */
class CustomView : View {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)
}
