import questionDatabase.Question;
import questionDatabase.answer.Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int totalPoints = 0;
    private static int questionPoins = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Answer> answerList = new ArrayList<>();
        answerList.add(new Answer("A", "10", true));
        answerList.add(new Answer("B", "2", false));
        answerList.add(new Answer("C", "5", true));
        answerList.add(new Answer("D", "7", false));

        Question question = new Question(answerList, "Koľko je 5 + 5 ?");
        for (Answer answer : answerList) {
            if (answer.isCorrect()) {
                question.getCorrectAnswers().add(answer.getOrder());
            }
        }


        System.out.println(question.getQuestion());
        question.printAnswerList();

        String playerAnswer = scanner.nextLine();

        for (Answer answer : answerList) {
            if (question.getCorrectAnswers().size() < playerAnswer.length()) {
                break;
            }

            if (answer.isCorrect()) {
                if (playerAnswer.toUpperCase().contains(answer.getOrder())) {
                    questionPoins++;
                }
            }
        }

        if (questionPoins == question.getCorrectAnswers().size()) {
            System.out.println("You have correct answer(s)!");
        } else {
            questionPoins = 0;
            System.out.println("You don't have correct answer(s). Correct answer(s) are " + question.getCorrectAnswers());
        }
        totalPoints += questionPoins;
        System.out.println("You have " + totalPoints + " total points.");

    }
}