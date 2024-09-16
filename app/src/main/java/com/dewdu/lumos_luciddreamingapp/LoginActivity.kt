package com.dewdu.lumos_luciddreamingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerButton = findViewById<Button>(R.id.buttonRegister)

        // Set up a click listener for the register button
        registerButton.setOnClickListener {
            // Create an intent to navigate to SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Find the button and set up the click listener
        val loginButton: Button = findViewById(R.id.buttonLogin)
        loginButton.setOnClickListener {
            // Create an intent to start MainUIActivity
            val intent = Intent(this, MainUIActivity::class.java)
            startActivity(intent)
        }
    }
}
