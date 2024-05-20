package BiArray;

public class BiArrayMain {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 6, 1 };
        int[] arr2 = { 6, 4, 3, 1, 1 };
        BiArray bi = new BiArray(arr1, arr2);
        // System.out.println(bi.calculateSum());
        System.out.println(bi.areSumsEqual());
    }
}
