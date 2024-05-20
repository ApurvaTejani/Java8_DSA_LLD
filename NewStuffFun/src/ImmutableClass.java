import java.util.Arrays;

public final class ImmutableClass {
    private final int intValue;
    private final String stringValue;
    private final int[] intArray; // Array of integers

    public ImmutableClass(int intValue, String stringValue, int[] intArray) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        // Defensive copying to ensure the internal state of the object is not modified
        // externally
        this.intArray = Arrays.copyOf(intArray, intArray.length);
    }

    // Provide only getter methods to access the fields
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return new String(stringValue); // Return a copy of stringValue
    }

    public int[] getIntArray() {
        return Arrays.copyOf(intArray, intArray.length); // Return a copy of intArray
    }
}
