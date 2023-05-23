package com.techmania.mamamboga_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStart: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castview()
    }
    override fun onResume() {
        super.onResume()
        btnStart.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//
//

        }
    }
    fun castview(){
        btnStart=findViewById(R.id.btnStart)
    }

}

