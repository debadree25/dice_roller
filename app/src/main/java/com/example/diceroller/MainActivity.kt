package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView;
    private lateinit var rollResult: TextView;
    private lateinit var rollButton: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        rollResult = findViewById(R.id.result_text)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        var num: Int = java.util.Random().nextInt(6) + 1
        var draw = when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(draw)
        rollResult.text = (num).toString()
    }
}