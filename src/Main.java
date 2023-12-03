import question.QuestionDatabase;
import quiz.QuizList;

import java.util.Scanner;

public class Main {

    private final static Scanner SCANNER = new Scanner(System.in);
    private static final QuestionDatabase questionDatabase = new QuestionDatabase();

    public static void main(String[] args) {
        questionDatabase.questionsAndAnswersInitialize();

        System.out.println("\n-> Welcome to my Quiz challenge. You can choose between " + QuizList.QUIZ_LIST.size() + " quizzes or leave it to chance and get random one.");
        System.out.println("""
                -> To select a quiz, enter the number before the name of the quiz.
                -> Enter the answer into console as a letter.(e.g.: 'a', 'A', 'b', ...)
                -> If there are more correct answers(you will be announced after each question), enter them in one line(e.g.: 'abc', 'aCb','a b d', ...)
                -> You must enter the exact number of answers (for questions with multiple correct answers), otherwise your answer will be incorrect""");
        System.out.println("-> Now lets play! Have fun and good luck!\n");
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
                System.out.println("Enter valid answer.");
            }
        }
    }
}