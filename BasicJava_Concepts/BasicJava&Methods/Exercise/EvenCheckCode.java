
public class EvenCheckCode {
    public static void main(String[] args) {
        int i = 5;
        int Evencount = 0;
        int Oddcount = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                Evencount++;
                if (Evencount == 5) {
                    break;
                }

            }
            Oddcount++;
            i++;
        }
        System.out.println("EvenCount " + Evencount);
        System.out.println("Odd Count " + Oddcount);

    }

    public static boolean isEvenNumber(int no) {
        if (no % 2 == 0) {
            return true;
        }
        return false;
    }
}
