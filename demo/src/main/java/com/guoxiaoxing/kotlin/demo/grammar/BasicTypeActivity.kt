package com.guoxiaoxing.kotlin.demo.grammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.guoxiaoxing.kotlin.demo.R
import com.orhanobut.logger.Logger

class BasicTypeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_type)

        findViewById(R.id.btn_number).setOnClickListener(this)
        findViewById(R.id.btn_string).setOnClickListener(this)
        findViewById(R.id.btn_array).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_number -> printNumber()
            R.id.btn_string -> printString()
            R.id.btn_array -> printArray()
        }
    }

    private fun printNumber() {

        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        Logger.d(bytes)

        Logger.d("(1 shl 2) and 0x0000FF000) : " + ((1 shl 2) and 0x0000FF000))
    }

    private fun printString() {
        val text = "abc"
        Logger.d("$text.length is ${text.length}")
    }

    private fun printArray() {
        Logger.d("Array(5, {i -> (i*i).toString()}): " + Array(5, { i -> (i * i).toString() }).size)

        Logger.d("intArrayOf(1, 2, 3) : " + intArrayOf(1, 2, 3).size)
        Logger.d("byteArrayOf(1, 2, 3) : " + byteArrayOf(1, 2, 3).size)
        Logger.d("charArrayOf('1', '2', '3') : " + charArrayOf('1', '2', '3').size)
        Logger.d("shortArrayOf(1, 2, 3) : " + shortArrayOf(1, 2, 3).size)

    }
}
