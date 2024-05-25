package Level2_String;

//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
//
//
//        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//        repeatSeparator("This", "And", 2) → "ThisAndThis"
//        repeatSeparator("This", "And", 1) → "This"
public class RepeatSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeperatorMethod("This", "And", 1));
    }

    public static String repeatSeperatorMethod(String str1, String str2, int repeat) {
        str1 = str1.concat(str2);
        String newstr1 = "";
        for (int i = 0; i < repeat; i++) {
            newstr1 = newstr1.concat(str1);
        }
        int li = newstr1.lastIndexOf(str2);
        newstr1 = newstr1.substring(0, li);
        return newstr1;
    }
}
