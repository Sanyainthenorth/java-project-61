package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    public static void startGame(String name) {
        String taskDescription = getTaskDescription();
        String[][] qa = getQuestionsAndAnswers();
        Engine.runGameLogic(name, taskDescription, qa);
    }
    public static String getTaskDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] qa = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = Utils.getRandomInt(0, 100);
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
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


