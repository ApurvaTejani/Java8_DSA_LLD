package WarmUp_2;
// Given a non-empty string like "Code" return a string like "CCoCodCode".

// stringSplosion("Code") → "CCoCodCode" // 4
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"
public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("abc"));
    }

    public static String stringSplosion(String str) {

        String[] newStr = new String[str.length()];
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr[i] = str.substring(0, i + 1);// 0 0 0 1 0 2
            finalStr = finalStr.concat(newStr[i]);
        }
        return finalStr;
    }
}