package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void startGame() {
        String name = Engine.greetingUser();
        String taskDescription = getTaskDescription();
        String[][] qa = getQuestionsAndAnswers();
        Engine.runGameLogic(name, taskDescription, qa);
    }

    public static String getTaskDescription() {
        return "What is the result of the expression?";
    }

    public static String[][] getQuestionsAndAnswers() {
        int rounds = Engine.getRounds();
        String[][] qa = new String[rounds][2];

        for (int i = 0; i < rounds; i++) {
            int number1 = Utils.getRandomInt(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            int number2 = Utils.getRandomInt(Engine.MIN_NUMBER, Engine.MAX_NUMBER);

            char[] operators = {'+', '-', '*'};
            int randomIndex = Utils.getRandomInt(0, operators.length);
            char operator = operators[randomIndex];

            String question = number1 + " " + operator + " " + number2;
            int correctAnswer = getCorrectAnswer(number1, number2, operator);
            qa[i][0] = question;
            qa[i][1] = Integer.toString(correctAnswer);
        }
        return qa;
    }

    public static int getCorrectAnswer(int number1, int number2, char operator) {
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

        return result;
    }
}



