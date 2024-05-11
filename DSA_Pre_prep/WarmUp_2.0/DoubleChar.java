public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxx"));
    }

    public static boolean doubleX(String str) {
        char[] letters = str.toCharArray();
        int index = str.indexOf('x');
        System.out.println(index);
        for (int i = 0; i < (letters.length - 1); i++)// 0 to 4
        {
            if (letters[letters.length - 1] == 'x' && (letters[letters.length - 1] != letters[letters.length - 2])) {
                return false;
            } else if (letters[i] == 'x') {
                if (letters[index] == letters[index + 1]) {

                    return true;
                }
            }
        }
        return false;
    }
}
