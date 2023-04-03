package com.example.toasterlib

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.MainActivity2

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//          ToastCustom.s(this,"sdfjsfdds")
//        ToastCustom.s(this,"sdkjhfdshgod")
        val myView: Button = findViewById(R.id.bbbbb) as Button

        myView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

    }
}