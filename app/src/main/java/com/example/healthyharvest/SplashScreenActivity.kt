package com.example.healthyharvest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            val welcomeToast = Toast.makeText(applicationContext, "Harvesting Welcomes you ✨", Toast.LENGTH_SHORT)
            welcomeToast.show()
            startActivity(intent)
            finish()
        }, 2000)
    }
}