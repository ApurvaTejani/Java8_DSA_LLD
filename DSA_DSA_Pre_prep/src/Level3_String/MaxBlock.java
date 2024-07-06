package Level3_String;

import java.util.*;

//Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//
//
//        maxBlock("hoopla") → 2
//        maxBlock("abbCCCddBBBxx") → 3
//        maxBlock("") → 0

// Issue with the logic
public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    public static int maxBlock(String str) {
        char[] letters = str.toCharArray();
        int count = 1;
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < letters.length - 1; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i] == letters[i + j]) {
                    count++;
                } else
                    break;
            }

        }

        return count;
    }
}
