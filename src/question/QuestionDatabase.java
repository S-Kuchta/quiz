package question;


import answer.Answer;
import quiz.Quiz;
import quiz.QuizList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionDatabase {

    private static final String oneAnswer = "(Question with single answer)";
    private static final String moreAnswers = "(Question with multiple answers)";
    private final Quiz mathQuiz = new Quiz("Math Quiz");
    private final Quiz capitalCitiesQuiz = new Quiz("Capital Cities Quiz");
    private final Quiz medicalQuestionsQuiz = new Quiz("Medical Quiz");

    public void mathQuestions() {

//        List<Answer> answerList = new ArrayList<>();
//        Question question1 = new Question("What is 5 + 5? " + moreAnswers);
//        answerList.add(new Answer("2 * 5", true));
//        answerList.add(new Answer("25", false));
//        answerList.add(new Answer("13", false));
//        answerList.add(new Answer("10", true));
//        answerList.add(new Answer("18", false));
//        Collections.shuffle(answerList);
//        question1.addAnswerToAnswerList(answerList);
//        question1.addCorrectAnswerToCorrectAnswerList();
//        this.mathQuiz.getQuestionList().add(question1);


        Question question1 = new Question("What is 5 + 5? " + moreAnswers);
        question1.addAnswerToAnswerList(new Answer("2 * 5", true));
        question1.addAnswerToAnswerList(new Answer( "25", false));
        question1.addAnswerToAnswerList(new Answer("13", false));
        question1.addAnswerToAnswerList(new Answer("10", true));
        question1.addAnswerToAnswerList(new Answer("18", false));
        question1.addOrderToAnswerList();
        question1.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question1);

        Question question2 = new Question("What is 12 * 12 ? " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("45", false));
        question2.addAnswerToAnswerList(new Answer("148", false));
        question2.addAnswerToAnswerList(new Answer("144", true));
        question2.addAnswerToAnswerList(new Answer("124", false));
        question2.addOrderToAnswerList();
        question2.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question2);

        Question question3 = new Question("What is 5^2? " + oneAnswer);
        question3.addAnswerToAnswerList(new Answer("25", true));
        question3.addAnswerToAnswerList(new Answer("10", false));
        question3.addOrderToAnswerList();
        question3.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(mathQuiz);
    }

    public void capitalQuestions() {
        Question question1 = new Question("Capital city of Slovakia " + oneAnswer);
        question1.addAnswerToAnswerList(new Answer("Bratislava", true));
        question1.addAnswerToAnswerList(new Answer("Prague", false));
        question1.addAnswerToAnswerList(new Answer("Sofia", false));
        question1.addAnswerToAnswerList(new Answer("Košice", false));
        question1.addAnswerToAnswerList(new Answer("Snina", false));
        question1.addOrderToAnswerList();
        question1.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question1);

        Question question2 = new Question("Capital city of Norway " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("Stockholm", false));
        question2.addAnswerToAnswerList(new Answer("London", false));
        question2.addAnswerToAnswerList(new Answer("Oslo", true));
        question2.addAnswerToAnswerList(new Answer("Helsinki", false));
        question2.addOrderToAnswerList();
        question2.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question2);

        Question question3 = new Question("Capital city of Montenegro " + oneAnswer);
        question3.addAnswerToAnswerList(new Answer("Podgorica", true));
        question3.addAnswerToAnswerList(new Answer("Belgrade", false));
        question3.addOrderToAnswerList();
        question3.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(this.capitalCitiesQuiz);
    }

    public void medicalQuestions() {
        Question question1 = new Question("What is biggest bone in human body? " + oneAnswer);
        question1.addAnswerToAnswerList(new Answer("Scapula", false));
        question1.addAnswerToAnswerList(new Answer("Femur", true));
        question1.addAnswerToAnswerList(new Answer("Tibia", false));
        question1.addAnswerToAnswerList(new Answer("Fibula", false));
        question1.addOrderToAnswerList();
        question1.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question1);

        Question question2 = new Question("Which drug is used primary during CPR? " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("Apaurin", false));
        question2.addAnswerToAnswerList(new Answer("Tensamin", false));
        question2.addAnswerToAnswerList(new Answer("Cordarone", false));
        question2.addAnswerToAnswerList(new Answer("Adrenaline", true));
        question2.addOrderToAnswerList();
        question2.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question2);

        Question question3 = new Question("What are basic vital signs? " + moreAnswers);
        question3.addAnswerToAnswerList(new Answer("Body Temperature", true));
        question3.addAnswerToAnswerList(new Answer("Pulse Rate", true));
        question3.addAnswerToAnswerList(new Answer("Respiration Rate", true));
        question3.addAnswerToAnswerList(new Answer("Blood Pressure", true));
        question3.addAnswerToAnswerList(new Answer("The patient's mood", false));
        question3.addOrderToAnswerList();
        question3.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(this.medicalQuestionsQuiz);


    }


}
