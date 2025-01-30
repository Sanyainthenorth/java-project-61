package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void startGame() {
        String name = Engine.greetingUser();
        String taskDescription = getTaskDescription();
        String[][] qa = getQuestionsAndAnswers();
        Engine.runGameLogic(name, taskDescription, qa);
    }

    public static String getTaskDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] getQuestionsAndAnswers() {
        int rounds = Engine.getRounds();
        String[][] qa = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int number1 = Utils.getRandomInt(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            int number2 = Utils.getRandomInt(Engine.MIN_NUMBER, Engine.MAX_NUMBER);

            String question = number1 + " " + number2;
            String correctAnswer = getCorrectAnswer(number1, number2);
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
    }

    public static String getCorrectAnswer(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return Integer.toString(number1);
    }
}



