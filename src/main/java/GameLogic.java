import answer.Answer;
import question.Question;
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
            question.addCorrectAnswers();
            question.printQuestionWithAnswers(index);

            do {
                System.out.println("Enter your answer: ");
                playerAnswer = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();
            } while (!checkTheCorrectnessOfPlayerInput(question.getAnswerList(), playerAnswer));

            if(calculateQuestionPoints(question, playerAnswer) == question.getCorrectAnswers().size()) {
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

    private boolean checkTheCorrectnessOfPlayerInput(List<Answer> possibleAnswers, String playerAnswer) {
        int checkLetters = 0;
        if(playerAnswer.isEmpty()) {
            System.out.print("Input can't be empty! ");
            return false;
        }

        for (Answer possibleAnswer : possibleAnswers) {
            if (playerAnswer.contains(possibleAnswer.getAnswerOrder())) {
                checkLetters++;
            }
        }

        if (checkLetters == playerAnswer.length()) {
            return true;
        } else {
            System.out.print("Enter valid input! ");
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
