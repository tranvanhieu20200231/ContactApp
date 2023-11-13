package com.example.w6_kotlin_listview

import java.io.Serializable

class ItemData(
    var id: Int,
    val name: String,
    val phoneNumber: String,
    val email: String,
) : Serializable {

}