package question;

import answer.Answer;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private final String question;
    private final List<Answer> answerList = new ArrayList<>();
    private final List<String> correctAnswers = new ArrayList<>();

    public Question(String question) {
        this.question = question;
    }

    public void addCorrectAnswersToQuestionList() {
        for (Answer answer : this.getAnswerList()) {
            if (answer.isCorrect()) {
                this.correctAnswers.add(answer.getAnswerOrder());
            }
        }
    }

    public void addAnswerToAnswerList(Answer answer) {
        for (Answer order : this.answerList) {
            if (order.getAnswerOrder().contains(answer.getAnswerOrder())) {
                System.out.println("Check answers order in questions and fix it!");
                System.out.println(this.question + ", answer order problem: " + order.getAnswerOrder());
                System.exit(0);
            }
        }

        this.answerList.add(answer);
    }

    public void printQuestionWithAnswers() {
        System.out.println("\n|-----------------------------------------------------------|");
        System.out.println("\t" + this.question);
        System.out.println("|-----------------------------------------------------------|");
        for (Answer answer : this.answerList) {
            System.out.println("\t" + answer.getAnswerOrder() + ". " + answer.getAnswerText());
        }
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
}
