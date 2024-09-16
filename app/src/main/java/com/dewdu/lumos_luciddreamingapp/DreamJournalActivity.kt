package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DreamJournalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dream_journal)

        val homeButton: Button = findViewById(R.id.Home)
        homeButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, MainUIActivity::class.java)
            startActivity(intent)
        }

        // Find the button and set up the click listener
        val dreamButton: Button = findViewById(R.id.dreams)
        dreamButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
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

        val NDButton: Button = findViewById(R.id.addNewButton)
        NDButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, AddDreamsActivity::class.java)
            startActivity(intent)
        }
    }
}