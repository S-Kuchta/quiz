package answer;

import enums.NumberToLetter;

public class Answer {
    private final String answerText;
    private String answerOrder;
    private final boolean correct;

    public Answer(String answerText, boolean correct) {
        this.answerText = answerText;
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

    public void setAnswerOrder(int number) {
        this.answerOrder = NumberToLetter.getStringFromValue(number);
    }

}
