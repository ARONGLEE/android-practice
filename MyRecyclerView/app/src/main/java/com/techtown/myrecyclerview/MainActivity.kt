package com.techtown.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        val adapter = PersonAdapter()

        adapter.items.add(Person("홍길동", "010-1234-5678"))
        adapter.items.add(Person("이아롱", "010-1234-5678"))
        adapter.items.add(Person("전지현", "010-1234-5678"))
        adapter.items.add(Person("김태리", "010-1234-5678"))
        adapter.items.add(Person("유지태", "010-1234-5678"))
        adapter.items.add(Person("유지태2", "010-1234-5678"))
        adapter.items.add(Person("유지태3", "010-1234-5678"))
        adapter.items.add(Person("유지태4", "010-1234-5678"))
        adapter.items.add(Person("유지태5", "010-1234-5678"))

        recyclerView.adapter =adapter
    }
}