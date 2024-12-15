package com.example.loginpage // Make sure this matches your package name

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)  // This links to the splash layout (activity_splash.xml)

        // Handler to delay the transition to the login page
        Handler().postDelayed({
            // After 2 seconds, navigate to the login screen (MainActivity)
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finish SplashActivity so the user can't return to it
        }, 2000)  // Delay of 2 seconds
    }
}
