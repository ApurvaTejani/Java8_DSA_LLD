package Level3_String;

import java.util.ArrayList;
import java.util.Arrays;

//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//
//        notReplace("is test") → "is not test"
//        notReplace("is-is") → "is not-is not"
//        notReplace("This is right") → "This is not right"

// Issue with the logic
public class NotReplaced {
    public static void main(String[] args) {
        System.out.println(notReplacedMethod("This is right"));
    }

    public static String notReplacedMethod(String str) {

        char[] letters = str.toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length - 2; i++) {
            if (letters[i] == 'i' && letters[i + 1] == 's') {
                if (i == 0 && !Character.isLetter(letters[i + 2])) {
                    str = str.replace("is", "is not");
                } else if (i == str.length() - 1 && !Character.isLetter(letters[i - 1])) {
                    str = str.replace("is", "is not");
                } else if (!Character.isLetter(letters[i + 2]) && !Character.isLetter(letters[i - 1])) {
                    str = str.replaceFirst("is", "is not");
                }
            } else if (letters[i] != 'i' || letters[i] != 's') {
                sb.append(letters[i]);
            }
        }
        System.out.println(sb);
        return str;
    }
}
