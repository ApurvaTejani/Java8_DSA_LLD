
public class SwapNumbers {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i + "  " + j);
        i = i + j;
        j = i - j;
        i = i - j;

        System.out.println(i + "  " + j);
    }

}
