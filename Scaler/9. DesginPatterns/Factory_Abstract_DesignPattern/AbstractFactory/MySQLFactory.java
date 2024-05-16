
public class MySQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MySQLQuery();
    }
}
