package com.example.randomizer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton = findViewById<Button>(R.id.rollButton)
        val resultsTxtView =  findViewById<TextView>(R.id.resultsTextView)
        val howManyNum =  findViewById<TextView>(R.id.howManyNum)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollbutton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress) + 1
            resultsTxtView.text = rand.toString()
        }
        
        /*seekBar.setOnClickListener{
            val num = seekBar.progress + 1
            resultsTxtView.text = num.toString()
        }*/
    }
}