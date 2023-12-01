import answer.Answer;
import question.Question;
import quiz.Quiz;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameMechanic {

    private int totalPoints = 0;
    private int correctAnswers = 0;
    private int totalQuestionsAnswered = 0;
    private final Scanner scanner = new Scanner(System.in);

    public void quizStart() {
        String playerAnswer;

        for (Question question : quizSelection()) {
            question.printQuestionWithAnswers();

            do {
                System.out.println("Enter your answer: ");
                playerAnswer = scanner.nextLine().replaceAll("\\s", "").toUpperCase();
            } while (!checkTheCorrectnessOfPlayerInput(question, playerAnswer));

            int questionPoints = calculateQuestionPoints(question, playerAnswer);
            if (questionPoints == question.getCorrectAnswers().size()) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect! Correct answer(s) is/are " + question.getCorrectAnswers());
            }

            totalQuestionsAnswered++;
            totalPoints += questionPoints;
        }
        printResults();
    }

    private int calculateQuestionPoints(Question question, String playerAnswer) {
        int questionPoints = 0;

        for (Answer answer : question.getAnswerList()) {
            if (question.getCorrectAnswers().size() < playerAnswer.length()) {
                break;
            }

            if (answer.isCorrect() && playerAnswer.contains(answer.getAnswerOrder())) {
                questionPoints++;
            }
        }

        return questionPoints;
    }

    private boolean checkTheCorrectnessOfPlayerInput(Question possibleAnswers, String playerAnswer) {
        int checkChar = 0;
        for (Answer possibleAnswer : possibleAnswers.getAnswerList()) {
            if (playerAnswer.contains(possibleAnswer.getAnswerOrder())) {
                checkChar++;
            }
        }

        if (checkChar == playerAnswer.length()) {
            return true;
        } else {
            System.out.print("Enter valid answer! ");
            return false;
        }
    }

    private List<Question> quizSelection() {
        System.out.println("Select QUIZ: ");
        System.out.println("1 - MATH QUIZ");
        System.out.println("2 - CAPITAL CITIES QUIZ");
        System.out.println("3 - RANDOM QUIZ");

        int selectQuiz;
        while (true) {
            try {
                selectQuiz = scanner.nextInt();
                if (selectQuiz <= Quiz.QUIZ_LIST.size() + 1 && selectQuiz > 0) {
                    break;
                } else {
                    System.out.println("Enter valid number.");
                }
            } catch (Exception e) {
                System.out.println("Enter valid number.");
            }
            scanner.nextLine();
        }
        scanner.nextLine();

        switch (selectQuiz) {
            case 1 -> {
                return Quiz.MATH_QUIZ;
            }
            case 2 -> {
                return Quiz.CAPITAL_QUIZ;
            }
            case 3 -> {
                return Quiz.QUIZ_LIST.get(getRandomNumber(0, Quiz.QUIZ_LIST.size() - 1));
            }
        }
        return Quiz.QUIZ_LIST.get(getRandomNumber(1, Quiz.QUIZ_LIST.size() - 1));
    }

    private int getRandomNumber(int Min, int Max) {
        return ThreadLocalRandom.current().nextInt(Min, Max + 1);
    }

    private void printResults() {
        System.out.println("\n|-----------------------------------------------------------------------------------------|");
        System.out.println("\tCongratulations! You answered " + correctAnswers
                + " out of "
                + this.totalQuestionsAnswered
                + " questions correctly. You earned " + totalPoints + " points.");
        System.out.println("|-----------------------------------------------------------------------------------------|\n");
    }
}
