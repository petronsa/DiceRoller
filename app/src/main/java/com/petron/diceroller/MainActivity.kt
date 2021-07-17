package com.petron.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener { rollDice() }
        //result_text.text = "Dice Roller"

    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image.setImageResource(drawableResource)
/*
        val randomInt = (1..6).random()
        result_text.text = randomInt.toString()

 */


    /*
        // Crea un toast
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()

 */

    }
}