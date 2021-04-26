package com.example.stimulatingtrivia

//Questions are stored here,  this file will take in data from
//the question class

object Constants{

    fun getQuestions(): ArrayList<Question>{

            val QList = ArrayList<Question>()

            val q1 = Question(id = 1,
                    question = "What Car is this?",
                R.drawable.dodgeviper,
                    optionOne = "Dodge Viper",
                    optionTwo = "Ferrari",
                    optionThree = "Suzuki Alto",
                    optionFour = "Mitsubishi  Lancer",
                    correctAnswer = 1
                    )
                QList.add(q1)

        val q2 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q2)

        val q3 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q3)

        val q4 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q4)

        val q5 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q5)

        val q6 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q6)

        val q7 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q7)

        val q8 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q8)

        val q9 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q9)

        val q10 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "",
                optionTwo = "Ferrari",
                optionThree = "Mini",
                optionFour = "Mitsubishi  Lancer",
                correctAnswer = 3
        )
        QList.add(q10)
        return QList
    }

}
