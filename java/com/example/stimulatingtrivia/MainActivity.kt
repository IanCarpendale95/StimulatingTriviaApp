package com.example.stimulatingtrivia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        start.setOnClickListener {

            if (et.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Enter your name To Begin", Toast.LENGTH_SHORT)
                        .show()
            } else {

                val intent = Intent(this@MainActivity, TriviaQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
            //This will open a secondary activity when button is clicked and the name field is entered,
            //if nothing is entered Please enter your name is displayed
        }
    }
}