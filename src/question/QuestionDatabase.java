package question;


import answer.Answer;
import quiz.Quiz;
import quiz.QuizList;

public class QuestionDatabase {

    private static final String oneAnswer = "(Question with single answer)";
    private static final String moreAnswers = "(Question with multiple answers)";
    private final Quiz mathQuiz = new Quiz("Math Quiz");
    private final Quiz capitalCitiesQuiz = new Quiz("Capital Cities Quiz");
    private final Quiz medicalQuestionsQuiz = new Quiz("Medical Quiz");

    public void mathQuestions() {
        Question question1 = new Question("What is 5 + 5? " + moreAnswers);
        question1.addAnswerToAnswerList(new Answer("A", "2 * 5", true));
        question1.addAnswerToAnswerList(new Answer("B", "25", false));
        question1.addAnswerToAnswerList(new Answer("C", "13", false));
        question1.addAnswerToAnswerList(new Answer("D", "10", true));
        question1.addAnswerToAnswerList(new Answer("E", "18", false));
        question1.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question1);

        Question question2 = new Question("What is 12 * 12 ? " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("A", "45", false));
        question2.addAnswerToAnswerList(new Answer("B", "148", false));
        question2.addAnswerToAnswerList(new Answer("C", "144", true));
        question2.addAnswerToAnswerList(new Answer("D", "124", false));
        question2.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question2);

        Question question3 = new Question("What is 5^2? " + oneAnswer);
        question3.addAnswerToAnswerList(new Answer("A", "25", true));
        question3.addAnswerToAnswerList(new Answer("B", "10", false));
        question3.addCorrectAnswerToCorrectAnswerList();
        this.mathQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(mathQuiz);
    }

    public void capitalQuestions() {
        Question question1 = new Question("Capital city of Slovakia " + oneAnswer);
        question1.addAnswerToAnswerList(new Answer("A", "Bratislava", true));
        question1.addAnswerToAnswerList(new Answer("B", "Prague", false));
        question1.addAnswerToAnswerList(new Answer("C", "Sofia", false));
        question1.addAnswerToAnswerList(new Answer("D", "Košice", false));
        question1.addAnswerToAnswerList(new Answer("E", "Snina", false));
        question1.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question1);

        Question question2 = new Question("Capital city of Norway " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("A", "Stockholm", false));
        question2.addAnswerToAnswerList(new Answer("B", "London", false));
        question2.addAnswerToAnswerList(new Answer("C", "Oslo", true));
        question2.addAnswerToAnswerList(new Answer("D", "Helsinki", false));
        question2.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question2);

        Question question3 = new Question("Capital city of Montenegro " + oneAnswer);
        question3.addAnswerToAnswerList(new Answer("A", "Podgorica", true));
        question3.addAnswerToAnswerList(new Answer("B", "Belgrade", false));
        question3.addCorrectAnswerToCorrectAnswerList();
        this.capitalCitiesQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(this.capitalCitiesQuiz);
    }

    public void medicalQuestions() {
        Question question1 = new Question("What is biggest bone in human body? " + oneAnswer);
        question1.addAnswerToAnswerList(new Answer("A", "Scapula", false));
        question1.addAnswerToAnswerList(new Answer("B","Femur", true));
        question1.addAnswerToAnswerList(new Answer("C", "Tibia", false));
        question1.addAnswerToAnswerList(new Answer("D", "Fibula", false));
        question1.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question1);

        Question question2 = new Question("Which drug is used primary during CPR? " + oneAnswer);
        question2.addAnswerToAnswerList(new Answer("A", "Apaurin", false));
        question2.addAnswerToAnswerList(new Answer("B", "Degan", false));
        question2.addAnswerToAnswerList(new Answer("C", "Cordarone", false));
        question2.addAnswerToAnswerList(new Answer("D", "Adrenaline", true));
        question2.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question2);

        Question question3 = new Question("What are basic vital signs? " + moreAnswers);
        question3.addAnswerToAnswerList(new Answer("A", "Body Temperature", true));
        question3.addAnswerToAnswerList(new Answer("B", "Pulse Rate", true));
        question3.addAnswerToAnswerList(new Answer("C", "Respiration Rate", true));
        question3.addAnswerToAnswerList(new Answer("D", "Blood Pressure", true));
        question3.addAnswerToAnswerList(new Answer("E", "Patient mood", false));
        question3.addCorrectAnswerToCorrectAnswerList();
        this.medicalQuestionsQuiz.getQuestionList().add(question3);

        QuizList.QUIZ_LIST.add(this.medicalQuestionsQuiz);


    }


}
