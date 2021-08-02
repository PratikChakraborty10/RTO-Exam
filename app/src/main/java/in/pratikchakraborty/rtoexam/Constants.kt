package `in`.pratikchakraborty.rtoexam

import java.util.ArrayList

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What does this road sign represents?",
            R.drawable.ic_no_right_turn,
            "Left Turn Prohibited", "U-Turn Prohibited",
            "Right Turn Prohibited", "One Way Road", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What does this road sign represents?",
            R.drawable.ic_no_left_turn,
            "Left Turn Prohibited", "Right Turn Prohibited",
            "No Turn Allowed", "U-Turn Prohibited", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What does this road sign represents?",
            R.drawable.ic_falling_rocks,
            "Hilly Road Ahead", "Speed Breaker Ahead",
            "Polluted Roads Ahead", "Falling Rocks Ahead", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What does this road sign represents?",
            R.drawable.ic_axel_load_limit,
            "Wide Bridge Ahead", "Axel Limit",
            "Narrow Bridge Ahead", "Speed Breaker Ahead", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What does this road sign represents?",
            R.drawable.ic_left_reverse_bend,
            "Left Turn", "Right-Left Turn",
            "Left Reverse Turn", "One Way", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What does this road sign represents?",
            R.drawable.ic_right_reverse_bend,
            "Right Turn", "Left Reverse Turn",
            "Right Reverse Turn", "None of these", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What does this road sign represents?",
            R.drawable.ic_overtaking_prohibited,
            "Right Turn", "Speed Limit",
            "No Overtaking", "None of these", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What does this road sign represents?",
            R.drawable.ic_all_vehicle_prohibited,
            "All Vehicle Prohibited", "No Pollution Zone",
            "No Smoking Zone", "Speed Limit", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What does this road sign represents?",
            R.drawable.ic_school_ahead,
            "Crossing Ahead", "School Ahead",
            "Hospital Ahead", "None of these", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What does this road sign represents?",
            R.drawable.ic_narrow_road_ahead,
            "Narrow Road Ahead", "Broad Road Ahead",
            "Bridge Ahead", "None of these", 1
        )
        questionsList.add(que10)
        return questionsList
    }
}


