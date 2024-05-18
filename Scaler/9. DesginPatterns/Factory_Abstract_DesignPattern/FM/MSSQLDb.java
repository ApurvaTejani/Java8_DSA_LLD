package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.AbstractFactory.MSSQLQuery;
import FairWork.Lect_Inter_Factory.AbstractFactory.QueryEx;

public class MSSQLDb extends Database {
    public QueryEx getQuery(){
        return new MSSQLQuery();
    }
}
