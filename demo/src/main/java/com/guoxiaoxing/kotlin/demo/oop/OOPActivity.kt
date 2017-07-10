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
        findViewById(R.id.btn_oop_destruction).setOnClickListener(this)
        findViewById(R.id.btn_oop_enum).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_oop_data_class -> printDataClass()
            R.id.btn_oop_destruction -> printComponent()
            R.id.btn_oop_enum -> printEnumClass()
        }
    }

    fun printDataClass() {
        val model = Model("LiLei", 20)
        val (name, age) = model
        val newModel = model.copy(age = 25)

        Logger.d("model.toString(): " + model.toString())
        Logger.d("name: " + name)
        Logger.d("age: " + age)
        Logger.d("newModel.toString(): " + newModel.toString())
    }

    fun printEnumClass() {
        val color = Color.BLUE
        Logger.d("Color.values(): " + Color.values())
        Logger.d("Color.valueOf(\"RED\"): " + Color.valueOf("RED"))
        Logger.d("color: " + color)
        Logger.d("color.name: " + color.name)
        Logger.d("color.name: " + color.ordinal)
    }

    fun printComponent() {
        val teacher = Teacher("LiLei", 20)
        val (name, age) = teacher
        Logger.d("name: " + name)
        Logger.d("age: " + age)
    }
}

