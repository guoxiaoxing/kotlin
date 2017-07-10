package com.guoxiaoxing.kotlin.demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.guoxiaoxing.kotlin.demo.grammar.GrammarActivity
import com.guoxiaoxing.kotlin.demo.oop.OOPActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btn_grammar).setOnClickListener(this)
        findViewById(R.id.btn_class_and_object).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_grammar -> startActivity(Intent(this@MainActivity, GrammarActivity::class.java))
            R.id.btn_class_and_object -> startActivity(Intent(this@MainActivity, OOPActivity::class.java))
        }
    }
}
