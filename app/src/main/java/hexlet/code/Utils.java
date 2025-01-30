package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    public static int getRandomInt(int number1, int number2) {
        return RANDOM.nextInt(number1, number2);

    }
}
