package com.guoxiaoxing.kotlin.demo.grammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.guoxiaoxing.kotlin.demo.R

class MethodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_method)
    }

    fun sum(a: Int, b: Int) = a + b
}
