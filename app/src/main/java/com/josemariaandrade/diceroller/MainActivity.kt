package com.josemariaandrade.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
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

//        viewModel

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

    private fun rollDice() {
        binding.diceView1.setImageResource(getRandomDiceImage())
        binding.diceView2.setImageResource(getRandomDiceImage())
    }
}

//class Dice( val  numSides: Int) {
//
//    fun roll(): Int {
//        return (1..numSides).random()
//    }
//}