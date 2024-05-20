package S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory;

public class MongoDBFactory implements QueryFactory {

    public QueryEx getQuery() {
        return new MongoDBQuery();
    }
}
