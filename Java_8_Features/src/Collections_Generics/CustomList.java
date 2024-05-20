package Collections_Generics;

import java.util.ArrayList;

public class CustomList<T> {
    ArrayList<T> c = new ArrayList<>();

    public void addElement(T elements) {
        c.add(elements);
    }

    public void removeElement(T elements) {
        c.remove(elements);
    }

    public T getElement(int index) {

        return c.get(index);
    }

    public String toString() {
        return c.toString();
    }

}
