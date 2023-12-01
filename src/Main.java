import question.QuestionDatabase;

import java.util.Scanner;

public class Main {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        QuestionDatabase.mathQuestions();
        QuestionDatabase.capitalQuestions();

        GameMechanic gameMechanic = new GameMechanic();
        gameMechanic.quizStart();

        while (true) {
            System.out.println("Do you want to play another QUIZ? enter -> YES or NO");
            String continuePlaying = SCANNER.nextLine().toUpperCase().trim();
            if (continuePlaying.equals("NO")) {
                System.exit(0);
            } else if (continuePlaying.equals("YES")) {
                gameMechanic.quizStart();
            } else {
                System.out.println("Enter valid answer.");
            }
        }
    }
}