package com.bharathikasi.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView

class MainActivity : AppCompatActivity() {
    private lateinit var  lDiceInfo:AppCompatImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lRollBtn = findViewById<AppCompatButton>(R.id.RollBtn)
         lDiceInfo = findViewById<AppCompatImageView>(R.id.DiceIv)
        lRollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val lRandomNo = java.util.Random().nextInt(6)+1
        val lDrawable = when(lRandomNo){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        lDiceInfo.setImageResource(lDrawable)
    }
}