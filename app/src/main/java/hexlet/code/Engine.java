package hexlet.code;

import java.util.Scanner;

public class Engine {
    public String greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public void taskGame() {

    }
    public void gameLogic(String name) {

    }
    public void endGame(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
    public void playGame() {
        String name = greetingUser();
        taskGame();
        gameLogic(name);
        endGame(name);
    }
}
