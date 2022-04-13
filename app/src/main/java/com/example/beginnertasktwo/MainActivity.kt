package com.example.beginnertasktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click : Button = findViewById(R.id.button)

        click.setOnClickListener {
            Toast.makeText(this,"Random text has been generated", Toast.LENGTH_SHORT).show()
            randomText()
        }

    }

    private fun randomText() {
        val attitude = listOf("Hardworking","Lazy","Somewhat Lazy","Very lazy","Dedicated")
        val randomString = attitude.random()
        val textResult : TextView = findViewById(R.id.randomText)
        textResult.text = randomString
    }

}