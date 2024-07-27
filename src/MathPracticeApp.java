import javax.swing.SwingUtilities;
import controllers.AppController;

public class MathPracticeApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppController().startApp());
    }
}
