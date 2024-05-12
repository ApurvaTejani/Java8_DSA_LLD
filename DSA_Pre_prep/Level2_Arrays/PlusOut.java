package DSA_Pre_prep.Level2_Arrays;

// Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

// plusOut("12xy34", "xy") → "++xy++"
// plusOut("12xy34", "1") → "1+++++"
// plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("abXYabcXYZ", "abc"));
    }

    public static String plusOut(String str, String keeper) {
        char[] letters = str.toCharArray();
        int len = keeper.length();
        for (int i = 0; i < letters.length; i++) {
            String t = Character.toString(letters[i]);
            if (keeper.contains(t)) {
                String substr = str.substring(i, len + i);
                if (substr.equals(keeper)) {
                    for (int j = i; j < i + len; j++) {
                        letters[j] = letters[j];
                    }
                    i = i + len - 1;
                } else {
                    letters[i] = '+';
                }

            } else {
                letters[i] = '+';
            }
        }
        String s = new String(letters);
        return s;

    }
}
