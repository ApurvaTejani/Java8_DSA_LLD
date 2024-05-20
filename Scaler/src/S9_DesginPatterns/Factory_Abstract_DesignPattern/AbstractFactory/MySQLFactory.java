package S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory;

//import FairWork.Lect_Inter_Factory.Common.MySQLQuery;

public class MySQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MySQLQuery();
    }
}
