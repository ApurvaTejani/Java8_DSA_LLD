
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

// repeatEnd("Hello", 3) → "llollollo"  // 2
// repeatEnd("Hello", 2) → "lolo"// 3
// repeatEnd("Hello", 1) → "o"//4
public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
    }

    public static String repeatEnd(String str, int c) {
        String str1 = str.substring(str.length() - c);
        String[] strArr = new String[c];
        String newStr = "";
        for (int i = 0; i < c; i++) {
            strArr[i] = str1;
            newStr = newStr.concat(strArr[i]);
        }

        return newStr;
    }
}
