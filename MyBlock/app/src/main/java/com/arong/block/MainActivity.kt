package com.arong.block

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        normalButton.setOnClickListener {
            var person1: Person? = Person()
            person1?.name = "홍길동"
            person1?.age = 20
            person1?.mobile = "010-1234-1234"
        }

        applyButton.setOnClickListener {
            val person1 = Person().apply {
                name = "홍길동"
                age = 20
                mobile = "010-1234-1234"

                val info = toString()
                showToast("새로 만든 사람-> ${info}")
            }
       }
    }
    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}

data class Person(var name:String? = null, var age: Int? = null, var mobile:String? = null){
    override fun toString(): String {
        return "Person [${name}, ${age}, ${mobile}]"
    }
}