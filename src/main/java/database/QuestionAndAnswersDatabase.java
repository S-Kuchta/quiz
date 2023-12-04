package database;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import quiz.Quiz;
import quiz.QuizList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class QuestionAndAnswersDatabase {
    public void questionsAndAnswersInitialize() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("quizDatabase/db.json"));
            List<Quiz> questionList = new Gson().fromJson(reader, new TypeToken<List<Quiz>>() {
            }.getType());

            QuizList.QUIZ_LIST.addAll(questionList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
