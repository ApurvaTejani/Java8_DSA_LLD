package CodingBat.Level2_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

// sameStarChar("xy*yzz") → true
// sameStarChar("xy*zzz") → false
// sameStarChar("*xa*az") → true

// =================================Logic issues resolved===========================
public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("**"));

    }

    public static boolean sameStarChar(String str) {
        ArrayList list = new ArrayList<>();
        char[] letters = str.toCharArray();
        if (!str.contains("*"))
            return true;
        for (int z = 0; z < str.length(); z++) {
            if (letters[z] == '*' && (z != 0 && z != str.length() - 1))
                list.add(1);
        }
        boolean flag[] = new boolean[list.size()];
        int j = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && (i != 0 && i != str.length() - 1)) {
                if (str.charAt(i - 1) == str.charAt(i + 1))
                    flag[j] = true;
                j++;
            }
        }

        for (boolean f : flag) {
            if (f == true)
                count++;
        }

        if (count == list.size())
            return true;

        return false;
    }

}
