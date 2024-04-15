package CodingBat.Level2_String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

// sameStarChar("xy*yzz") → true
// sameStarChar("xy*zzz") → false
// sameStarChar("*xa*az") → true
public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("*12*2*2"));
    }

    public static boolean sameStarChar(String str) {
        boolean[] flag = new boolean[str.length()];
        int j = 0;
        if (str.contains("*")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*' && (i != 0 && i != str.length() - 1)) {
                    if (str.charAt(i - 1) == str.charAt(i + 1))
                        flag[j] = true;
                    j++;
                }
            }
            Set<Boolean> s = new HashSet<>(Arrays.asList(flag));
            if (s.size() == 1) {
                return true;
            }
        }
        return false;
    }
}
