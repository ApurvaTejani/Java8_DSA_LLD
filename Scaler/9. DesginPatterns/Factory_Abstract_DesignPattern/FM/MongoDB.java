package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.AbstractFactory.QueryEx;
import FairWork.Lect_Inter_Factory.AbstractFactory.MongoDBQuery;

public class MongoDB extends Database {
    public QueryEx getQuery(){
        return new MongoDBQuery();
    }
}
