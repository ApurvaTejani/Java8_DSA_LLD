package Level2_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//
//
//        wordEnds("abcXY123XYijk", "XY") → "c13i"
//        wordEnds("XY123XY", "XY") → "13"
//        wordEnds("XY1XY", "XY") → "11"
public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        StringBuilder sb = new StringBuilder();
        if (str1.isEmpty() || str1.equals(str2))
            return "";

        for (int i = 0; i < str1.length() - l2; i++) {
            if (str1.substring(i, i + l2).equals(str2) && i == 0) {
                sb.append(str1.charAt(l2));
            } else if (str1.substring(i, i + l2).equals(str2)) {
                sb.append(str1.charAt(i - 1));
                sb.append(str1.charAt(i + l2));
            }
        }
        if (str1.substring(l1 - l2, l1).equals(str2)) {
            sb.append(str1.charAt(l1 - l2 - 1));
        }

        return new String(sb);
    }

}
