package com.techtown.work0120

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button4.setOnClickListener{
            val input = input1.text.toString()
            //textView8.setText("입력한 값: ${input}")
            textView8.append("${input}\n")
        }
    }
}