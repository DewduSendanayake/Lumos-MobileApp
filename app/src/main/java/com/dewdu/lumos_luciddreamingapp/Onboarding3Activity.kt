package com.dewdu.lumos_luciddreamingapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class Onboarding3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        // Find the button by its ID
        val buttonStart: Button = findViewById(R.id.buttonStart)

        // Set an OnClickListener on the button
        buttonStart.setOnClickListener {
            // Start the LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
