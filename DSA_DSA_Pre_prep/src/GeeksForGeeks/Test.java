package GeeksForGeeks;

public class Test {
    private static int countTest = 0;
    private String name;

    public Test(String name) {
        this.name = name;
        countTest++;
    }

    public Test() {
        countTest++;
    }

    public static int getCountTest() {
        return countTest;
    }
}
