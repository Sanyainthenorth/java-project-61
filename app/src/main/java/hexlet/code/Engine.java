package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);
    private static final int MAX_ROUNDS = 3;
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 100;

    public static int getRounds() {
        return MAX_ROUNDS;
    }

    public static String greetingUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = INPUT_SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void runGameLogic(String name, String taskDescription, String[][] qa) {
        System.out.println(taskDescription);

        int correctAnswersCount = 0;

        for (String[] pair : qa) {
            String question = pair[0];
            String correctAnswer = pair[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = INPUT_SCANNER.nextLine().toLowerCase();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            if (correctAnswersCount == MAX_ROUNDS) {
                System.out.println("Congratulations, " + name + "!");
                return;
            }
        }
    }
}
