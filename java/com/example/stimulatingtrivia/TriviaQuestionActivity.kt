package com.example.stimulatingtrivia

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TriviaQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trivia_question)

        val QList = Constants.getQuestions()
        Log.i("Questions Size", "${QList.size}")
    }
}