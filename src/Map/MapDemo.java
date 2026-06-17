package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Amit");
        map.put(102,"Rahul");
        map.put(103,"ashwani"); // complexity O(1)

        // Why insertion complexity O(1)
        String value = map.get(101);
        map.put(null,"null");
        map.put(null,"Raja"); // keys must be unique
        System.out.println(value);

        if (map.containsKey(101)) {

            System.out.println("yes");
        }else System.out.println("No");

        String orDefault = map.getOrDefault(101,"No");
        System.out.println(orDefault);
    }
}
