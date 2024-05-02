package CodingBat.Level2_String;

// Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

// oneTwo("abc") → "bca"
// oneTwo("tca") → "cat"
// oneTwo("tcagdo") → "catdog"
public class OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("1234567890"));
    }

    public static String oneTwo(String str) {
        char[] letters = str.toCharArray();
        char temp;
        int rem = letters.length - (letters.length % 3);// 10 % 3 =1 7%3 =1 2%3 = 2
        if (letters.length < 3)
            return "";
        if (letters.length >= 3) {
            for (int i = 0; i < rem; i = i + 3) { // tcagdo //3
                temp = letters[i];
                letters[i] = letters[i + 1];// c //
                letters[i + 1] = letters[i + 2];// a
                letters[i + 2] = temp;// t
            }
        }

        String newStr = String.valueOf(letters).trim().substring(0, rem);
        return newStr;
    }
}
