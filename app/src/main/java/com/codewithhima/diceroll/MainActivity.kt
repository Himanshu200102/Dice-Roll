package com.codewithhima.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button);
        button.setOnClickListener {
//            val toast = Toast.makeText(this,"Dice Rolled!" , Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this , "Dice Rolled!" , Toast.LENGTH_SHORT).show()
//            val viewText : TextView = findViewById(R.id.textView);
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6);
        val rollDice = dice.roll();
//        val text : TextView=findViewById(R.id.textView);
//        text.text = rollDice.toString();
        val diceImage : ImageView = findViewById(R.id.imageView);
//        when(rollDice){
//            1 -> diceImage.setImageResource(R.drawable.dice_1);
//            2 -> diceImage.setImageResource(R.drawable.dice_2);
//            3 -> diceImage.setImageResource(R.drawable.dice_3);
//            4 -> diceImage.setImageResource(R.drawable.dice_4);
//            5 -> diceImage.setImageResource(R.drawable.dice_5);
//            6 -> diceImage.setImageResource(R.drawable.dice_6);
//        }
        val drawableResource = when (rollDice){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource);
        diceImage.contentDescription = rollDice.toString();
    }

    class Dice(val Sides : Int){
        fun roll() : Int{
            return (1..Sides).random();
        }
    }
}