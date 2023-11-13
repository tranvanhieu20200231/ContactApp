package com.example.w6_kotlin_listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView

class CustomAdapter(val activity: Activity, val list:List<ItemData>): ArrayAdapter<ItemData>(activity,R.layout.list_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexts = activity.layoutInflater   //layoutInflater laf 1 component, chuyen layout xml thanh view trong layout
        val rowView = contexts.inflate(R.layout.list_item,parent, false)

//        val sender = rowView.findViewById<TextView>(R.id.sender)
        val name = rowView.findViewById<TextView>(R.id.nameContact)
        val symbol = rowView.findViewById<TextView>(R.id.symbol)
//        sender.text = list[position].sender
        name.text = list[position].name
        symbol.text = list[position].name.first().toString()
        return rowView
    }
}