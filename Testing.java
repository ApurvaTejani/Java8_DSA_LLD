import java.util.*;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        List<Integer> valueslist = List.of(101, 102, 103, 104);
        values.addAll(valueslist);
        System.out.println(values.remove(Integer.valueOf(102)));
        System.out.println(values);

    }
}
