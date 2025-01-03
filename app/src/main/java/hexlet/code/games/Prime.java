package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Prime extends Engine {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    @Override
    public void taskGame() {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public void gameLogic(String name) {
        int numberAttempts = 0;
        while (numberAttempts < 3) {
            int randomNum = random.nextInt(100);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toLowerCase();

            String correctAnswer = isPrime(randomNum) ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                numberAttempts++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        endGame(name);
    }
        public static boolean isPrime(int randomNum) {
            if (randomNum <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(randomNum); i++) {
                if (randomNum % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

