package JavaDoc_Annotations.Annotations;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
// @Documented
// @Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
// Repeatable(MyAnno.class)
@interface MyAnno {
    String name();

    String project();

    String date() default "today";

    String version() default "13";
}

//@Retention(RetentionPolicy.Class)
public class ExtraAnno {
    int data;
    // @MyAnno(name="Ajay",project="Bank")

    // @MyAnno(name="Ajay")
    public static void main(String[] args) {
        // @MyAnno(name="Ajay")
        int x;
    }
}
