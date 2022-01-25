package com.techtown.myrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var items = ArrayList<Person>()
    val HEADER = 0
    val ITEM = 1
    val FOOTER = 2

    override fun getItemViewType(position: Int): Int {
        return if(position == 0){
            HEADER
        } else if(position == items.size +1){
            FOOTER
        } else {
            ITEM
        }
    }

    override fun getItemCount() = items.size +2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == ITEM) {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.person, parent, false)

            return ContentViewHolder(itemView)
        } else if(viewType == HEADER) {
            val headerView = LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false)

            return HeaderViewHolder(headerView)
        } else {
            val footerView = LayoutInflater.from(parent.context).inflate(R.layout.footer, parent, false)

            return FooterViewHolder(footerView)
        }
//
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ContentViewHolder) {
            val item = items[position - 1]
            holder.setItem(item)
        }

    }

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class FooterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var textView: TextView = itemView.findViewById<TextView>(R.id.textView)
        private var textView2: TextView = itemView.findViewById<TextView>(R.id.textView2)
        var listPerson: LinearLayout = itemView.findViewById<LinearLayout>(R.id.listPerson)
        var cb1: CheckBox = itemView.findViewById<CheckBox>(R.id.cb1)

        fun setItem(item: Person) {
            textView.text = item.name
            textView2.text = item.mobile
            listPerson.setOnClickListener {
                cb1.isChecked = !cb1.isChecked
            }
        }

    }



}