package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        // Find the button and set up the click listener
        val nextButton: Button = findViewById(R.id.buttonStart)
        nextButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, Onboarding3Activity::class.java)
            startActivity(intent)
        }

        // Find the button and set up the click listener
        val skipButton: Button = findViewById(R.id.buttonSkip)
        skipButton.setOnClickListener {
            // Create an intent to start Onboarding2Activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}