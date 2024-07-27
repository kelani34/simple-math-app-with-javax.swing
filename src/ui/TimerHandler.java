package ui;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controllers.AppController;

public class TimerHandler {

    private Timer timer;
    private int timeLeft;
    private AppController controller;

    public TimerHandler(AppController controller) {
        this.controller = controller;
        timeLeft = 30; // seconds
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });
    }

    public void startTimer() {
        timeLeft = 30;
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    private void updateTimer() {
        timeLeft--;
        controller.updateTimerLabel(timeLeft);
        if (timeLeft <= 0) {
            timer.stop();
            controller.timeUp();
        }
    }
}
