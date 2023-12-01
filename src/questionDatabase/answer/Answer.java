package questionDatabase.answer;

public class Answer {
    private String answer;
    private String order;
    private boolean correct;

    public Answer(String order, String answer, boolean correct) {
        this.answer = answer;
        this.order = order;
        this.correct = correct;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
