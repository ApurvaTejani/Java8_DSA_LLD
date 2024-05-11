package MethodChallenge;

public class MinToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-32);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid value");
        else {
            int year = (int) (minutes / (60 * 24 * 365));
            int day = (int) ((minutes / (24 * 60)) % 365);
            System.out.println(minutes + " min = " + year + " y and " + day + " d.");
        }
    }
}
