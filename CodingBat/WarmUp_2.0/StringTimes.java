public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 5));
    }

    public static String stringTimes(String str, int n) {
        String s1 = "";
        if (n == 0) {
            return s1;
        } else if (n == 1) {
            return str;
        } else {
            s1 = new String(str);
            for (int i = 0; i < n - 1; i++) {
                s1 = s1.concat(str);

            }
            return s1;
        }
    }
}
