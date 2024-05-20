package S9_DesginPatterns.Factory_Abstract_DesignPattern.Common;

public class MySQLQuery implements QueryEx {
    public void execute() {
        System.out.println("logic to execute my sql query");
    }
}
