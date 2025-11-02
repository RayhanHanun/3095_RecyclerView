package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername:EditText = findViewById(R.id.et_email)
        val btnLogin:Button = findViewById(R.id.btn_login)
        val btnDaftar:Button = findViewById(R.id.btn_daftar)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()

            val intent = Intent(this, HomeActivity::class.java)

            intent.putExtra("EXTRA_USERNAME", username)

            startActivity(intent)
        }
        btnDaftar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)

            startActivity(intent)
        }

    }
}