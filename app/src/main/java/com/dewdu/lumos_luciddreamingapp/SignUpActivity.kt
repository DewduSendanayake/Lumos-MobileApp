package com.dewdu.lumos_luciddreamingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpButton = findViewById<Button>(R.id.buttonRegister)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)

        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform sign-up logic here, e.g., validate inputs, save user data, etc.
            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Sign-Up Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Find the Login Here button
        val loginHereButton = findViewById<Button>(R.id.buttonLoginHere)

        // Set up a click listener for the Login Here button
        loginHereButton.setOnClickListener {
            // Create an intent to navigate to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
