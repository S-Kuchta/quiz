package question;

import answer.Answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Question {

    private final String question;
    private List<Answer> answerList = new ArrayList<>();
    private final HashSet<String> correctAnswers = new HashSet<>();

    public Question(String question) {
        this.question = question;
    }

    public void addCorrectAnswers() {
        this.correctAnswers.clear();
        for (Answer answer : this.getAnswerList()) {
            if (answer.isCorrect()) {
                this.correctAnswers.add(answer.getAnswerOrder());
            }
        }
    }

    private void checkNumberOfAnswers() {
        if (this.answerList.size() > 5) {
            this.answerList = this.answerList.subList(0, 5);
        }
    }

    public void addOrderToAnswerList() {
        checkNumberOfAnswers();

        Collections.shuffle(this.answerList);
        int index = 1;
        for (Answer answer : this.answerList) {
            answer.setAnswerOrder(index);
            index++;
        }
    }

    public void printQuestionWithAnswers(int index) {
        String singleOrMultipleAnswer = this.correctAnswers.size() > 1 ? "(Question with Multiple Answer)" : "(Question with Single Answer)";

        System.out.println("\n|------------------------------------------------------------------------|");
        System.out.println("\t" + index + ". " + this.question + " " + singleOrMultipleAnswer);
        System.out.println("|------------------------------------------------------------------------|");
        for (Answer answer : this.answerList) {
            System.out.println("\t" + answer.getAnswerOrder() + ". " + answer.getAnswerText());
        }
    }

    public List<Answer> getAnswerList() {
        return this.answerList;
    }

    public HashSet<String> getCorrectAnswers() {
        return this.correctAnswers;
    }
}
