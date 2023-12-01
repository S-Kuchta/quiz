package question.answer;

public class Answer {
    private final String answerText;
    private final String answerOrder;
    private final boolean correct;

    public Answer(String answerOrder, String answerText, boolean correct) {
        this.answerText = answerText;
        this.answerOrder = answerOrder;
        this.correct = correct;
    }

    public String getAnswerText() {
        return answerText;
    }

    public String getAnswerOrder() {
        return answerOrder;
    }

    public boolean isCorrect() {
        return correct;
    }

}
