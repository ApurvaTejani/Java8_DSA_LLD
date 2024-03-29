package MostAsked;

public class OccuranceString {
    public static void main(String[] args) {
        String s = "Apurva";
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (Character.toUpperCase(letters[i]) == Character.toUpperCase(letters[j])) {
                    System.out.println("Duplicate Found " + letters[i]);
                }
            }
        }
    }
}
