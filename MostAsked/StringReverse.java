package MostAsked;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.next();
            char[] letters = s.toCharArray();
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
        } finally {
            sc.close();
        }
    }
}
