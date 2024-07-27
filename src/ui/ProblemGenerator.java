package ui;

import models.MathProblem;
import models.MathProblemFactory;

public class ProblemGenerator {

    public static void generateProblem(MainFrame frame) {
        String difficulty = (String) frame.difficultyComboBox.getSelectedItem();
        MathProblem problem = MathProblemFactory.createProblem(difficulty);

        frame.problemLabel.setText("Solve: " + problem.getQuestion());
        frame.answerTextField.setText("");
        frame.feedbackLabel.setText("");
        frame.submitButton.putClientProperty("correctAnswer", problem.getAnswer());
    }
}
