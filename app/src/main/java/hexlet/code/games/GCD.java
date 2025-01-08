package hexlet.code.games;
import java.util.Random;

public class GCD {
    private static final Random RANDOM = new Random();

    public static String getQuestion() {
        int number1 = RANDOM.nextInt(50);
        int number2 = RANDOM.nextInt(50);
        return number1 + " " + number2;
    }
    public static String getTaskDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int number1 = Integer.parseInt(parts[0]);
        int number2 = Integer.parseInt(parts[1]);
        int result = findGCD(number1, number2);
        return Integer.toString(result);
    }

    private static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}

