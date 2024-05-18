
// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

// countCode("aaacodebbb") → 1
// countCode("codexxcode") → 2
// countCode("cozexxcope") → 2
public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("cozexxcope"));
    }

    public static int countCode(String str) {
        char[] letters = str.toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length - 3; i++) {
            if ((letters[i] == 'c' && letters[i + 1] == 'o') && (letters[i + 1] == 'o' && letters[i + 3] == 'e')) {
                count++;
            }
        }
        return count;
    }
}
