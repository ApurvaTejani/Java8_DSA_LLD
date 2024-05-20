package S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory;

public class MSSQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MSSQLQuery();
    }
}
