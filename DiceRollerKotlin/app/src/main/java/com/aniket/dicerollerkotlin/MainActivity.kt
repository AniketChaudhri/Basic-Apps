package com.aniket.dicerollerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.diceImg)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Roll"

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(7)
//        resultText.text = randomInt.toString()

        val drawableResource = when (randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }


}