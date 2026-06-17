import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        /*
        set:
        1. Duplicates are not allowed in set
        2. Order not preserved
         */
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);
        set.add(null);
        set.add(null);
        System.out.println(set);

        ArrayList<String> names = new ArrayList<>();
        names.add("ram");
        names.add(null);


        HashSet<String> hashSet = new HashSet<>(10,0.5f); // default load factor is .75f
    }
}
