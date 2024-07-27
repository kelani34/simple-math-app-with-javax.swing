package ui;

public class FeedbackHandler {

    public static void checkAnswer(MainFrame frame) {
        try {
            int userAnswer = Integer.parseInt(frame.answerTextField.getText());
            int correctAnswer = (int) frame.submitButton.getClientProperty("correctAnswer");
            if (userAnswer == correctAnswer) {
                frame.feedbackLabel.setText("Correct!");
                frame.scoreLabel.setText("Score: " + (Integer.parseInt(frame.scoreLabel.getText().split(": ")[1]) + 1));
                frame.progressBar.setValue(frame.progressBar.getValue() + 1);
            } else {
                frame.feedbackLabel.setText("Incorrect. Try again.");
            }
        } catch (NumberFormatException e) {
            frame.feedbackLabel.setText("Please enter a valid number.");
        }
    }
}
