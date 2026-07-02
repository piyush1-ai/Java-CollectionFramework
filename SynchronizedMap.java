package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SynchronizedMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put(null,10);
        map.put("piyush",null);
        Collections.synchronizedMap(map);
        ConcurrentMap<String ,Integer> concurrentMap = new ConcurrentHashMap<>();;
        concurrentMap.put(null, 10);
        System.out.println(concurrentMap);
        /*
        concurrent map --> thread safe , slow , 1.5 java,
        -null is not allowed in keys and values
        shows null pointer exception
        - we get thread safety without locking whole object it will
        use bucket level lock
        - multiple threads are allowed to operate on same object



        2. Fail-safe.
         */
    }
}
