package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import controllers.AppController;

public class EventHandlers {

    public static void setupEventHandlers(MainFrame frame, JMenuItem newSessionMenuItem, JMenuItem exitMenuItem) {
        AppController controller = new AppController(frame);

        frame.difficultyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.generateProblem();
            }
        });

        frame.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkAnswer();
            }
        });

        newSessionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.startNewSession();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        controller.startNewSession();
    }
}
