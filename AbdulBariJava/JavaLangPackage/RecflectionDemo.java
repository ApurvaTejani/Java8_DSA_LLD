import java.lang.reflect.*;
import java.lang.reflect.Parameter;
import AbdulBariJava.JavaLangPackage.StringBuffer.My;
import java.lang.ref.*;;

public class RecflectionDemo {
    public static void main(String[] args) {
        My my = new My();
        Class c = my.getClass();
        System.out.println();
        System.out.println("======================Data Members==========================================");
        System.out.println();
        Field field[] = c.getDeclaredFields();
        for (Field fie : field) {
            System.out.println(fie);
        }
        System.out.println();
        System.out.println("======================Constructors==========================================");
        System.out.println();
        Constructor cons[] = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println();
        System.out.println(
                "=========================Methods along with Object methods by Default=======================================");
        System.out.println();
        Method meth[] = c.getMethods();

        for (Method m : meth)
            System.out.println(m);

        Parameter param[] = meth[0].getParameters();

        for (Parameter p : param) {
            System.out.println(p);
        }
    }
}
