package com.example.taiki.kotlin_test

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import butterknife.bindView

class MainActivity : AppCompatActivity() {
//    var text : TextView? = null
    val plus : Button by bindView(R.id.button)
    val minas : Button by bindView(R.id.button2)
    val kakeru : Button by bindView(R.id.button3)
    val waru : Button by bindView(R.id.button4)

    val hoge : TextView by bindView(R.id.textView)
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        text = findViewById(R.id.textView) as TextView
//        plus = findViewById(R.id.button) as Button

        plus.setOnClickListener {
            number++
            hoge.setText(Integer.toString(number))
        }
        minas.setOnClickListener {
            number=number-1
            hoge.setText(Integer.toString(number))
        }
        kakeru.setOnClickListener {
            number=number*2
            hoge.setText(Integer.toString(number))
        }
        waru.setOnClickListener {
            number=number/2
            hoge.setText(Integer.toString(number))
        }
    }

}

