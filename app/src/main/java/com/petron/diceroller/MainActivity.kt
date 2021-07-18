package com.petron.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Para qu no este continuanmente llamando la fiew aunque aqui no se utiliza
   lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage= dice_Image

        roll_button.setOnClickListener { rollDice() }
        //result_text.text = "Dice Roller"
        clear_button.setOnClickListener { clear() }


    }
    // Opcion de borrar la imagen
    private fun clear(){
        val borrar = R.drawable.empty_dice
        diceImage.setImageResource(borrar)

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
        diceImage.setImageResource(drawableResource)

/*
    private fun rollDice() {
        dice_Image.setImageResource(getRandomDiceImage())
        dice_Image2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

 */



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