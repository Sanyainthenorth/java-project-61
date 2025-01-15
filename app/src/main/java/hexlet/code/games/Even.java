package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static String getTaskDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static String getQuestion() {
        int number = Engine.getRandomInt(0, 100);
        return Integer.toString(number);
    }

    public static boolean getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return number % 2 == 0;
    }
}

