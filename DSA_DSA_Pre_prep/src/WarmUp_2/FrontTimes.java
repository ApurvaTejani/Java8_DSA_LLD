package WarmUp_2;
// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"

import java.util.Scanner;

public class FrontTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String name");
        String str = sc.nextLine();
        System.out.println("Enter the number of times repeated :");
        int n = sc.nextInt();
        System.out.println(frontTimes(str, n));
    }

    public static String frontTimes(String str, int n) {
        String str1 = "";
        if (str.length() >= 3) {
            str = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            str1 = str1.concat(str);
        }
        return str1;
    }

}
