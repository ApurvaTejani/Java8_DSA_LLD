public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int i = 0;
        int num1[] = new int[2];
        int num2[] = new int[2];
        int A = number1;
        int B = number2;
        // Converts the number into array of fdigits
        while (A > 0 && B > 0) {
            num1[i] = A % 10;
            A = A / 10;
            num2[i] = B % 10;
            B = B / 10;
            i++;
        }
        // for (int element : num1) {
        // System.out.print(element + ",");
        // }
        // System.out.println();
        // for (int element : num2) {
        // System.out.print(element + ",");
        // }
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            if ((num1[0] == num2[0]) || (num1[1] == num2[1]) || (num1[0] == num2[1])) {
                return true;
            }
            return false;
        }

        return false;
    }
}