
public class Database {
    private QueryFactory qf;

    public void setQueryFactory(QueryFactory obj) {
        qf = obj;
    }

    void doWork() {
        QueryEx q = qf.getQuery();
        q.execute();
    }
}
