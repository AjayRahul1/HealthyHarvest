package com.example.healthyharvest

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide action bar
        supportActionBar?.hide()

        Toast.makeText(applicationContext, "Harvesting Welcomes you ✨", Toast.LENGTH_SHORT).show()

        //radio button transfers to soil selection
        val chooseAgricultureButton = findViewById<RadioGroup>(R.id.radio_buttons_choose_agriculture_as)
        chooseAgricultureButton.setOnCheckedChangeListener { radioGroup, i ->
            val professionChosen = findViewById<RadioButton>(i)
            if(professionChosen!=null){
                val soilSelectionIntent = Intent (this, SeasonSelection::class.java)
                startActivity(soilSelectionIntent)
                radioGroup.clearCheck()
            }
        }
    }
}