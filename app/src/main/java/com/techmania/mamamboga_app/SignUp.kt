package com.techmania.mamamboga_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.techmania.mamamboga_app.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitysignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnSign.setOnClickListener {
            validateSignUp()
            clearErrors()

        }

    }

    fun validateSignUp() {
        val firstName = binding.etFullName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmPassword = binding.etConfirm.text.toString()
        var error = false
        if (firstName.isBlank()) {
            binding.tilFullName.error = "First name is required"
            error = true
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            error = true
        }
        if (confirmPassword.isBlank()) {
            binding.tilConfirmPassword.error = "Confirm password is required"
            error = true
        }
        if (password != confirmPassword) {
            binding.tilConfirmPassword.error = "Passwords do not match"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "$firstName $email", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ButtonActivity::class.java)
            startActivity(intent)
        }
    }

    private fun clearErrors() {
        binding.tilFullName.error = null
        binding.tilEmail.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }
}
