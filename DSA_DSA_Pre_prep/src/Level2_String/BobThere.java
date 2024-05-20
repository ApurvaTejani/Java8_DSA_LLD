package Level2_String;
// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

// bobThere("abcbob") → true
// bobThere("b9b") → true
// bobThere("bac") → false
public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("bac"));
    }

    public static boolean bobThere(String str) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length - 2; i++) {
            if (letters[i] == 'b' && letters[i + 2] == 'b') {
                return true;
            }
        }
        return false;
    }
}
