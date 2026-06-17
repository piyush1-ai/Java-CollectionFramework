import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(200);
        sortedSet.add(10);

        System.out.println(sortedSet);
        System.out.println(sortedSet.first());

        // headSet : all elements less than given element
        System.out.println(sortedSet.headSet(30));
        System.out.println(sortedSet.tailSet(30));

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);

        System.out.println("navigable set : " + navigableSet);
        int key = 20;

//        navigation methods
        System.out.println("lower than : "+key+" : "+navigableSet.lower(key));
        System.out.println("floor than : "+key+" : "+navigableSet.floor(key));
        System.out.println("Higher than : "+key+" : "+navigableSet.higher(key));
        System.out.println("ceiling of  : "+key+" : "+navigableSet.ceiling(key));

//        Polling
        System.out.println("poll first : " + navigableSet.pollFirst());
        System.out.println("poll last : " + navigableSet.pollLast());
        System.out.println(navigableSet);

        /*
        Sorted set:
        1. If I want to store data where I need unique data also
        inserted according to some sorting order.
        2. Sorting can we two type
        a. Natural sorting (String -> Alphabetical , Num -> Accessing order)
        b. Customize sorting

         */
    }
}
