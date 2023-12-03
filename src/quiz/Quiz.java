package quiz;

import question.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    private final String quizName;
    private final List<Question> questionList = new ArrayList<>();

    public Quiz(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizName() {
        return quizName;
    }

    public List<Question> getQuestionList() {
        Collections.shuffle(this.questionList);
        return this.questionList;
    }
}
