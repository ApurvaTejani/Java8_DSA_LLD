package Methods_Java.Exercise;

import java.util.Arrays;

public class Sum_1st_Last {
    public static void main(String[] args) {

        // Write a method named sumFirstAndLastDigit with one parameter of type int
        // called number.
        // test cases:
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(7));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int num) {

        if (num < 0)
            return -1;
        else if (num == 0)
            return 0;
        int sum = 0;
        int count = 0;
        int num1 = num;
        while (num1 > 0) {
            num1 = num1 / 10;
            count++;
        }

        int result[] = new int[count];

        int i = 0;
        while (num > 0) {
            result[i] = num % 10;
            num = num / 10;
            i++;
        }
        sum = result[0] + result[result.length - 1];

        return sum;
    }
}
