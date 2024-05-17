package DSA_Pre_prep.Level2_String;

// Return true if the string "cat" and "dog" appear the same number of times in the given string.

// catDog("catdog") → true
// catDog("catcat") → false
// catDog("1cat1cadodog") → true
public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdogd"));
    }

    public static boolean catDog(String str) {
        char[] letters = str.toCharArray();
        int dog = 0;
        int cat = 0;
        for (int i = 0; i < letters.length - 2; i++) {
            if ((letters[i] == 'c' && letters[i + 1] == 'a') && (letters[i + 2] == 't')) {
                cat++;
            } else if ((letters[i] == 'd' && letters[i + 1] == 'o') && (letters[i + 2] == 'g')) {
                dog++;
            }
        }
        if (cat == dog)
            return true;
        else
            return false;
    }
}
