package com.example.healthyharvest

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeasonSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_season_selection)

        // Action bar title changed to Getting started
        supportActionBar?.title = "Getting started!"

        val funFactsArray = arrayOf<String>(
            "More than 6000 varieties of 🍎 are grown around the world.",
            "🍌 are the number one fruit crop in the world.",
            "🐝 contribute to more than \$15 billion worth of crops every year through pollination.",
            "Technically 🍅 is a fruit.", "Not all 🍊 are 🟠 in colour.",
            "A pomegranate can hold up to 1000 seeds.",
            "Yams and sweet potatoes are not the same thing!",
            "🎃 and 🥒 are also classed as a fruit, not a vegetable."
        )

        // Generating Random facts on the season screen
        val randomFactsText = findViewById<TextView>(R.id.random_facts)
        randomFactsText.text = funFactsArray.random()

        val seasonRadioGrp = findViewById<RadioGroup>(R.id.seasonRadioGrp)
        seasonRadioGrp.setOnCheckedChangeListener { radioGroup, j ->
            val radiobuttonChecked = findViewById<RadioButton>(j)
            if(radiobuttonChecked!=null){

                // Converting Name of the ID selected
                val selectedSeasonData = radiobuttonChecked.text.toString()

                // Preparing to send the data
                val soilSelectionIntent = Intent (applicationContext, SoilSelection::class.java)

                // Sending the data with the key
                soilSelectionIntent.putExtra("seasonData_key",selectedSeasonData)
                radioGroup.clearCheck()
                startActivity(soilSelectionIntent) // data sent with going to next screen
            }
        }
    }
}