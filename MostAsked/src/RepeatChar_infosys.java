//
//Write a program to print the  consecutive character count if a character is repeated.
//        Both ways With Java 8 and in traditional way
//
//        Example1-
//        Input String: Football
//        output: f2otba2l
//
//        Example 2-
//        input String : good
//        output: g2od
//
//        Example 3:
//        input String : Infosys
//        output string: Infosys
public class RepeatChar_infosys {
    public static void main(String[] args) {
        System.out.println(characterRepeatCount("Football"));
    }

    public static String characterRepeatCount(String str) {
        int count = 1;
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length - 1; i++) {
            for (int j = i; j < letters.length - 1; j++) {
                if (letters[j] == letters[j + 1]) {
                    count++;

                }
                break;
            }

        }
        System.out.println(count);
        String newStr = new String(letters);
        return newStr;
    }

}

