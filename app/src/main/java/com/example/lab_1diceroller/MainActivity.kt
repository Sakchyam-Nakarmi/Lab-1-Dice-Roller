package com.example.lab_1diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn :Button = findViewById(R.id.button)
        val txt1:TextView = findViewById(R.id.textView)
        val txt2:TextView = findViewById(R.id.textView2)
        btn.setOnClickListener{
            val diceNum = (1..6).random()
            txt1.text= "" + diceNum
            val diceNum2 = (1..6).random()
            txt2.text = ""+diceNum2
        }
    }
}