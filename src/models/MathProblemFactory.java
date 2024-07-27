package models;

import java.util.Random;

public class MathProblemFactory {

    public static MathProblem createProblem(String difficulty) {
        Random random = new Random();
        int num1, num2;
        switch (difficulty) {
            case "Easy":
                num1 = random.nextInt(10) + 1;
                num2 = random.nextInt(10) + 1;
                return new MathProblem(num1 + " + " + num2, num1 + num2);
            case "Medium":
                num1 = random.nextInt(20) + 1;
                num2 = random.nextInt(20) + 1;
                return new MathProblem(num1 + " * " + num2, num1 * num2);
            case "Hard":
                num1 = random.nextInt(50) + 1;
                num2 = random.nextInt(49) + 2; // Avoid division by zero
                return new MathProblem(num1 + " / " + num2, num1 / num2);
            default:
                throw new IllegalArgumentException("Invalid difficulty: " + difficulty);
        }
    }
}
