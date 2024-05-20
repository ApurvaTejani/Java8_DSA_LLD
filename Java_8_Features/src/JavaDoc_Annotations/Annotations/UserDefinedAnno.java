package JavaDoc_Annotations.Annotations;

@interface myAnno {
    String name();

    String project();

    String date() default "today";

    String version() default "13";
}

@myAnno(name = "Ajay", project = "Bank")
public class UserDefinedAnno {
    @myAnno(name = "Ajay", project = "Bank")
    int data;

    // @MyAnno //Gives an error - Name and project has be defined

    public static void main(String[] args) {

        int x;
        System.out.println("Hello");
    }
}
