package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        // Handle window insets (optional for UI adjustments)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.landing)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set a click listener on the root layout (ConstraintLayout) to navigate to the onboarding screen
        findViewById<View>(R.id.landing).setOnClickListener {
            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
        }
    }
}
