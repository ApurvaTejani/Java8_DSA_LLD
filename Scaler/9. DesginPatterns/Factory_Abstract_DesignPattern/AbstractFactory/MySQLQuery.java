package FairWork.Lect_Inter_Factory.AbstractFactory;

public class MySQLQuery implements QueryEx {
    public void execute() {
        System.out.println("logic to execute my sql query");
    }
}
