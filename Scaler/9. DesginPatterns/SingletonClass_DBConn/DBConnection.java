import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private DBConnection() {

    }

    private static Lock lock = new ReentrantLock();
    private static DBConnection inst;

    public static DBConnection getInstance() {
        if (inst == null) {
            lock.lock();
            if (inst == null) {
                inst = new DBConnection();
            }
            lock.unlock();
        }
        return inst;
    }

    // =============Not recommended for multi - threaded
    // Application=======================
    // public static DBConnection getInstance() {
    // if (inst == null) {
    // inst = new DBConnection();
    // }
    // return inst;
    // }

}
