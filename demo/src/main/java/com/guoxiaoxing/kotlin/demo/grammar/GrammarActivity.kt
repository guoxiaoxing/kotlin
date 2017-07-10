package com.guoxiaoxing.kotlin.demo.grammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.guoxiaoxing.kotlin.demo.R
import com.orhanobut.logger.Logger

class GrammarActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar)

        findViewById(R.id.btn_grammar_number).setOnClickListener(this)
        findViewById(R.id.btn_grammar_string).setOnClickListener(this)
        findViewById(R.id.btn_grammar_array).setOnClickListener(this)
        findViewById(R.id.btn_grammar_method).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_grammar_number -> printNumber()
            R.id.btn_grammar_string -> printString()
            R.id.btn_grammar_array -> printArray()
            R.id.btn_grammar_method -> printMethod()
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

        val a: Int = 10000
        val boxedA1: Int? = a
        val boxedA2: Int? = a

        Logger.d("boxedA1 ==  boxedA2 " + (boxedA1 == boxedA2))
        Logger.d("boxedA1 ===  boxedA2 " + (boxedA1 === boxedA2))
    }

    private fun printString() {
        val text = "abc"
        Logger.d("$text.length is ${text.length}")

        for (c in text) {
            Logger.d(c)
        }

        Logger.d("text is $text")
        Logger.d("text is ${text.length}")
    }

    private fun printArray() {

        arrayOf(1, 2, '3')

        Logger.d("Array(5, {i -> (i*i).toString()}): " + Array(5, { i -> (i * i).toString() }).size)
        Logger.d("intArrayOf(1, 2, 3) : " + intArrayOf(1, 2, 3).size)
        Logger.d("byteArrayOf(1, 2, 3) : " + byteArrayOf(1, 2, 3).size)
        Logger.d("charArrayOf('1', '2', '3') : " + charArrayOf('1', '2', '3').size)
        Logger.d("shortArrayOf(1, 2, 3) : " + shortArrayOf(1, 2, 3).size)

        Logger.d("arrayOf(1, 2, '3')" + arrayOf(1, 2, '3'))
        Logger.d("arrayOf(1, 2, '3')" + Array(5, { i -> (i * i).toString() }))

    }

    fun sum(a: Int,
            b: String = "str",
            c: Boolean = true): String {
        return a.toString() + b.toString() + c.toString()
    }

    fun add(vararg ts: Int): Int {
        var sum = 0
        for (t in ts) {
            sum += t
        }
        return sum
    }

    fun outerMethod(a: Int) {
        val out = 10

        fun innerMethod(b: Int) {
            val inn = out + 20
        }
    }


    fun printMethod() {

        Logger.d("sum(1): " + sum(1))
        Logger.d("sum(1): " + sum(1, c = false))
        Logger.d("sum(1): " + sum(1, "newStr"))

        Logger.d("add(1, 2, 3, 4): " + add(1, 2, 3, 4))
    }
}
