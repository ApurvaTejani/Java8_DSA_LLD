package MostAsked;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int r = number % 10;
            sum = sum + r;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
