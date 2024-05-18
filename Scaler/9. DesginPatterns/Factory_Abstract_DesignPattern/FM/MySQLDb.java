package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.AbstractFactory.MySQLQuery;
import FairWork.Lect_Inter_Factory.AbstractFactory.QueryEx;

public class MySQLDb extends Database {
    public QueryEx getQuery(){
        return new MySQLQuery();
    }
}
