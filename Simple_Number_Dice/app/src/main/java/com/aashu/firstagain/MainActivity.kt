package com.aashu.firstagain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {   //help to create app that can be used on old android also
    override fun onCreate(savedInstanceState: Bundle?) {  //oncreate means whenever app opens waht should be visible
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //show that we are inflating mainactivity with layout
        //R.layout.activity_main shows that r present in res folder and layout folder and activity_main


        //conecting button id
        val rollButton :Button = findViewById(R.id.roll_button)//button used since it is button
      //  rollButton.setOnClickListener { Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show() }
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6)+1 //if we write oly 6 then output from 0 to 5  but add 1 then 1 to 6

        resultText.text = randomInt.toString()
    }
}