import java.io.*;
import java.util.Scanner;

public class ObjectWriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Challenge_2/ObjArr.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Customer[] listOfCustomers = new Customer[2];
        oos.writeObject(listOfCustomers.length);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listOfCustomers.length; i++) {
            System.out.println("Enter Customer details -" + (i + 1) + ":");
            String name = sc.nextLine();
            String phoneno = sc.nextLine();

            listOfCustomers[i] = new Customer(String.valueOf(i + 1), name, phoneno);
        }
        for (int i = 0; i < listOfCustomers.length; i++) {
            oos.writeObject(listOfCustomers[i]);
        }

    }
}
