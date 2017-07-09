package com.guoxiaoxing.kotlin.demo.oop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.guoxiaoxing.kotlin.demo.R
import com.orhanobut.logger.Logger

class OOPActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oop)

        findViewById(R.id.btn_oop_data_class).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_oop_data_class -> printDataClass()
        }
    }

    fun printDataClass() {
        val model = Model("LiLie", 20)
        Logger.d(model.toString())
    }
}
