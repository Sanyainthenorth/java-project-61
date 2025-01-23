package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] qa = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int start = Utils.getRandomInt(0, 10);
            int step = Utils.getRandomInt(1, 6);
            int progressionLength = 10;
            int missingIndex = Utils.getRandomInt(1, progressionLength);

            int[] progression = generateProgression(start, step, progressionLength);
            String[] progressionStrings = new String[progression.length];
            String correctAnswer = Integer.toString(progression[missingIndex]);
            progressionStrings[missingIndex] = "..";

            for (int j = 0; j < progression.length; j++) {
                if (j != missingIndex) {
                    progressionStrings[j] = Integer.toString(progression[j]);
                }
            }

            String question = String.join(" ", progressionStrings);
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}





