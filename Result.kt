package com.example.stimulatingtrivia

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_Questions, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        score.text = "You Have Scored $correctAnswers out of $totalQuestions."

        finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}