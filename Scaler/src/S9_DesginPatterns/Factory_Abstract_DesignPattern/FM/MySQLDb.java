package S9_DesginPatterns.Factory_Abstract_DesignPattern.FM;


import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.MySQLQuery;
import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.QueryEx;

public class MySQLDb extends Database {
    public QueryEx getQuery(){
        return new MySQLQuery();
    }
}
