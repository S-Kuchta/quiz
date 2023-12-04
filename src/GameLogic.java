import answer.Answer;
import question.Question;
import quiz.Quiz;
import quiz.QuizList;

import java.util.List;
import java.util.Scanner;

public class GameLogic {

    private int correctAnswers = 0;
    private int totalQuestionsAnswered = 0;
    private final Scanner scanner = new Scanner(System.in);

    public void quizStart() {
        String playerAnswer;
        int index = 1;
        QuizList quizList = new QuizList();

        for (Question question : quizList.quizSelection()) {
            question.addOrderToAnswerList();
            question.addCorrectAnswerToCorrectAnswerList();
            question.printQuestionWithAnswers(index);

            do {
                System.out.println("Enter your answer: ");
                playerAnswer = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();
            } while (!checkTheCorrectnessOfPlayerInput(question, playerAnswer));

            int questionPoints = calculateQuestionPoints(question, playerAnswer);
            if (questionPoints == question.getCorrectAnswers().size()) {
                System.out.println("Correct!");
                this.correctAnswers++;
            } else {
                System.out.println("Incorrect! Correct answer(s) is/are " + question.getCorrectAnswers());
            }

            this.totalQuestionsAnswered++;
            index++;
        }
        printResults();
    }

    private int calculateQuestionPoints(Question question, String playerAnswer) {
        int questionPoints = 0;

        for (Answer answer : question.getAnswerList()) {
            if (question.getCorrectAnswers().size() != playerAnswer.length()) {
                return 0;
            }

            if (answer.isCorrect() && playerAnswer.contains(answer.getAnswerOrder())) {
                questionPoints++;
            }
        }

        return questionPoints;
    }

    private boolean checkTheCorrectnessOfPlayerInput(Question possibleAnswers, String playerAnswer) {
        int checkLetters = 0;
        for (Answer possibleAnswer : possibleAnswers.getAnswerList()) {
            if (playerAnswer.contains(possibleAnswer.getAnswerOrder())) {
                checkLetters++;
            }
        }

        if (checkLetters == playerAnswer.length()) {
            return true;
        } else {
            System.out.print("Enter valid answer! ");
            return false;
        }
    }

    private void printResults() {
        System.out.println("\n|---------------------------------------" +
                "------------------------------------------|");
        System.out.println("\t\tCongratulations! You answered "
                + this.correctAnswers + " out of " + this.totalQuestionsAnswered
                + " questions correctly.");
        System.out.println("|-----------------------------------------" +
                "----------------------------------------|\n");
    }
}
