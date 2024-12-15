package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.btnLogin)
        loginButton.setOnClickListener {
            // Navigate to the HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

