// Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
package DSA_Pre_prep.Level2_Arrays;

// repeatFront("Chocolate", 4) → "ChocChoChC"
// repeatFront("Chocolate", 3) → "ChoChC"
// repeatFront("Ice Cream", 2) → "IcI"
public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Ice Cream", 2));
    }

    public static String repeatFront(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            String subString = str.substring(0, n - i);
            newString = newString.concat(subString);
        }
        return newString;

    }
}
