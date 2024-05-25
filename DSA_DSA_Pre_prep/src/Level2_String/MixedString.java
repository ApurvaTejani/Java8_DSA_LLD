package Level2_String;
// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"

import java.util.ArrayList;

// Having issue with the code logic
public class MixedString {
    public static void main(String[] args) {

        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        ArrayList<Character> output = new ArrayList<>();
        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                output.add(str1.charAt(i));
                output.add(str2.charAt(i));
            }
        } else if (l1 > l2) {
            for (int i = 0; i < l2; i++) {
                output.add(str1.charAt(i));
                output.add(str2.charAt(i));
            }
            for (int i = l2; i < l1; i++) {
                output.add(str1.charAt(i));
            }
        } else if ((l2 > l1)) {
            for (int i = 0; i < l1; i++) {
                output.add(str1.charAt(i));
                output.add(str2.charAt(i));
            }
            for (int i = l1; i < l2; i++) {
                output.add(str2.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c :
                output) {
            sb.append(c);
        }
        String str = new String(sb);
        return str;

    }
}
