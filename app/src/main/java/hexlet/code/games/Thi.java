package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Thi extends Engine {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    @Override
    public void taskGame() {
        System.out.println("What is the result of the expression?");
    }
    @Override
    public void gameLogic(String name) {
        int numberAttempts = 0;
        while (numberAttempts < 3) {
            int randomNumber1 = random.nextInt(101);
            int randomNumber2 = random.nextInt(101);
            char operator = getRandomOperator(random);
            System.out.println("Question: " + randomNumber1 + operator + randomNumber2);
            System.out.print("Your answer: ");
            //String answer = scanner.nextLine();
            int answer = scanner.nextInt();
            scanner.nextLine();
            int correctAnswer = 0;

            if (operator=='+') {
                correctAnswer = randomNumber1 + randomNumber2;
            } else if (operator=='-') {
                correctAnswer = randomNumber1 - randomNumber2;
            } else if (operator=='*') {
                correctAnswer = randomNumber1 * randomNumber2;
            }

            if (answer==correctAnswer) {
                System.out.println("Correct!");
                numberAttempts++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
        }
    }
    private char getRandomOperator(Random random) {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0: return '+';
            case 1: return '-';
            case 2: return '*';
            default: return '*';
        }
    }
}

