package quiz;

import helpMethod.RandomNumberGenerator;
import question.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizList {
    public static final List<Quiz> QUIZ_LIST = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public QuizList() {
    }

    private void printQuizSelectionList() {
        System.out.println("Select QUIZ: ");
        for (int i = 0; i < QUIZ_LIST.size(); i++) {
            System.out.println((i + 1) + ". " + QUIZ_LIST.get(i).getQuizName());
            if (i == QUIZ_LIST.size() - 1) {
                System.out.println(i + 2 + ". Random Quiz");
            }
        }
    }

    public List<Question> quizSelection() {
        printQuizSelectionList();

        int selectQuiz;
        while (true) {
            try {
                selectQuiz = this.scanner.nextInt();
                if (selectQuiz == QUIZ_LIST.size() + 1) {
                    selectQuiz = RandomNumberGenerator.getRandomNumber(1, QUIZ_LIST.size());
                }

                if (selectQuiz <= (QUIZ_LIST.size() + 1) && selectQuiz > 0) {
                    this.scanner.nextLine();
                    System.out.println("\n\t|-----------------------------------------------------------|");
                    System.out.println("\t\t\tWelcome To " + QUIZ_LIST.get(selectQuiz - 1).getQuizName() + " ! Good luck!");
                    System.out.println("\t|-----------------------------------------------------------|");
                    return QUIZ_LIST.get(selectQuiz - 1).getQuestionList();
                } else {
                    System.out.println("Enter valid number.");
                }
            } catch (Exception e) {
                System.out.println("Enter valid number.");
            }
            this.scanner.nextLine();
        }
    }
}
