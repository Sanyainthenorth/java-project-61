package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String name = null;

        switch (choice) {
            case 1:
                name = Engine.greetingUser();
                break;
            case 2:
                name = Engine.greetingUser();
                Engine.runGameLogic(name, "Even");
                break;
            case 3:
                name = Engine.greetingUser();
                Engine.runGameLogic(name, "Calc");
                break;
            case 4:
                name = Engine.greetingUser();
                Engine.runGameLogic(name, "GCD");
                break;
            case 5:
                name = Engine.greetingUser();
                Engine.runGameLogic(name, "Progression");
                break;
            case 6:
                name = Engine.greetingUser();
                Engine.runGameLogic(name, "Prime");
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Incorrect choice, please try again.");
                break;
        }
        scanner.close();
    }
}

