package Level3_String;

import java.util.ArrayList;
import java.util.Arrays;

//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//
//        sumNumbers("abc123xyz") → 123
//        sumNumbers("aa11b33") → 44
//        sumNumbers("7 11") → 18
public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbersMethod("7 11"));
    }

    public static int sumNumbersMethod(String str) {
        String arr[] = str.split("[^0-9]+");
        ArrayList<Integer> al = new ArrayList<>();
        for (String a : arr) {
            if (!a.isEmpty())
                al.add(Integer.parseInt(a));
        }
        int sum = 0;
        for (int a : al) {
            sum = sum + a;
        }
        return sum;
    }
}
