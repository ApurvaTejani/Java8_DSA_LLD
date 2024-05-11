package AbdulBariJava.ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class try_finally {
    static void Divide() throws Exception {
        FileInputStream fi;
        fi = new FileInputStream(
                "C:\\Users\\apurv\\OneDrive\\AllCodes\\Core_java\\Udemy+Scaler\\src\\AbdulBariJava\\ExceptionHandling\\Test.txt");
        Scanner sc = new Scanner(fi);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }

        finally {
            sc.close();
            fi.close();
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e);
        }

        // int x=sc.nextInt();

        // System.out.println(x);

    }
}
