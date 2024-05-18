
// Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

// countXX("abcxx") → 1 // 
// countXX("xxx") → 2 
// countXX("xxxx") → 3
public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("xxxx"));
    }

    public static int countXX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        String[] newStr = new String[str.length() - 1];
        int count = 0;
        if (str.contains("xx")) {
            for (int i = 0; i < newStr.length; i++) {
                newStr[i] = str.substring(i, (i + 2));
                if (newStr[i].equals("xx")) {
                    count++;
                }
            }

        }
        return count;
    }
}
