package Java_IO_Stream.Serialisation.Challenge_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Challenge_2/ObjArr.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length = (int) ois.readObject();
        Customer[] c = new Customer[length];
        for (int i = 0; i < length; i++) {
            c[i] = (Customer) ois.readObject();
        }

        System.out.println("Total number of customers : ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        Scanner sc = new Scanner(System.in);
        String seacrhedString = sc.nextLine();

        for (int i = 0; i < c.length; i++) {
            if (seacrhedString.equals(c[i].name))
                System.out.println("Found Match: " + c[i]);
        }

    }

}
