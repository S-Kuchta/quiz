package question;

import answer.Answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {

    private final String question;
    private final List<Answer> answerList = new ArrayList<>();
    private final List<String> correctAnswers = new ArrayList<>();

    public Question(String question) {
        this.question = question;
    }

    public void addCorrectAnswerToCorrectAnswerList() {
        for (Answer answer : this.getAnswerList()) {
            if (answer.isCorrect()) {
                this.correctAnswers.add(answer.getAnswerOrder());
            }
        }
    }

    public void addOrderToAnswerList() {
        Collections.shuffle(this.answerList);
        int index = 1;
        for(Answer answer : answerList) {
            answer.setAnswerOrder(index);
            index++;
        }
    }

    public void addAnswerToAnswerList(Answer answer) {
        this.answerList.add(answer);
    }

    public void printQuestionWithAnswers(int index) {

        this.correctAnswers.clear();
        addOrderToAnswerList();
        addCorrectAnswerToCorrectAnswerList();

        System.out.println("\n|------------------------------------------------------------------------|");
        System.out.println("\t" + index + ". " + this.question);
        System.out.println("|------------------------------------------------------------------------|");
        for (Answer answer : this.answerList) {
            System.out.println("\t" + answer.getAnswerOrder() + ". " + answer.getAnswerText());
        }
    }

    public List<Answer> getAnswerList() {
        return this.answerList;
    }

    public List<String> getCorrectAnswers() {
        return this.correctAnswers;
    }
}
