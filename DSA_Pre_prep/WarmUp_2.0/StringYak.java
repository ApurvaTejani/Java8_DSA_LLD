
// Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"
public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
    }
    public static String stringYak(String str){
        if(str.contains("yak"))
        {
            str=str.replace("yak", "");
        }
        return str;
    }
}
