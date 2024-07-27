package models;

public class MathProblem {
    private String question;
    private int answer;

    public MathProblem(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }
}
