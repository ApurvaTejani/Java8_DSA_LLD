package DSA_Pre_prep.Level2_String;

import java.util.ArrayList;
import java.util.Arrays;

// We'll say that a String is xy-balanced if for all the'x'chars in the string,there exists a'y'char somewhere later in the string.So"xxy"is balanced,but"xyx"is not.One'y'can balance multiple'x's.Return true if the given string is xy-balanced.

// xyBalance("aaxbby")→true 
// xyBalance("aaxbb")→false 
// xyBalance("yaaxbb")→false
public class XYBalanced {
    public static void main(String[] args) {
        System.out.println(xyBalance(""));
    }

    public static boolean xyBalance(String str) {
        if (str.isEmpty() || !(str.contains("x")))
            return true;
        else if (str.charAt(str.length() - 1) == 'x')
            return false;
        ArrayList<Boolean> flag = new ArrayList<>();
        int lastX = str.lastIndexOf('x');
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && i == lastX) {
                for (int k = i + 1; k < str.length(); k++) {
                    if (str.charAt(k) == 'y') {
                        flag.add(true);
                    }
                }

            }
        }
        boolean finalVal = false;
        if (flag.size() > 0)
            finalVal = flag.get(0);
        return finalVal;
    }
}
