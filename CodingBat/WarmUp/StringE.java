package CodingBat.WarmUp;

// Return true if the given string contains between 1 and 3 'e' chars.

// stringE("Hello") → true
// stringE("Heelle") → true
// stringE("Heelele") → false
public class StringE {
    public boolean stringE(String str) {
        char[] letters = str.toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'e')
                count++;
        }
        if (count == 1 || count == 2 || count == 3) {
            return true;
        }
        return false;
    }

}
