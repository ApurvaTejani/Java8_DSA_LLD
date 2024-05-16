
public class MSSQLFactory implements QueryFactory {
    public QueryEx getQuery() {
        return new MSSQLQuery();
    }
}
