package Level1_String;

// Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

// makeOutWord("<<>>", "Yay") → "<<Yay>>"
// makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
// makeOutWord("[[]]", "word") → "[[word]]"
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("[[]]", "word"));
    }

    public static String makeOutWord(String estr, String str) {
        String estr1 = estr.substring(0, 2);
        String estr2 = estr.substring(2, 4);
        str = (estr1.concat(str)).concat(estr2);
        return str;
    }

}
