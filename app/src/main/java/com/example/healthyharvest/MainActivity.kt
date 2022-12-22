package com.example.healthyharvest

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide action bar
        supportActionBar?.hide()

        Snackbar.make(findViewById(R.id.main_home), "Harvesting Welcomes you ✨", Toast.LENGTH_SHORT).show()

        val fabNextToSeason = findViewById<FloatingActionButton>(R.id.fab_next_to_season)
        fabNextToSeason.setOnClickListener {
            startActivity(Intent(this,SeasonSelection::class.java))
        }
    }
}