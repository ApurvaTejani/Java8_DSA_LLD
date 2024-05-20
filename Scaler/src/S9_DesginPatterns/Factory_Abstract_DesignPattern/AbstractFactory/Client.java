//package FairWork.Lect_Inter_Factory.AbstractFactory;
package S9_DesginPatterns.Factory_Abstract_DesignPattern.AbstractFactory;
//import FairWork.Lect_Inter_Factory.FM.Database;

public class Client {
    public static void main(String[] args) {
        Database db = new Database();
        QueryFactory qf = new MongoDBFactory();
        db.setQueryFactory(qf);
        db.doWork();
    }
}
