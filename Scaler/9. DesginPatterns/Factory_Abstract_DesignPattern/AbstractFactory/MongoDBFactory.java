
public class MongoDBFactory implements QueryFactory {

    public QueryEx getQuery() {
        return new MongoDBQuery();
    }
}
