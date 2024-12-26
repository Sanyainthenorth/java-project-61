package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);
    public static String welcomeUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
