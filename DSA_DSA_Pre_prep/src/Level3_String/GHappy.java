package Level3_String;

//We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
//
//
//        gHappy("xxggxx") → true
//        gHappy("xxgxx") → false
//        gHappy("xxggyygxx") → false
public class GHappy {
    public static void main(String[] args) {
        System.out.println(gHappyMethod("g"));
    }

    public static boolean gHappyMethod(String str) {
        if (str.equals("g"))
            return false;
        if (str.length() == 1)
            return true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && (i == 0)) {
                if (str.charAt(i + 1) != 'g')
                    return false;
            } else if (str.charAt(i) == 'g' && (i == str.length() - 1)) {
                if (str.charAt(i - 1) != 'g')
                    return false;
            } else if (str.charAt(i) == 'g') {
                if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')
                    return false;
            }
        }
        return true;
    }
}
