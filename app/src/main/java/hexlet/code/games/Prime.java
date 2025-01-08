package hexlet.code.games;
import java.util.Random;

public class Prime {
    private static final Random RANDOM = new Random();
    private static String correctAnswer;
    public static String getTaskDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String getQuestion() {
        int number = RANDOM.nextInt(100);
        correctAnswer = isPrime(number) ? "yes" : "no";
        return Integer.toString(number);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

