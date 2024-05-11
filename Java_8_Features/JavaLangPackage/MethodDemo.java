package AbdulBariJava.JavaLangPackage;

public class MethodDemo {

    public static void main(String[] args) {

        int m1 = 15;

        // Integer m2=m1;
        // Integer m3=15;

        Integer m2 = Integer.valueOf("123");
        // Integer m3=Integer.valueOf("11111111", 2);
        Integer m3 = Integer.valueOf("A7", 16);
        Integer m4 = Integer.decode("0xA7");

        int m6 = Integer.MIN_VALUE - 12;
        System.out.println(m6);

        int m7 = Math.min(10, 20);
        System.out.println(m7);

        // System.out.println(m2.equals(m1));
        // System.out.println(m2.equals(m3));
        // System.out.println(m3);

        // System.out.println(Integer.parseInt("123"));
        // System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40));

    }

}
