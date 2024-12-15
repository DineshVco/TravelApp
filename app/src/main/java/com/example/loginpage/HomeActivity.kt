package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val userProfile = findViewById<ImageView>(R.id.ivUserProfile)
        userProfile.setOnClickListener {
            // Navigate to the user profile screen
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
