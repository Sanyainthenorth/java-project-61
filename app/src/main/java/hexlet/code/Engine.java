package hexlet.code;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static String greetingUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    private static final int MAX_ATTEMPTS = 3;
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);

    public static int getRandomInt(int number1, int number2) {
        Random RANDOM = new Random();
        return RANDOM.nextInt(number1, number2);

    }

    public static void runGameLogic(String name, String gameType) {
        int numberAttempts = 0;
        String taskDescription = getTaskDescription(gameType);
        System.out.println(taskDescription);
        while (numberAttempts < MAX_ATTEMPTS) {
            String question = getQuestion(gameType);
            String correctAnswer = getCorrectAnswer(gameType, question);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = INPUT_SCANNER.nextLine().toLowerCase();

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

    private static void endGame(String name) {

        System.out.println("Congratulations, " + name + "!");
    }
    private static String getTaskDescription(String gameType) {
        switch (gameType) {
            case "Even": return Even.getTaskDescription();
            case "Calc": return Calc.getTaskDescription();
            case "GCD": return GCD.getTaskDescription();
            case "Progression": return Progression.getTaskDescription();
            case "Prime": return Prime.getTaskDescription();
            default: throw new IllegalArgumentException("Unknown game type: " + gameType);
        }
    }
    private static String getQuestion(String gameType) {
        switch (gameType) {
            case "Even":
                return Even.getQuestion();
            case "Calc":
                return Calc.getQuestion();
            case "GCD":
                return GCD.getQuestion();
            case "Progression":
                return Progression.getQuestion();
            case "Prime":
                return Prime.getQuestion();
            default: throw new IllegalArgumentException("Неизвестный тип игры: " + gameType);
        }
    }

    private static String getCorrectAnswer(String gameType, String question) {
        switch (gameType) {
            case "Even":
                return Even.getCorrectAnswer(question);
            case "Calc":
                return Calc.getCorrectAnswer(question);
            case "GCD":
                return GCD.getCorrectAnswer(question);
            case "Progression":
                return Progression.getCorrectAnswer();
            case "Prime":
                return Prime.getCorrectAnswer();
            default: throw new IllegalArgumentException("Неизвестный тип игры: " + gameType);
        }
    }
}
