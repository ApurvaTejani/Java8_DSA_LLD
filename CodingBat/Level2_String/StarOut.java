package CodingBat.Level2_String;

// Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

// starOut("ab*cd") → "ad"
// starOut("ab**cd") → "ad"
// starOut("sm*eilly") → "silly"
public class StarOut {
    public static void main(String[] args) {
        starOut("ab**cd");
    }

    public static String starOut(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
                String lstr = str.substring(0, i - 1);
                String rstr = str.substring(i + 2, str.length());
                str = lstr.concat(rstr);
            } else if (str.charAt(i) == '*' && str.charAt(i + 1) == '*') {
                String lstr = str.substring(0, i - 1);
                String rstr = str.substring(i + 3, str.length());
                str = lstr.concat(rstr);
            }
        }
        return str;
    }
}
