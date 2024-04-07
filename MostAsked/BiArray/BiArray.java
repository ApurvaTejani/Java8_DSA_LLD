package MostAsked;

// Examples

// Example 1:

// Consider array1 as [1, 2] and array2 as [4, -2, 1]. sum1 is 3 and sum2 is also 3. Method should return true.

// Example 2:

// Consider array1 as [5, 10, 15] and array2 as [1, 9, 20]. sum1 is 30 and sum2 is also 30. Method should return true.

// Example 3:

// Consider array1 as [-1, -1, -1] and array2 as [-2, 1]. sum1 is -3 and sum2 is -1. Method should return false.
public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        if (sum1 == sum2)
            return true;
        else
            return false;

    }

    private int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }
}
