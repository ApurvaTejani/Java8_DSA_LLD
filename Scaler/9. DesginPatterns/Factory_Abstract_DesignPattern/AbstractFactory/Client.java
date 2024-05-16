
public class Client {
    public static void main(String[] args) {
        Database db = new Database();
        QueryFactory qf = new MongoDBFactory();
        db.setQueryFactory(qf);
        db.doWork();
    }
}
