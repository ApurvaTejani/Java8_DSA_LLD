package DSA_Pre_prep.Level2_String;

// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

// xyzThere("abcxyz") → true
// xyzThere("abc.xyz") → false
// xyzThere("xyz.abc") → true
public class XYZTHere {
    public static void main(String[] args) {
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str) {
        int count = 0;
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length - 2; i++) {
            if ((letters[i] == 'x' && letters[i + 1] == 'y') && (letters[i + 2] == 'z')) {
                if (i != 0) {
                    if (letters[i - 1] != '.')
                        count++;
                } else if (i == 0) {
                    count++;
                }
            }
        }
        if (count >= 1)
            return true;
        else
            return false;
    }
}
