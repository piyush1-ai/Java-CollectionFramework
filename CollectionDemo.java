import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionDemo {
    public static void main(String[] args) {

        // duplicate allowed , insertion  order preserved
        List<Integer> list  = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(list); // creating arraylist from other collection
        List<Integer>list2 = new ArrayList<>(20);

        // for adding data
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(1));


        /*
        how arraylist grows :-
        1.5 X

        note:
        RandomAccess  interface tells jvm that these collections supports fast O(1)
        index based access

        Clonable:
        This is marker interface

         */
        ArrayList arraylist = new ArrayList();
        arraylist.add(20);
        arraylist.add(2);

        Object clone = arraylist.clone();
        System.out.println(clone);

        /*
        serialization:
        converting an object into a byte stream

        Deserialization : reverse process

        used in :
        1. Saved to disk
        2. sent over network
        3. Stored in cache

         */
    }
}
