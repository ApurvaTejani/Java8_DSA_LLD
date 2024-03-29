package MostAsked;

import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        for (String w : words) {
            char[] letters = w.toCharArray();
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
            System.out.print(" ");
        }
    }
}
