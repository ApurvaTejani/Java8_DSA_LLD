package JavaDoc_Annotations.Annotations;

class A {
    public void display() {

    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("hello");
    }

    @Deprecated
    public void show() {
        System.out.println("Deprecated");
    }

}

public class AnnotationsDemo {
    public static void main(String[] args) {
        int i;
        @SuppressWarnings("deprecation")

        B b = new B();

        b.show();
    }
}
