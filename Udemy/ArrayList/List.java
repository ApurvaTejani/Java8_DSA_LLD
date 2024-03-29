package Udemy.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = """
                Available actions:
                0 - to shutdown1 - to add item(s) to list (comma delimited list)

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:""";

        System.out.println(s);
        ArrayList<String> item = new ArrayList<>();
        boolean flag = true;
        try {
            while (flag) {
                String choiceinstr = sc.nextLine();
                int choice = Integer.parseInt(choiceinstr);

                if (choice == 1) {
                    addItems(item);
                    System.out.println(item);
                    System.out.println("-".repeat(20));
                    System.out.println(s);
                } else if (choice == 2) {
                    removeItems(item);
                    System.out.println(item);
                    System.out.println("-".repeat(20));
                    System.out.println(s);
                } else if (choice == 0) {
                    flag = false;
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Please Enter only Number values" + e.getMessage());
        }

    }

    public static void addItems(ArrayList<String> item) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the items you want to add: ");
        String value = sc.nextLine();
        String values[] = value.trim().split(",");
        var item1 = Arrays.asList(values);
        for (String val : values) {
            if (!item.contains(val)) {
                item.addAll(item1);
                item.sort(Comparator.naturalOrder());
            }
        }

    }

    public static void removeItems(ArrayList<String> item) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the items you want to remove: ");
        String value = sc.nextLine();
        String values[] = value.split(",");
        var item1 = Arrays.asList(values);
        item.removeAll(item1);
    }
}
