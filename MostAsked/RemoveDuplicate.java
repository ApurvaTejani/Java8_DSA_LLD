
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "Apurva";
        char[] letters = s.toCharArray();

        // Set to store unique characters
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            // Check if the character is already in the set
            if (!uniqueChars.contains(Character.toUpperCase(letters[i]))) {
                // If not, print it and add it to the set
                System.out.print(letters[i]);
                uniqueChars.add(Character.toUpperCase(letters[i]));
            }
        }

    }
}
