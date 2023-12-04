package question;

import answer.Answer;
import quiz.Quiz;
import quiz.QuizList;

public class QuestionDatabase {

    private final Quiz mathQuiz = new Quiz("Math Quiz");
    private final Quiz capitalCitiesQuiz = new Quiz("Capital Cities Quiz");
    private final Quiz medicalQuestionsQuiz = new Quiz("Medical Quiz");

    private void addAnswerToAnswerList(Question question, String text, boolean isAnswerCorrect) {
        question.addAnswerToAnswerList(new Answer(text, isAnswerCorrect));
    }

    private void addQuestionToQuestionList(Question question, Quiz quiz) {
        quiz.getQuestionList().add(question);
    }

    public void questionsAndAnswersInitialize() {
        String oneAnswer = "(Question with single answer)";
        String moreAnswers = "(Question with multiple answers)";


        Question mathQuestion1 = new Question("What is 5 + 5? " + moreAnswers);
        addAnswerToAnswerList(mathQuestion1, "2 * 5", true);
        addAnswerToAnswerList(mathQuestion1, "25", false);
        addAnswerToAnswerList(mathQuestion1, "13", false);
        addAnswerToAnswerList(mathQuestion1, "10", true);
        addAnswerToAnswerList(mathQuestion1, "18", false);
        addQuestionToQuestionList(mathQuestion1, this.mathQuiz);

        Question mathQuestion2 = new Question("What is 12 * 12 ? " + oneAnswer);
        addAnswerToAnswerList(mathQuestion2, "45", false);
        addAnswerToAnswerList(mathQuestion2, "148", false);
        addAnswerToAnswerList(mathQuestion2, "144", true);
        addAnswerToAnswerList(mathQuestion2, "124", false);
        addQuestionToQuestionList(mathQuestion2, this.mathQuiz);

        Question mathQuestion3 = new Question("What is 5^2? " + oneAnswer);
        addAnswerToAnswerList(mathQuestion3, "25", true);
        addAnswerToAnswerList(mathQuestion3, "10", false);
        addQuestionToQuestionList(mathQuestion3, this.mathQuiz);


        Question capitalQuestion1 = new Question("Capital city of Slovakia " + oneAnswer);
        addAnswerToAnswerList(capitalQuestion1, "Bratislava", true);
        addAnswerToAnswerList(capitalQuestion1, "Prague", false);
        addAnswerToAnswerList(capitalQuestion1, "Sofia", false);
        addAnswerToAnswerList(capitalQuestion1, "Košice", false);
        addAnswerToAnswerList(capitalQuestion1, "Snina", false);
        addQuestionToQuestionList(capitalQuestion1, this.capitalCitiesQuiz);

        Question capitalQuestion2 = new Question("Capital city of Norway " + oneAnswer);
        addAnswerToAnswerList(capitalQuestion2, "Stockholm", false);
        addAnswerToAnswerList(capitalQuestion2, "London", false);
        addAnswerToAnswerList(capitalQuestion2, "Oslo", true);
        addAnswerToAnswerList(capitalQuestion2, "Helsinki", false);
        addQuestionToQuestionList(capitalQuestion2, this.capitalCitiesQuiz);

        Question capitalQuestion3 = new Question("Capital city of Montenegro " + oneAnswer);
        addAnswerToAnswerList(capitalQuestion3, "Podgorica", true);
        addAnswerToAnswerList(capitalQuestion3, "Belgrade", false);
        addQuestionToQuestionList(capitalQuestion3, this.capitalCitiesQuiz);


        Question medicalQuestion1 = new Question("What is biggest bone in human body? " + oneAnswer);
        addAnswerToAnswerList(medicalQuestion1, "Scapula", false);
        addAnswerToAnswerList(medicalQuestion1, "Femur", true);
        addAnswerToAnswerList(medicalQuestion1, "Tibia", false);
        addAnswerToAnswerList(medicalQuestion1, "Fibula", false);
        addQuestionToQuestionList(medicalQuestion1, this.medicalQuestionsQuiz);

        Question medicalQuestion2 = new Question("Which drug is used primary during CPR? " + oneAnswer);
        addAnswerToAnswerList(medicalQuestion2, "Apaurin", false);
        addAnswerToAnswerList(medicalQuestion2, "Tensamin", false);
        addAnswerToAnswerList(medicalQuestion2, "Cordarone", false);
        addAnswerToAnswerList(medicalQuestion2, "Adrenaline", true);
        addQuestionToQuestionList(medicalQuestion2, this.medicalQuestionsQuiz);

        Question medicalQuestion3 = new Question("What are basic vital signs? " + moreAnswers);
        addAnswerToAnswerList(medicalQuestion3, "Body Temperature", true);
        addAnswerToAnswerList(medicalQuestion3, "Pulse Rate", true);
        addAnswerToAnswerList(medicalQuestion3, "Respiration Rate", true);
        addAnswerToAnswerList(medicalQuestion3, "Blood Pressure", true);
        addAnswerToAnswerList(medicalQuestion3, "The patient's mood", false);
        addQuestionToQuestionList(medicalQuestion3, this.medicalQuestionsQuiz);

        QuizList.QUIZ_LIST.add(this.mathQuiz);
        QuizList.QUIZ_LIST.add(this.capitalCitiesQuiz);
        QuizList.QUIZ_LIST.add(this.medicalQuestionsQuiz);
    }
}
