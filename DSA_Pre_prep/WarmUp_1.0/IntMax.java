public class IntMax {
    public static void main(String[] args) {
        int f = intMax(3, 3, 9);
        System.out.println(f);
    }

    public static int intMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

}
