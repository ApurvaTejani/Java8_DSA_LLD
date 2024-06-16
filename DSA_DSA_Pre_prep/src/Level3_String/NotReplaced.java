package Level3_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//
//        notReplace("is test") → "is not test"
//        notReplace("is-is") → "is not-is not"
//        notReplace("This is right") → "This is not right"

// Issue with the logic
public class NotReplaced {
    public static void main(String[] args) {
        System.out.println(notReplacedMethod("is"));
    }

    public static String notReplacedMethod(String str) {
        if (str.equals("is"))
            return str.concat(" not");
        char[] letters = str.toCharArray();

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'i' && letters[i + 1] == 's') {
                if (i == 0) {
                    if (!Character.isLetter(letters[i + 2]))
                        sb.replace(i, i + 2, "is not");

                } else if (i == str.length() - 2) {
                    if (!Character.isLetter(letters[i - 1]))
                        sb.append(" not");

                } else if (!Character.isLetter(letters[i + 2]) && !Character.isLetter(letters[i - 1])) {
                    sb.replace(i, i + 2, "is not");

                }
            }
        }

        return new String(sb);
    }
}
