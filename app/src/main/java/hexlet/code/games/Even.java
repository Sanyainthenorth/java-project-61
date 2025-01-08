package hexlet.code.games;
import java.util.Random;

public class Even {
    private static final Random RANDOM = new Random();

    public static String getTaskDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static String getQuestion() {
        int number = RANDOM.nextInt(100);
        return Integer.toString(number);
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return (number % 2 == 0) ? "yes" : "no";
    }
}

