package com.example.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val  mainButton = findViewById<Button>(R.id.main_button)
        mainButton.setOnClickListener {
            Intent(this, NewActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}

