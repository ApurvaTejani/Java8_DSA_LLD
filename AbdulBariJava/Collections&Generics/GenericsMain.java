
import java.util.List;
import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList();
        list.addElement("Apurva");
        list.addElement("HAhaha");
        System.out.println(list.getElement(1));
        // CustomList<Integer> list2 = new CustomList<>();
        // list2.add(Integer.valueOf(4));
        System.out.println(list);

        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        duplicate(arrlist);
        System.out.println(arrlist);
        System.out.println("-".repeat(30));
        System.out.println(sumOfNumberList(List.of(3, 4, 7)));
    }

    static <X extends List> void duplicate(X arrlist) {
        arrlist.addAll(arrlist);
    }

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum = sum + num.doubleValue();
        }
        return sum;
    }

}
