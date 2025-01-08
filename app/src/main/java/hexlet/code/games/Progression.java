package hexlet.code.games;
import java.util.Random;

public class Progression {
    private static final Random RANDOM = new Random();
    private static String correctAnswer;
    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }
    public static String getQuestion() {
        int start = RANDOM.nextInt(10);
        int step = RANDOM.nextInt(6); // шаг в прогрессии
        int missingIndex = RANDOM.nextInt(10);
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



