package Level3_String;

import java.util.ArrayList;
import java.util.List;

//Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//
//        withoutString("Hello there", "llo") → "He there"
//        withoutString("Hello there", "e") → "Hllo thr"
//        withoutString("Hello there", "x") → "Hello there"

// Issue with the logic ...need to revisit
public class WithoutString {
    public static void main(String[] args) {

        System.out.println(withoutString("This is a FISH", "IS"));
    }

    public static String withoutString(String str1, String str2) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length() - str2.length(); i++) {
            if (str2.equalsIgnoreCase((str1.substring(i, i + str2.length())))) {
                i = i + str2.length() - 1;
            } else {
                sb.append(str1.charAt(i));
            }

        }
        String newStr = "";
        int beginIndex = str1.length() - str2.length();
        if (!str1.substring(beginIndex).equalsIgnoreCase(str2)) {

            newStr = str1.substring(beginIndex);
        }
        sb.append(newStr);
        System.out.println(newStr);

        return new String(sb);
    }
}
