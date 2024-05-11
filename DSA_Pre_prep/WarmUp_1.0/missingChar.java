package CodingBat.WarmUp;

// Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

// missingChar("kitten", 1) → "ktten"
// missingChar("kitten", 0) → "itten"
// missingChar("kitten", 4) → "kittn"
public class missingChar {
    public static void main(String[] args) {
        System.out.print(missingChar("kitten", 4));
    }

    public static String missingChar(String str, int n) {
        char[] letters = str.toCharArray();
        char[] newLetters = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (i == n) {
                continue;
            }
            newLetters[i] = letters[i];
        }
        System.out.println(newLetters.length);
        String string = String.valueOf(newLetters).trim();
        return string;
    }
}
