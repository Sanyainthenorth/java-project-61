package hexlet.code.games;

import hexlet.code.Utils;

public class GCD {

    public static String getTaskDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] qa = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number1 = Utils.getRandomInt(0, 50);
            int number2 = Utils.getRandomInt(0, 50);
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


