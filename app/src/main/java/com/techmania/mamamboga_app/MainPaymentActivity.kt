package com.techmania.mamamboga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.techmania.mamamboga_app.CheckActivity
import com.techmania.mamamboga_app.LoginActivity
import com.techmania.mamamboga_app.R

class MainPaymentActivity : AppCompatActivity() {
    lateinit var btnCancel: Button
    lateinit var btnDone: Button
    lateinit var tillocation: TextInputLayout
    lateinit var etlocation: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_payment)
        castview()
    }

    override fun onResume() {
        super.onResume()
        btnCancel.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        btnDone.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            validateSignUp()
            clearErrors()
        }

    }

    fun castview() {
        btnCancel = findViewById(R.id.btnCancel)
        btnDone = findViewById(R.id.btnDone)
        tillocation = findViewById(R.id.tillocation)
        etlocation = findViewById(R.id.etlocation)
    }

    fun validateSignUp() {
        val firstName = etlocation.text.toString()

        var error = false
        if (firstName.isBlank()) {
            etlocation.error = "First name is required"
            error = true
        }
        Toast.makeText(this, "Thank you For Ordering ", Toast.LENGTH_LONG).show()
        val intent = Intent(this, CheckActivity::class.java)
        startActivity(intent)

    }
    private fun clearErrors() {
        etlocation.error = null
    }
}






