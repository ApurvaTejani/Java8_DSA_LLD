package S9_DesginPatterns.Factory_Abstract_DesignPattern.Common;

public class MSSQLQuery implements QueryEx {
    public void execute() {
        System.out.println("logic to execute ms sql query");
    }
}
