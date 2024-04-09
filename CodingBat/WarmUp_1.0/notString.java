package CodingBat.WarmUp;

// Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

// notString("candy") → "not candy"
// notString("x") → "not x"
// notString("not bad") → "not bad"
public class notString {
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            String str1 = "not ";
            String str2 = str1.concat(str);
            return str2;
        }
    }
}
