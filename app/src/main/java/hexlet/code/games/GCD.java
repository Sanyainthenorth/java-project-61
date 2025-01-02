package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class GCD extends Engine {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    @Override
    public void taskGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public void gameLogic(String name) {

        for (int numberAttempts = 0; numberAttempts < 3; numberAttempts++) {
            int randomNumber1 = random.nextInt(101);
            int randomNumber2 = random.nextInt(101);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            scanner.nextLine();
            int correctAnswer = findGCD(randomNumber1, randomNumber2);
            if (answer==correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        endGame(name);

    }
    public static int findGCD(int randomNumber1, int randomNumber2) {
        while (randomNumber2 != 0) {
            int temp = randomNumber2;
            randomNumber2 = randomNumber1 % randomNumber2;
            randomNumber1 = temp;
        }
        return randomNumber1;
    }
}
