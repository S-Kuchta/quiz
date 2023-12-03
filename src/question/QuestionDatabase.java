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

    private void addAnswersToQuestion(Question question, String text, boolean isAnswerCorrect) {
        question.addAnswerToAnswerList(new Answer(text, isAnswerCorrect));
    }

    private void addOrderToAnswerList(Question question, Quiz quiz) {
//        question.addOrderToAnswerList();
//        question.addCorrectAnswerToCorrectAnswerList();
        quiz.getQuestionList().add(question);
    }

    public void mathQuestions() {
        Question mathQuestion1 = new Question("What is 5 + 5? " + moreAnswers);
        addAnswersToQuestion(mathQuestion1, "2 * 5", true);
        addAnswersToQuestion(mathQuestion1,  "25", false);
        addAnswersToQuestion(mathQuestion1, "13", false);
        addAnswersToQuestion(mathQuestion1, "10", true);
        addAnswersToQuestion(mathQuestion1, "18", false);
        addOrderToAnswerList(mathQuestion1, this.mathQuiz);

        Question mathQuestion2 = new Question("What is 12 * 12 ? " + oneAnswer);
        addAnswersToQuestion(mathQuestion2,"45", false);
        addAnswersToQuestion(mathQuestion2,"148", false);
        addAnswersToQuestion(mathQuestion2,"144", true);
        addAnswersToQuestion(mathQuestion2,"124", false);
        addOrderToAnswerList(mathQuestion2, this.mathQuiz);

        Question mathQuestion3 = new Question("What is 5^2? " + oneAnswer);
        addAnswersToQuestion(mathQuestion3,"25", true);
        addAnswersToQuestion(mathQuestion3,"10", false);
        addOrderToAnswerList(mathQuestion3, this.mathQuiz);


        Question capitalQuestion1 = new Question("Capital city of Slovakia " + oneAnswer);
        addAnswersToQuestion(capitalQuestion1,"Bratislava", true);
        addAnswersToQuestion(capitalQuestion1,"Prague", false);
        addAnswersToQuestion(capitalQuestion1,"Sofia", false);
        addAnswersToQuestion(capitalQuestion1,"Košice", false);
        addAnswersToQuestion(capitalQuestion1,"Snina", false);
        addOrderToAnswerList(capitalQuestion1, this.capitalCitiesQuiz);

        Question capitalQuestion2 = new Question("Capital city of Norway " + oneAnswer);
        addAnswersToQuestion(capitalQuestion2, "Stockholm", false);
        addAnswersToQuestion(capitalQuestion2,"London", false);
        addAnswersToQuestion(capitalQuestion2,"Oslo", true);
        addAnswersToQuestion(capitalQuestion2,"Helsinki", false);
        addOrderToAnswerList(capitalQuestion2, this.capitalCitiesQuiz);

        Question capitalQuestion3 = new Question("Capital city of Montenegro " + oneAnswer);
        addAnswersToQuestion(capitalQuestion3,"Podgorica", true);
        addAnswersToQuestion(capitalQuestion3,"Belgrade", false);
        addOrderToAnswerList(capitalQuestion3, this.capitalCitiesQuiz);


        Question medicalQuestion1 = new Question("What is biggest bone in human body? " + oneAnswer);
        addAnswersToQuestion(medicalQuestion1,"Scapula", false);
        addAnswersToQuestion(medicalQuestion1,"Femur", true);
        addAnswersToQuestion(medicalQuestion1,"Tibia", false);
        addAnswersToQuestion(medicalQuestion1,"Fibula", false);
        addOrderToAnswerList(medicalQuestion1, this.medicalQuestionsQuiz);

        Question medicalQuestion2 = new Question("Which drug is used primary during CPR? " + oneAnswer);
        addAnswersToQuestion(medicalQuestion2,"Apaurin", false);
        addAnswersToQuestion(medicalQuestion2,"Tensamin", false);
        addAnswersToQuestion(medicalQuestion2,"Cordarone", false);
        addAnswersToQuestion(medicalQuestion2,"Adrenaline", true);
        addOrderToAnswerList(medicalQuestion2, this.medicalQuestionsQuiz);

        Question medicalQuestion3 = new Question("What are basic vital signs? " + moreAnswers);
        addAnswersToQuestion(medicalQuestion3,"Body Temperature", true);
        addAnswersToQuestion(medicalQuestion3,"Pulse Rate", true);
        addAnswersToQuestion(medicalQuestion3,"Respiration Rate", true);
        addAnswersToQuestion(medicalQuestion3,"Blood Pressure", true);
        addAnswersToQuestion(medicalQuestion3,"The patient's mood", false);
        addOrderToAnswerList(medicalQuestion3, this.medicalQuestionsQuiz);

        QuizList.QUIZ_LIST.add(this.mathQuiz);
        QuizList.QUIZ_LIST.add(this.capitalCitiesQuiz);
        QuizList.QUIZ_LIST.add(this.medicalQuestionsQuiz);


    }
}
