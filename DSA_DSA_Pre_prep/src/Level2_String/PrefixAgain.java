package Level2_String;
// Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

// prefixAgain("abXYabc", 1) → true
// prefixAgain("abXYabc", 2) → true
// prefixAgain("abXYabc", 3) → false
class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));

    }

    public static boolean prefixAgain(String str, int c) {
        String subStr = str.substring(0, c);
        String newStr = str.substring(c);
        boolean flag = newStr.contains(subStr);
        return flag;
    }

}