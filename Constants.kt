package com.example.stimulatingtrivia

//Questions are stored here,  this file will take in data from
//the question class

object Constants{

    const val USER_NAME: String ="UserName"
    const val TOTAL_Questions: String ="TotalQuestions"
    const val CORRECT_ANSWERS: String ="CorrectAnswers"

    fun getQuestions(): ArrayList<Question>{

            val QList = ArrayList<Question>()

            val q1 = Question(id = 1,
                    question = "What Make is this car?",
                R.drawable.dodgeviper,
                    optionOne = "Dodge",
                    optionTwo = "Ferrari",
                    optionThree = "Suzuki",
                    optionFour = "Mitsubishi",
                    correctAnswer = 1
                    )
                QList.add(q1)

        val q2 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mini,
                optionOne = "Jaguar",
                optionTwo = "Nissan",
                optionThree = "Mini",
                optionFour = "Nissan",
                correctAnswer = 3
        )
        QList.add(q2)

        val q3 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.mitubishilancer,
                optionOne = "Ford",
                optionTwo = "Lambo",
                optionThree = "Tesla",
                optionFour = "Mitsubishi",
                correctAnswer = 4
        )
        QList.add(q3)

        val q4 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.toyotacorolla,
                optionOne = "Ford",
                optionTwo = "Toyota",
                optionThree = "Suburu",
                optionFour = "MG",
                correctAnswer = 2
        )
        QList.add(q4)

        val q5 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.fordfocus,
                optionOne = "Nissan",
                optionTwo = "Tesla",
                optionThree = "Jaguar",
                optionFour = "Ford ",
                correctAnswer = 4
        )
        QList.add(q5)

        val q6 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.audir8,
                optionOne = "Tesla",
                optionTwo = "VW",
                optionThree = "Audi",
                optionFour = "Ferrari",
                correctAnswer = 3
        )
        QList.add(q6)

        val q7 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.bmwi8,
                optionOne = "BMW",
                optionTwo = "Audi",
                optionThree = "Volkswagen",
                optionFour = "MG",
                correctAnswer = 1
        )
        QList.add(q7)

        val q8 = Question(id = 4,
                question = "What Car is this?",
                R.drawable.kiasoul,
                optionOne = "Mazda",
                optionTwo = "Ferrari",
                optionThree = "Subaru",
                optionFour = "Kia",
                correctAnswer = 3
        )
        QList.add(q8)

        val q9 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.gwagon,
                optionOne = "Mercedes",
                optionTwo = "Kia",
                optionThree = "Audi",
                optionFour = "Tesla",
                correctAnswer = 1
        )
        QList.add(q9)

        val q10 = Question(id = 1,
                question = "What Car is this?",
                R.drawable.rolls,
                optionOne = "Fiat",
                optionTwo = "Nissan",
                optionThree = "Ford",
                optionFour = "Rolls",
                correctAnswer = 4
        )
        QList.add(q10)
        return QList
    }

}
