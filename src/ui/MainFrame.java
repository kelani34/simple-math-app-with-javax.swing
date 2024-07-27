package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public JComboBox<String> difficultyComboBox;
    public JLabel problemLabel;
    public JTextField answerTextField;
    public JButton submitButton;
    public JLabel feedbackLabel;
    public JLabel scoreLabel;
    public JLabel timerLabel;
    public JProgressBar progressBar;

    public MainFrame() {
        setTitle("Math Practice Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newSessionMenuItem = new JMenuItem("Start New Session");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newSessionMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        difficultyComboBox = new JComboBox<>(new String[]{"Easy", "Medium", "Hard"});
        problemLabel = new JLabel();
        answerTextField = new JTextField();
        submitButton = new JButton("Submit");
        feedbackLabel = new JLabel();
        scoreLabel = new JLabel("Score: 0");
        timerLabel = new JLabel("Time left: 30s");
        progressBar = new JProgressBar(0, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Select Difficulty:"), gbc);
        gbc.gridx = 1;
        add(difficultyComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(problemLabel, gbc);
        gbc.gridx = 1;
        add(answerTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(submitButton, gbc);
        gbc.gridx = 1;
        add(feedbackLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(scoreLabel, gbc);
        gbc.gridx = 1;
        add(timerLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(progressBar, gbc);

        EventHandlers.setupEventHandlers(this, newSessionMenuItem, exitMenuItem);

        setVisible(true);
    }
}
