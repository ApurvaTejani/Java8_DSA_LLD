package FairWork.Lect_Inter_Factory.AbstractFactory;

public class MSSQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MSSQLQuery();
    }
}
