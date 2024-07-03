package Inheritence_PolyMorphism;

import java.util.*;

public class ClientNew {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        display(st);


        ArrayList<String> al = new ArrayList<>();
        al.add("Apurva");
        al.add("Tejani");
        display(al);


        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        display(ll);

        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        display(q);

        CustomIterable ci = new CustomIterable();
        display(ci);
    }

    static void display(Iterable list) {

        for (Object data : list) {
            System.out.println(data);
        }

    }
}
