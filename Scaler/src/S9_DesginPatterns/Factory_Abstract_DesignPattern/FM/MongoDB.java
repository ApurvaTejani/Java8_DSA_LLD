package S9_DesginPatterns.Factory_Abstract_DesignPattern.FM;


import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.MongoDBQuery;
import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.QueryEx;

public class MongoDB extends Database {
    public QueryEx getQuery(){
        return new MongoDBQuery();
    }
}
