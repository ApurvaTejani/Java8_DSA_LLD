package FairWork.Lect_Inter_Factory.AbstractFactory;

//import FairWork.Lect_Inter_Factory.FM.Database;

public class Client {
    public static void main(String[] args) {
        Database db = new Database();
        QueryFactory qf = new MongoDBFactory();
        db.setQueryFactory(qf);
        db.doWork();
    }
}
