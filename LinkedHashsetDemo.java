package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        Map<Integer,String > map = new LinkedHashMap<>();
        map.put(1,"A");
        map.put(2,"C");
        map.put(3,"B");
        map.put(1,"M");
        map.put(null,"k");
        System.out.println(map);
    }
}
