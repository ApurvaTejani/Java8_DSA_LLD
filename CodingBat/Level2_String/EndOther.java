package CodingBat.Level2_String;

// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

// endOther("Hiabc", "abc") → true
// endOther("AbC", "HiaBc") → true
// endOther("abc", "abXabc") → true
public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("xyz", "12xyz"));
    }

    public static boolean endOther(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty())
            return false;
        boolean flag1 = (str1.toLowerCase().contains(str2.toLowerCase()))
                && (Character.toLowerCase(str1.charAt(str1.length() - 1)) == Character
                        .toLowerCase(str2.charAt(str2.length() - 1)));
        boolean flag2 = (str2.toLowerCase().contains(str1.toLowerCase()))
                && (Character.toLowerCase(str1.charAt(str1.length() - 1)) == Character
                        .toLowerCase(str2.charAt(str2.length() - 1)));
        boolean finalFlag = flag1 || flag2;
        return finalFlag;
    }

    // Optimized way of doing this
    // public static boolean endOther(String str1, String str2) {
    // if (str1.isEmpty() || str2.isEmpty())
    // return false;

    // // Convert both strings to lowercase for case-insensitive comparison
    // String lowerStr1 = str1.toLowerCase();
    // String lowerStr2 = str2.toLowerCase();

    // // Check if one string ends with the other string
    // return lowerStr1.endsWith(lowerStr2) || lowerStr2.endsWith(lowerStr1);
    // }
}
