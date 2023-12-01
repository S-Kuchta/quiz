import question.Question;
import question.SavedQuestions;
import question.answer.Answer;
import quiz.Quiz;

import java.util.List;
import java.util.Scanner;

public class Main {

//    private static int totalPoints = 0;
//    private static int correctAnswers = 0;
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        GameMechanic gameMechanic = new GameMechanic();
        SavedQuestions.mathQuestions();
        SavedQuestions.capitalQuestions();

        gameMechanic.quizStart();

        while (true) {
            System.out.println("Do you want to play another QUIZ?\n-> YES\n-> NO");
            String continuePlaying = SCANNER.nextLine().toUpperCase();
            if (continuePlaying.equals("NO")) {
                System.exit(0);
            } else if(continuePlaying.equals("YES")) {
                gameMechanic.quizStart();
            } else {
                System.out.println("Enter valid answer.");
            }
        }
    }

//    private static void quizStart() {
//        for (Question question : quizSelection()) {
//            System.out.println(question.getQuestion());
//            question.printAnswerList();
////                System.out.println(question.getCorrectAnswers());
//
//            String playerAnswer = SCANNER.nextLine().replaceAll("\\s", "").toUpperCase();
//            int questionPoints = calculateQuestionPoints(question, playerAnswer);
//
//            if (questionPoints == question.getCorrectAnswers().size()) {
//                System.out.println("Correct!");
//                correctAnswers++;
//            } else {
//                System.out.println("Incorrect! Correct answer(s) is/are " + question.getCorrectAnswers());
//            }
//
//            totalPoints += questionPoints;
//            System.out.println();
//        }
//        System.out.println("You have " + correctAnswers + " correct answers, with " + totalPoints + " points.\n");
//    }
//
//    private static int calculateQuestionPoints(Question question, String playerAnswer) {
//        int questionPoints = 0;
//
//        for (Answer answer : question.getAnswerList()) {
//            if (question.getCorrectAnswers().size() < playerAnswer.length()) {
//                break;
//            }
//
//            if (answer.isCorrect() && playerAnswer.contains(answer.getAnswerOrder())) {
//                questionPoints++;
//            }
//        }
//
//        return questionPoints;
//    }
//
//    private static List<Question> quizSelection() {
//        System.out.println("Select QUIZ: ");
//        System.out.println("1 - MATH QUIZ");
//        System.out.println("2 - CAPITAL CITIES QUIZ");
//        int selectQuiz = SCANNER.nextInt();
//        SCANNER.nextLine();
//        switch (selectQuiz) {
//            case 1 -> {
//                return Quiz.MATH_QUIZ;
//            }
//            case 2 -> {
//                return Quiz.CAPITAL_QUIZ;
//            }
//            default -> {
//                return null;
//            }
//        }
//    }
}