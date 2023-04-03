package com.example.mylibrary

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val med: Button = findViewById(R.id.med) as Button
        val accindent: Button = findViewById(R.id.accident) as Button
        val security: Button = findViewById(R.id.Security) as Button
        med.setOnClickListener {
            Toast.makeText(this,"Medical call",Toast.LENGTH_SHORT).show()
        }
        accindent.setOnClickListener {
            Toast.makeText(this,"Accident call",Toast.LENGTH_SHORT).show()

        }
        security.setOnClickListener {
            Toast.makeText(this,"Security",Toast.LENGTH_SHORT).show()

        }

    }
}