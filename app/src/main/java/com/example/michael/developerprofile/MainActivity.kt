package com.example.michael.developerprofile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_btn)

        button.setOnClickListener {
            Toast.makeText(this,"You clicked me!", Toast.LENGTH_SHORT).show()
        }
    }
}


