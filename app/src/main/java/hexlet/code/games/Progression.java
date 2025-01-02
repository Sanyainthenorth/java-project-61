package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Progression extends Engine{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    @Override
    public void taskGame() {

        System.out.println("What number is missing in the progression?");
    }
    @Override
    public void gameLogic(String name) {
        int numberAttempts = 0;
        while (numberAttempts < 3) {
            int firstNum = random.nextInt(31);
            int step = random.nextInt(1,7);
            int pass = random.nextInt(10);
            int correctAnswer = 0;
            StringBuilder result = new StringBuilder();
            for (int i=0; i<10; i++){
                int currentNum = firstNum + step * i;
                if (i == pass) {
                    result.append(" ..");
                    correctAnswer = currentNum;
                } else {
                    if (i == 0) {
                        result.append(currentNum);
                    } else {
                        result.append(" " + currentNum);
                    }
                }
            }
            System.out.println("Question: " + result.toString());
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            scanner.nextLine();
            if (answer==correctAnswer) {
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
}
