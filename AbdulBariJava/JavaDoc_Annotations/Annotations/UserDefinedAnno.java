package AbdulBariJava.JavaDoc_Annotations.Annotations;

@interface MyAnno {
    String name();

    String project();

    String date() default "today";

    String version() default "13";
}

@MyAnno(name = "Ajay", project = "Bank")
public class UserDefinedAnno {
    @MyAnno(name = "Ajay", project = "Bank")
    int data;

    // @MyAnno //Gives an error - Name and project has be defined

    public static void main(String[] args) {

        int x;
        System.out.println("Hello");
    }
}
