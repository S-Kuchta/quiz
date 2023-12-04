package quiz;

import question.Question;

import java.util.Collections;
import java.util.List;

public class Quiz {
    private final String quizName;
    private final List<Question> questionList;

    public Quiz(String quizName, List<Question> questionList) {
        this.quizName = quizName;
        this.questionList = questionList;
    }

    public String getQuizName() {
        return quizName;
    }

    public List<Question> getQuestionList() {
        Collections.shuffle(this.questionList);
        return this.questionList;
    }
}
