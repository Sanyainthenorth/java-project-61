package hexlet.code;

import hexlet.code.games.Sec;
import hexlet.code.games.Thi;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Engine engine = new Engine();
                engine.greetingUser();
                break;
            case 2:
                Sec evenGame = new Sec();
                evenGame.playGame();
                break;
            case 3:
                Thi calcGame = new Thi();
                calcGame.playGame();
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
