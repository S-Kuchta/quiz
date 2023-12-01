package questionDatabase;

import questionDatabase.answer.Answer;

import java.util.ArrayList;
import java.util.List;

public class Question {

    List<Answer> answerList;
    String question;
    List<String> correctAnswers = new ArrayList<>();

    public Question(List<Answer> answerList, String question, List<String> correctAnswers) {
        this.answerList = answerList;
        this.question = question;
        this.correctAnswers = correctAnswers;
    }

    public Question(List<Answer> answerList, String question) {
        this.answerList = answerList;
        this.question = question;
    }

    public void printAnswerList() {

        for(Answer answer : this.answerList) {
            System.out.println(answer.getOrder() + ". " + answer.getAnswer());
        }
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
