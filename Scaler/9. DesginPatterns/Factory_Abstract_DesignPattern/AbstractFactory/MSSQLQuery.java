package FairWork.Lect_Inter_Factory.AbstractFactory;

public class MSSQLQuery implements QueryEx {
    public void execute() {
        System.out.println("logic to execute ms sql query");
    }
}
