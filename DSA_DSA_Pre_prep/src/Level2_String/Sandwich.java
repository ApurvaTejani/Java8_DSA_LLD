package Level2_String;

//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//
//
//        getSandwich("breadjambread") → "jam"
//        getSandwich("xxbreadjambreadyy") → "jam"
//        getSandwich("xxbreadyy") → ""
public class Sandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadyy"));
    }

    public static String getSandwich(String str) {
        int start = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        String str1 = "";
        for (int i = start + 5; i < last; i++) {
            str1 = str1.concat(String.valueOf(str.charAt(i)));
        }
        return str1;
    }
}
