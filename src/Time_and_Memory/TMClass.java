package Time_and_Memory;

import java.util.HashMap;
import java.util.Map;

public class TMClass {
    public static Map<String, Long> time_Memory_Used() {
        Runtime.getRuntime().gc();
        long t1 = (System.currentTimeMillis());
        long m1 = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
        Map<String, Long> tm = new HashMap<>();
        tm.put("t", t1);
        tm.put("m", m1);
        return tm;
    }
}
