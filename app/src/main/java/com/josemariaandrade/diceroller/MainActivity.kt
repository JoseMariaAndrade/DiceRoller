package com.josemariaandrade.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.josemariaandrade.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        println(diceRoll)
        when (diceRoll){
            1 -> binding.imageView.setImageResource(R.drawable.dice_1)
            2 -> binding.imageView.setImageResource(R.drawable.dice_2)
            3 -> binding.imageView.setImageResource(R.drawable.dice_3)
            4 -> binding.imageView.setImageResource(R.drawable.dice_4)
            5 -> binding.imageView.setImageResource(R.drawable.dice_5)
            6 -> binding.imageView.setImageResource(R.drawable.dice_6)
        }

    }
}

class Dice( val  numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}