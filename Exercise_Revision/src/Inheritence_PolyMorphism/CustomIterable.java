package Inheritence_PolyMorphism;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class CustomIterable implements Iterable<Integer> {

    List<Integer> al = Arrays.asList(1, 3, 2);

    @Override
    public Iterator<Integer> iterator() {
        return al.iterator();
    }
}
