package com.example.alphabet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.hello_text_View)
        val evenButton: Button = findViewById(R.id.button_even_alphabet)
        val evenTextView: TextView = findViewById(R.id.even_text_view)
        val oddButton: Button = findViewById(R.id.button_odd_alphabet)
        val oddTextView: TextView = findViewById(R.id.odd_text_view)
        val alphabet = ('a'..'z').toList()

        evenButton.setOnClickListener {
            val alphabetEven = alphabet.slice(0..25 step 2)
            evenTextView.text = alphabetEven.toString()

        }

        oddButton.setOnClickListener {
            val alphabetOdd = alphabet.slice(1..25 step 2)
            oddTextView.text = alphabetOdd.toString()
        }

    }

}