
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0.0;
        while (true) {
            try {

                int Entry = sc.nextInt();
                sum = sum + Entry;
                count++;

            } catch (Exception e) {
                break;
            }
        }
        if (count <= 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            float newSum = (float) sum;
            float newCount = (float) count;
            avg = newSum / newCount;
            long newAvg = 0;
            newAvg = (long) (Math.round(avg));
            System.out.println("SUM = " + sum + " AVG = " + newAvg);

        }
    }
}
