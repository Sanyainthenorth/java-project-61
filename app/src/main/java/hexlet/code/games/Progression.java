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

            String progressionString = generateProgression(start, step, progressionLength);
            String[] progressionStrings = progressionString.split(" ");

            String correctAnswer = progressionStrings[missingIndex];;
            progressionStrings[missingIndex] = "..";

            String question = String.join(" ", progressionStrings);
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
    }

    private static String generateProgression(int start, int step, int length) {
        String progression = "";

        for (int i = 0; i < length; i++) {
            if (i > 0) {
                progression += " ";
            }
            progression += (start + i * step);
        }

        return progression;
    }
}





