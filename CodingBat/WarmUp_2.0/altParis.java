// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

// altPairs("kitten") → "kien" 
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

// ======================Incomplete======================
public class altParis {
    public static void main(String[] args) {
        altPairs("kitten");
    }

    public static String altPairs(String str) {

        int j = 0;
        char[] letters = str.toCharArray();
        char[] newLetters = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (i % 2 != 0) {
                newLetters[j] = letters[i];
                j++;
            }

        }
        for (int i = 0; i < newLetters.length; i++) {
            System.out.print(newLetters[i]);
        }
        return " ";
    }
}
