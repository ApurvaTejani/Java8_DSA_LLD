package Level1_String;

// Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!
public class HelloName {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
    }

    public static String helloName(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String str1 = "Hello ";
        str1 = str1.concat(str);
        str1 = str1 + "!";
        return str1;
    }
}
