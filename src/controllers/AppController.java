package controllers;

import ui.*;

public class AppController {
    private MainFrame frame;
    private TimerHandler timerHandler;

    public AppController() {
        this.frame = new MainFrame();
        this.timerHandler = new TimerHandler(this);
    }

    public AppController(MainFrame frame) {
        this.frame = frame;
        this.timerHandler = new TimerHandler(this);
    }

    public void startApp() {
        timerHandler.startTimer();
    }

    public void startNewSession() {
        frame.scoreLabel.setText("Score: 0");
        frame.progressBar.setValue(0);
        generateProblem();
        timerHandler.startTimer();
    }

    public void generateProblem() {
        ProblemGenerator.generateProblem(frame);
    }

    public void checkAnswer() {
        FeedbackHandler.checkAnswer(frame);
    }

    public void updateTimerLabel(int timeLeft) {
        frame.timerLabel.setText("Time left: " + timeLeft + "s");
    }

    public void timeUp() {
        frame.feedbackLabel.setText("Time's up!");
    }
}
