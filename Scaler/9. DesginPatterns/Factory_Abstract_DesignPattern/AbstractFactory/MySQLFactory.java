package FairWork.Lect_Inter_Factory.AbstractFactory;

//import FairWork.Lect_Inter_Factory.Common.MySQLQuery;

public class MySQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MySQLQuery();
    }
}
