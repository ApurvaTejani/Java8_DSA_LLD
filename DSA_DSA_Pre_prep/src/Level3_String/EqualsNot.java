package Level3_String;

//Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
//
//        equalIsNot("This is not") → false
//        equalIsNot("This is notnot") → true
//        equalIsNot("noisxxnotyynotxisi") → true
public class EqualsNot {
    public static void main(String[] args) {
        System.out.println(equalsNotMethod("isnotis"));
    }

    public static boolean equalsNotMethod(String str) {
        char[] letters = str.toCharArray();
        int countIs = 0;
        int countNot = 0;
//        int l = letters.length;
//        for (int i = 0; i < letters.length - 2; i++) {
//            if (letters[i] == 'i' && letters[i + 1] == 's')
//                countIs++;
//            else if ((letters[i] == 'n' && letters[i + 1] == 'o') && (letters[i + 1] == 'o' && letters[i + 2] == 't'))
//                countNot++;
//            else if (letters[l - 2] == 'i' && letters[l - 1] == 's')
//                countIs++;
//        }
//        if (countIs == countNot)
//            return true;
//        else
//            return false;
//
//        int countIs = 0;
//        int countNot = 0;


        /// Better Solution
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }

        return countIs == countNot;
    }
}
