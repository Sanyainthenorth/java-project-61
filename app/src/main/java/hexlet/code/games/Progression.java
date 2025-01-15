package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {
    private static String correctAnswer;
    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }
    public static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
    public static String getQuestion() {
        int start = Engine.getRandomInt(0, 10);;
        int step = Engine.getRandomInt(1, 6); // шаг в прогрессии
        int progressionLength = 10;
        int missingIndex = Engine.getRandomInt(1, progressionLength);

        int[] progression = generateProgression(start, step, progressionLength);
        correctAnswer = Integer.toString(progression[missingIndex]);
        return missingNumber(progression, missingIndex);
    }
    private static String missingNumber (int[] progression, int missingIndex) {
        String[] progressionStrings = new String[progression.length];

        for (int i = 0; i < progression.length; i++) {
            if (i == missingIndex) {
                progressionStrings[i] = "..";
            } else {
                progressionStrings[i] = Integer.toString(progression[i]);
            }
        }
        return String.join(" ", progressionStrings);
    }
    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}



