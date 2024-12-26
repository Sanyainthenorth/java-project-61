package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Sec {
    public static void secondGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Cli.welcomeUser();
        String name = Cli.welcomeUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int randomNumber = random.nextInt(101);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Incorrect input. Answer 'yes' or 'no'.");
                continue;
            }

            if (randomNumber % 2 == 0 && answer.equals("yes") || randomNumber % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
