package DSA_Pre_prep.Level2_String;

// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"

// hAving issue with the code logic
public class MixedString {
    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        char[] output = new char[l1 + l2];
        char letters1[] = str1.toCharArray();// xxxx
        char letters2[] = str2.toCharArray();// th
        int j = 0;
        int k = 0;
        if (l1 == l2) {
            for (int i = 0; i < (l1 + l2); i++) {

                output[i] = letters1[j];
                j++;
                i++;
                output[i] = letters2[k];
                k++;

            }
        } else if (l1 > l2) {
            j = 0;
            k = 0;
            int i = 0;
            for (i = 0; i < l1; i++) {
                output[i] = letters1[j];
                j++;
                i++;
                output[i] = letters2[k];
                k++;

            }
            for (int z = i; z < l1 + l2; z++) {
                output[z] = letters1[j];
            }
        }

        else if (l2 > l1) {
            j = 0;
            k = 0;
            int i = 0;
            for (i = 0; i < l2; i++) {
                output[i] = letters1[j];
                j++;
                i++;
                output[i] = letters2[k];
                k++;

            }
            for (int z = i; z < l1 + l2; z++) {
                output[z] = letters2[j];
            }
        }
        String finalStr = new String(output);
        return finalStr;
    }
}
