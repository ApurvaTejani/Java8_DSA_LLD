package S9_DesginPatterns.Factory_Abstract_DesignPattern.FM;


import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.MSSQLQuery;
import S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory.QueryEx;

public class MSSQLDb extends Database {
    public QueryEx getQuery(){
        return new MSSQLQuery();
    }
}
