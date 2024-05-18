package FairWork.Lect_Inter_Factory.AbstractFactory;

public class MongoDBFactory implements QueryFactory {

    public QueryEx getQuery() {
        return new MongoDBQuery();
    }
}
