package Level3_String;

import java.util.Arrays;

//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//
//
//        countYZ("fez day") → 2
//        countYZ("day fez") → 2
//        countYZ("day fyyyz") → 2
public class CountYZ {
    public static void main(String[] args) {
        CountYZ yz = new CountYZ();
        System.out.println(yz.countYZMethod("DAY abc XYZ"));

    }

    public int countYZMethod(String str) {
        String[] words = str.split("\\s");
        int count = 0;

        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
                if (Character.toLowerCase(w.charAt(i)) == 'y' || Character.toLowerCase(w.charAt(i)) == 'z')
                    if (i == w.length() - 1)
                        count++;
                    else if (!Character.isLetter(w.charAt(i + 1)))
                        count++;
            }
        }
        return count;
    }
}
