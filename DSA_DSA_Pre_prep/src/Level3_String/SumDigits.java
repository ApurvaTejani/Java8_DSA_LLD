package Level3_String;

//Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//
//        sumDigits("aa1bc2d3") → 6
//        sumDigits("aa11b33") → 8
//        sumDigits("Chocolate") → 0

public class SumDigits {
    public static int sumDigits(String str) {
        char[] letters = str.toCharArray();
        int sum = 0;
        int number = 0;
        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = Integer.parseInt(Character.toString(str.charAt(i)));
                sum = sum + number;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumDigits("fr3321hk"));
    }


}
