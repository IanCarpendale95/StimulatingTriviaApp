package com.example.stimulatingtrivia
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_trivia_question.*

class TriviaQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAns: Int = 0
    private var Username: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trivia_question)

        Username = intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()

        SetQ()
        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        enter.setOnClickListener(this)
    }

    override fun onClick(v: View?)
    {
        when (v?.id) {

            R.id.option1 -> {
                selectedOptionView(option1, 1)
            }
            R.id.option2 -> {
                selectedOptionView(option2, 2)
            }
            R.id.option3 -> {
                selectedOptionView(option3, 3)
            }
            R.id.option4 -> {
                selectedOptionView(option4, 4)
            }
            R.id.enter ->{
                if(mSelectedOptionPosition == 0) {
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            SetQ()
                        }else ->{
                            val intent = Intent(this, Result::class.java)
                        intent.putExtra(Constants.USER_NAME, Username)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAns)
                        intent.putExtra(Constants.TOTAL_Questions, mQuestionList!!.size)
                        startActivity(intent)
                        }
                    }
                }else {
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        viewanswer(mSelectedOptionPosition, R.drawable.incorrectoption)
                    }else{
                        mCorrectAns++
                    }
                    viewanswer(question.correctAnswer, R.drawable.correctoption)

                    if(mCurrentPosition == mQuestionList!!.size){
                        enter.text = "Finish"
                    }else{

                        enter.text = "Next Question"
                    }
                    mSelectedOptionPosition = 0
                }

            }
        }
    }

    private fun  viewanswer(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                option1.background = ContextCompat.getDrawable(
                                    this, drawableView)
            }
             2->{
                option2.background = ContextCompat.getDrawable(
                        this, drawableView)
            }
            3->{
                option3.background = ContextCompat.getDrawable(
                        this, drawableView)
            }
            4->{
                option4.background = ContextCompat.getDrawable(
                        this, drawableView)
            }
        }
    }
    private fun SetQ(){
        val question = mQuestionList!!.get(mCurrentPosition-1)

        defaultOptions()

        if(mCurrentPosition == mQuestionList!!.size){
            enter.text = "Finish"

        }else{
            enter.text = "Submit"
        }

        progressbar.progress = mCurrentPosition
        progressnum.text = "$mCurrentPosition" + "/" + progressbar.max

        textview_question.text = question.question
        image.setImageResource(question.image)

        option1.text = question.optionOne
        option2.text = question.optionTwo
        option3.text = question.optionThree
        option4.text = question.optionFour
    }

    private fun defaultOptions(){
        val options = ArrayList<TextView>()
        options.add(index = 0, option1)
        options.add(index = 1, option2)
        options.add(index = 2, option3)
        options.add(index = 3, option4)

        for (option in options){
            option.setTextColor(Color.parseColor("#FF018786"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.selectedoptionbr)

        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptions()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#FF018786"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selectedoptionbr)
    }
}