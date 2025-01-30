package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 6;
    private static final int MIN_INDEX = 1;
    private static final int MAX_INDEX = PROGRESSION_LENGTH;

    public static void startGame() {
        String name = Engine.greetingUser();
        String taskDescription = getTaskDescription();
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        Engine.runGameLogic(name, taskDescription, questionsAndAnswers);
    }

    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }

    public static String[][] getQuestionsAndAnswers() {
        int rounds = Engine.getRounds();
        String[][] qa = new String[rounds][2];
        for (int i = 0; i < rounds; i++) {
            int start = Utils.getRandomInt(Engine.MIN_NUMBER, Engine.MAX_NUMBER);
            int step = Utils.getRandomInt(MIN_STEP, MAX_STEP);
            int missingIndex = Utils.getRandomInt(MIN_INDEX, MAX_INDEX);

            String progressionString = generateProgression(start, step, PROGRESSION_LENGTH);
            String[] progressionStrings = progressionString.split(" ");

            String correctAnswer = progressionStrings[missingIndex];
            progressionStrings[missingIndex] = "..";

            String question = String.join(" ", progressionStrings);
            qa[i][0] = question;
            qa[i][1] = correctAnswer;
        }
        return qa;
    }

    private static String generateProgression(int start, int step, int length) {
        StringBuilder progression = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i > 0) {
                progression.append(" ");
            }
            progression.append(start + i * step);
        }

        return progression.toString();
    }
}





