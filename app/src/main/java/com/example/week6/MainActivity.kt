package com.example.week6

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recyclerView : RecyclerView? = null

    var foodMenuText = arrayOf("นมชมพู",
        "นมสดน้ำผึ้ง",
        "แอปเปิ้ลโซดา",
        "บลูมิ้นท์",
        "บลูฮาวาย",
        "ลาเต้",
        "อิตาเลี่ยนโซดา",
        "ไวท์ช็อค",
        "ชาเขียว",
        "โกโก้",
        "กาแฟ",
        "ชามะนาว",
        "ชาเย็น"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.d1,
        R.drawable.d2,
        R.drawable.d3,
        R.drawable.d4,
        R.drawable.d5,
        R.drawable.d6,
        R.drawable.d7,
        R.drawable.d8,
        R.drawable.d9,
        R.drawable.d10,
        R.drawable.d11,
        R.drawable.d12,
        R.drawable.d13
    )
    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.menuRecycleview) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdepter = MyAdepter(foodMenuText,foodMenuImage,context)
        recyclerView!!.setAdapter(myAdepter)
    }
}
