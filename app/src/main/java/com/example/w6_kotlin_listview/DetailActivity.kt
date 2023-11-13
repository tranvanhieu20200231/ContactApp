package com.example.w6_kotlin_listview

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_detail)

        //val contact = intent.getSerializableExtra("contact") as ItemData
        val id_item = intent.getIntExtra("id", 0)
        val name_item = intent.getStringExtra("name")
        val phone_item = intent.getStringExtra("phone")
        val email_item = intent.getStringExtra("email")

        val id = findViewById<TextView>(R.id.id)
        id.text = "${id_item.toString()}"
        val name = findViewById<TextView>(R.id.name)
        name.text =  "${name_item}"
        val phone = findViewById<TextView>(R.id.phonenumber)
        phone.text = "${phone_item}"
        val email = findViewById<TextView>(R.id.email)
        email.text = "${email_item}"
    }
}