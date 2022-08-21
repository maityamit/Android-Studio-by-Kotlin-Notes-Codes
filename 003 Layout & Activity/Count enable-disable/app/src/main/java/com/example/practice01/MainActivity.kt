package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text:TextView = findViewById(R.id.textview);
        val button:Button = findViewById(R.id.button);
        val toogle:ToggleButton = findViewById(R.id.tooglebutton);

        var count:Int = 0;

        button.setOnClickListener{
            count++
            text.setText("Count: $count")
        }

        toogle.setOnCheckedChangeListener { _, isChecked ->
            button.isEnabled = !isChecked
        }

    }
}