package com.techmania.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViewOrders : AppCompatActivity() {
    lateinit var btnOrder: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_orders)
        btnOrder = findViewById(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val intent = Intent(this, CustomerOrders::class.java)
            startActivity(intent)
        }
    }
}