package hexlet.code.games;

import hexlet.code.Utils;

public class Calc {

    public static String getTaskDescription() {
        return "What is the result of the expression?";
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] qa = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number1 = Utils.getRandomInt(0, 100);
            int number2 = Utils.getRandomInt(0, 100);

            char[] operators = {'+', '-', '*'};
            int randomIndex = Utils.getRandomInt(0, 3);
            char operator = operators[randomIndex];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = getCorrectAnswer(question);
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
    }

    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int number1 = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int number2 = Integer.parseInt(parts[2]);
        int result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }

        return Integer.toString(result);
    }
}


