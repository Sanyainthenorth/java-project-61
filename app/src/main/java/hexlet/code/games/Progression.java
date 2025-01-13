package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    private static String correctAnswer;
    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }
    public static String getQuestion() {
        int start = Engine.getRandomInt(0, 10);;
        int step = Engine.getRandomInt(0, 6); // шаг в прогрессии
        int missingIndex = Engine.getRandomInt(1, 10);;
        StringBuilder progression = new StringBuilder();

        correctAnswer = "";

        for (int i = 0; i < 10; i++) {
            int currentNumber = start + i * step;

            if (i == missingIndex) {
                progression.append(" ..");
                correctAnswer = Integer.toString(currentNumber);
            } else {
                if (i == 0) {
                    progression.append(currentNumber);
                } else {
                    progression.append(" " + currentNumber);
                }
            }
        }

        return progression.toString();
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}



