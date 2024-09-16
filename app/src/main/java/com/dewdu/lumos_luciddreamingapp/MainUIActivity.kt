package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainUIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_ui)

        val homeButton: Button = findViewById(R.id.Home)
        homeButton.setOnClickListener {

            val intent = Intent(this, MainUIActivity::class.java)
            startActivity(intent)
        }

        val dreamButton: Button = findViewById(R.id.dreams)
        dreamButton.setOnClickListener {

            val intent = Intent(this, DreamJournalActivity::class.java)
            startActivity(intent)
        }

        val setButton: Button = findViewById(R.id.Settings)
        setButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val userButton: Button = findViewById(R.id.User)
        userButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }


    }
}