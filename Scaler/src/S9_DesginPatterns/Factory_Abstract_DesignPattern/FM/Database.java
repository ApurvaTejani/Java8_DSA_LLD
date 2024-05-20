package S9_DesginPatterns.Factory_Abstract_DesignPattern.FM;


import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.QueryEx;

public abstract class Database {
    public void doWork(){
        QueryEx q = getQuery();
        q.execute();
    }

    abstract QueryEx getQuery(); // this is a factory method
}
