package MethodChallenge;

public class methodChallenge {
    public static void displayHighScorePostion(String name, int result) {
        System.out.println(name + " managed to get into positon " + result + " on the high score list");
    }

    public static void main(String[] args) {

        int a[] = new int[] { 1500, 1000, 500, 100, 25 };
        String name[] = new String[] { "Naman", "Suresh", "Hitesh", "Jaggu", "Preeti" };
        for (int i = 0; i < a.length; i++) {
            int result = calculateHighScorePosition(a[i]);
            displayHighScorePostion(name[i], result);
        }
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000)
            result = 1;
        else if (score >= 500)
            result = 2;
        else if (score >= 100)
            result = 3;
        return result;

    }
}