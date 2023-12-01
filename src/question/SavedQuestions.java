package question;


import question.answer.Answer;
import quiz.Quiz;

public class SavedQuestions {

    public static void mathQuestions() {
        Question question1 = new Question("What is 5 + 5?");
        question1.addAnswerToAnswerList(new Answer("A", "2 * 5", true));
        question1.addAnswerToAnswerList(new Answer("B", "25", false));
        question1.addAnswerToAnswerList(new Answer("C", "13", false));
        question1.addAnswerToAnswerList(new Answer("D", "10", true));
        question1.addAnswerToAnswerList(new Answer("E", "18", false));
        question1.addCorrectAnswersToQuestionList();
        Quiz.MATH_QUIZ.add(question1);

        Question question2 = new Question("What is 12 * 12 ?");
        question2.addAnswerToAnswerList(new Answer("A", "45", false));
        question2.addAnswerToAnswerList(new Answer("B", "148", false));
        question2.addAnswerToAnswerList(new Answer("C", "144", true));
        question2.addAnswerToAnswerList(new Answer("D", "124", false));
        question2.addCorrectAnswersToQuestionList();
        Quiz.MATH_QUIZ.add(question2);

        Question question3 = new Question("What is 5^2?");
        question3.addAnswerToAnswerList(new Answer("A", "25", true));
        question3.addAnswerToAnswerList(new Answer("B", "10", false));
        question3.addCorrectAnswersToQuestionList();
        Quiz.MATH_QUIZ.add(question3);
    }

    public static void capitalQuestions() {
        Question question1 = new Question("Capital city of Slovakia");
        question1.addAnswerToAnswerList(new Answer("A", "Bratislava", true));
        question1.addAnswerToAnswerList(new Answer("B", "Prague", false));
        question1.addAnswerToAnswerList(new Answer("C", "Sofia", false));
        question1.addAnswerToAnswerList(new Answer("D", "Košice", false));
        question1.addAnswerToAnswerList(new Answer("E", "Snina", false));
        question1.addCorrectAnswersToQuestionList();
        Quiz.CAPITAL_QUIZ.add(question1);

        Question question2 = new Question("Capital city of Norway");
        question2.addAnswerToAnswerList(new Answer("A", "Stockholm", false));
        question2.addAnswerToAnswerList(new Answer("B", "London", false));
        question2.addAnswerToAnswerList(new Answer("C", "Oslo", true));
        question2.addAnswerToAnswerList(new Answer("D", "Helsinki", false));
        question2.addCorrectAnswersToQuestionList();
        Quiz.CAPITAL_QUIZ.add(question2);

        Question question3 = new Question("Capital city of Montenegro");
        question3.addAnswerToAnswerList(new Answer("A", "Podgorica", true));
        question3.addAnswerToAnswerList(new Answer("B", "Belgrade", false));
        question3.addCorrectAnswersToQuestionList();
        Quiz.CAPITAL_QUIZ.add(question3);
    }
}
