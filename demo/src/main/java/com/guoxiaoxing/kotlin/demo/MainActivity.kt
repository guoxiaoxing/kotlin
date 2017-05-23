package com.guoxiaoxing.kotlin.demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btn_basic_type).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }
}
