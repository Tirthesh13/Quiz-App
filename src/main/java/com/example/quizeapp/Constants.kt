package com.example.quizeapp

object Constants {

    const val USER_NAME :String ="user_name"
    const val TOTAL_QUESTIONS :String ="total_questions"
    const val CORRECT_ANSWERS :String ="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_tiger,
            "Tiger","Tieger",
            "Tigar","Teger",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_dog,
            "Doog","Dog",
            "Cat","Tiger",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_elephant,
            "Elphant","Elephaant",
            "Elephant","Elephent",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_cat,
            "Cate","Cat",
            "Caat","kat",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_horse,
            "Hors","Horse",
            "Hourse","Halls",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_rabbit,
            "Rabbit","Raybit",
            "Rabit","Raabbit",
            1
        )
        questionList.add(que6)

        val que7 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_monkey,
            "Monekey","Mankey",
            "Moneky","Monkey",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            1,"Guess The Animals?",
            R.drawable.ic_cow,
            "Cow","Kao",
            "Cao","Coow",
            1
        )
        questionList.add(que8)



        return questionList

    }
}