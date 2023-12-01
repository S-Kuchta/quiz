package quiz;

import question.Question;

import java.util.ArrayList;
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
        return questionList;
    }
}
