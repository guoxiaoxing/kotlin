package com.guoxiaoxing.kotlin.demo.grammar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.guoxiaoxing.kotlin.demo.R
import com.orhanobut.logger.Logger

class ControlActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_control_when -> printWhen()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        findViewById(R.id.btn_control_when).setOnClickListener(this)
    }

    private fun printWhen() {
        val i = 10
        when (i) {
            2 -> Logger.d(2)
            10 -> Logger.d(10)
        }
    }
}
