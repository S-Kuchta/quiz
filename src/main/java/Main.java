import database.QuestionAndAnswersDatabase;
import quiz.QuizList;

import java.util.Scanner;

public class Main {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        QuestionAndAnswersDatabase.questionsAndAnswersInitialize();

        System.out.println("\n-> Welcome to my Quiz challenge! You have the option to choose from " + QuizList.QUIZ_LIST.size() + " quizzes or leave it to chance and get random one");
        System.out.println("""
                -> To select a quiz, simply input the number preceding the quiz's name
                -> Enter your answers into the console using a single letter(e.g., 'a', 'A', 'b', etc.) - without using quotation marks
                -> In cases where there are multiple correct answers(which will be announced after each question), input them all in one line(e.g., 'abc', 'aCb','a b d', etc.) - without using quotation marks
                -> It's important to enter the exact number of answers for questions with multiple correct responses; otherwise, your answer will be considered incorrect""");
        System.out.println("-> Now, let's begin! Enjoy the quiz and good luck!\n");
        GameLogic gameLogic = new GameLogic();
        gameLogic.quizStart();

        while (true) {
            System.out.println("Do you want to play another QUIZ? enter -> YES or NO");
            String continuePlaying = SCANNER.nextLine().toUpperCase().trim();
            if (continuePlaying.equals("NO")) {
                System.exit(0);
            } else if (continuePlaying.equals("YES")) {
                gameLogic.quizStart();
            } else {
                System.out.println("Enter valid Input.");
            }
        }
    }
}