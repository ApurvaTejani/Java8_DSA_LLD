package CodingBat.Level2_String;

// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

// xyzMiddle("AAxyzBB") → true
//            0123456
// xyzMiddle("AxyzBB") → true
// xyzMiddle("AxyzBBB") → false
public class XYZMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("1x345xyz12x4"));
    }

    public static boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            for (int i = str.length() - 1; i > 1; i--) {// 7
                if (str.charAt(i) == 'z' && str.charAt(i - 1) == 'y' && str.charAt(i - 2) == 'x') {
                    int xPostion = str.lastIndexOf("xyz");// 2
                    int zPosition = str.lastIndexOf("z");// 4
                    int right = str.length() - 1 - zPosition;// 2
                    int left = xPostion;// 2
                    if ((right - left) <= 1 && (right - left) >= -1)
                        return true;
                }

            }
            return false;
        }
        return false;
    }
}
