package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Engine engine = new Engine();
                engine.greetingUser();
                break;
            case 2:
                Even evenGame = new Even();
                evenGame.playGame();
                break;
            case 3:
                Calc calcGame = new Calc();
                calcGame.playGame();
                break;
            case 4:
                GCD gcdGame = new GCD();
                gcdGame.playGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("it is wrong");
                break;
        }
        scanner.close();
    }
}
