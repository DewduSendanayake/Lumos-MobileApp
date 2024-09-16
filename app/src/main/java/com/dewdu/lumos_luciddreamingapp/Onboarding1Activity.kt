package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Onboarding1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)


        val nextButton: Button = findViewById(R.id.buttonStart)
        nextButton.setOnClickListener {

            val intent = Intent(this, Onboarding2Activity::class.java)
            startActivity(intent)
        }


        val skipButton: Button = findViewById(R.id.buttonSkip)
        skipButton.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
