package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int number1, int number2) {
        Random RANDOM = new Random();
        return RANDOM.nextInt(number1, number2);

    }
}
