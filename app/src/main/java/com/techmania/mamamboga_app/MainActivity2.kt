package com.techmania.mamamboga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.techmania.mamamboga_app.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()
    }
    override fun onResume() {
        super.onResume()
        binding.tvCheck.setOnClickListener {
            var OrderActivity = Unit
            val intent=Intent(this,OrderActivity::class.java)
            startActivity(intent)
        }
    }
    private fun castView() {
        binding.tvCheck
    }
}









