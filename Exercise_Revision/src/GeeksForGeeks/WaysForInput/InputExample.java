package GeeksForGeeks.WaysForInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) throws IOException {
//        Regular expressions can be used to find tokens.
//        The reading methods are not synchronized
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Reading password without echoing the entered characters.
//                Reading methods are synchronized.
//        Does not work in non-interactive environment (such as in an IDE).
//        String s = System.console().readLine();
        int x = sc.nextInt();
        int y = Integer.parseInt(br.readLine());
        sc.nextLine();
        System.out.println("From Scanner " + x + " From Buffered Reader " + y);
        String s1 = sc.nextLine();
        String s2 = br.readLine();
        System.out.println("From Scanner " + s1 + " From Buffered Reader " + s2);
        char c1 = br.readLine().charAt(0);
        char c2 = sc.nextLine().charAt(0);
        System.out.println("From Scanner " + c1 + " From Buffered Reader " + c2);
        double d1 = sc.nextDouble();
        double d2 = Double.parseDouble(br.readLine());
        System.out.println("From Scanner " + d1 + " From Buffered Reader " + d2);
    }
}
