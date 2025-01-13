package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static String getQuestion() {
        int number1 = Engine.getRandomInt(0, 100);
        int number2 = Engine.getRandomInt(0, 100);
        char operator = getRandomOperator();
        return number1 + " " + operator + " " + number2;
    }
    public static String getTaskDescription() {
        return "What is the result of the expression?";
    }
    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");  // Разделяем по пробелам
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


    private static char getRandomOperator() {
        int choice = Engine.getRandomInt(0, 1);;
        switch (choice) {
            case 0: return '+';
            case 1: return '-';
            case 2: return '*';
            default: return '+';
        }
    }
}


