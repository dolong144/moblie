package com.example.colormyview

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)
        SetListeners()
    }
    private fun SetListeners(){
        val clickableViews: List<View> = listOf(findViewById(R.id.box_one_text), findViewById(R.id.box_two_text), findViewById(R.id.box_three_text),
            findViewById(R.id.box_four_text), findViewById(R.id.box_five_text), findViewById(R.id.constraint_layout),
            findViewById(R.id.red_button), findViewById(R.id.yellow_button), findViewById(R.id.green_button))
        for(iteam in clickableViews){
            iteam.setOnClickListener { makeColored(it) }
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View){
        when (view.id) {
            R.id.box_one_text ->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text ->view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text ->view.setBackgroundColor(Color.GREEN)
            R.id.box_four_text ->view.setBackgroundColor(Color.CYAN)
            R.id.box_five_text ->view.setBackgroundColor(Color.YELLOW)
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(R.color.my_red)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(R.color.my_yellow)
            R.id.green_button ->findViewById<TextView>(R.id.box_five_text).setBackgroundColor(R.color.my_green)

        }

    }
}