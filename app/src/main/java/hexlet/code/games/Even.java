package hexlet.code.games;

import hexlet.code.Utils;

public class Even {

    public static String getTaskDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] qa = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int number = Utils.getRandomInt(0, 100);
            String correctAnswer = isEven(number) ? "yes" : "no";
            qa[i][0] = Integer.toString(number);
            qa[i][1] = correctAnswer;
        }
        return qa;
    }
    public static boolean isEven (int number) {
        return number%2==0;
    }
}
