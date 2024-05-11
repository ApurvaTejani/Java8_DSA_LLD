
// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"
public class StringX {

    public static void main(String[] args) {
        System.out.println(stringX("abxxxcd"));
    }

    public static String stringX(String str) {
        String newStr = "";
        char[] letters = str.toCharArray();
        char[] newLetters = new char[letters.length];
        int j = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'x') {
                // i != 0
                // i != letters.length - 1
                if (!(i == 0 || i == letters.length - 1))
                    continue;
            }

            newLetters[j] = letters[i];
            j++;
        }
        newStr = new String(newLetters).trim();
        return newStr;
    }
}