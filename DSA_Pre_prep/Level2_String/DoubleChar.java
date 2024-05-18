
// Given a string, return a string where for every char in the original, there are two chars.

// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"
public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("AAbb"));
    }

    public static String doubleChar(String str) {
        char[] letters = str.toCharArray();
        int j = 0;
        char[] newletters = new char[2 * letters.length];

        for (int i = 0; i < letters.length; i++) {
            newletters[j] = letters[i];
            j++;
            newletters[j] = letters[i];
            j++;
        }
        String newStr = new String(newletters);
        return newStr;
    }
}
