package Level2_String;

//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//
//        zipZap("zipXzap") → "zpXzp"
//        zipZap("zopzop") → "zpzp"
//        zipZap("zzzopzop") → "zzzpzp"
public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZapMethod("zi"));
    }

    public static String zipZapMethod(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0)
                str1 = str1.concat(String.valueOf(str.charAt(i)));
            else if (i == str.length() - 1)
                str1 = str1.concat(String.valueOf(str.charAt(i)));
            else if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p')
                continue;
            else
                str1 = str1.concat(String.valueOf(str.charAt(i)));
        }
        return str1;
    }
}
