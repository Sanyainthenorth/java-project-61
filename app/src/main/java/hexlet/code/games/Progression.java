package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
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
        int rounds = Engine.rounds;
        String[][] qa = new String[rounds][2];
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





