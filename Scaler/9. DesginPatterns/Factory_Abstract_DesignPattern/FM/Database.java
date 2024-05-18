package FairWork.Lect_Inter_Factory.FM;

import FairWork.Lect_Inter_Factory.AbstractFactory.QueryEx;




public abstract class Database {
    public void doWork(){
        QueryEx q = getQuery();
        q.execute();
    }

    abstract QueryEx getQuery(); // this is a factory method
}
