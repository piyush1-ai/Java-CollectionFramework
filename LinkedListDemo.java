import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        /*
        1.Base data structure is doubly linked list
        2. Duplicates allowed
        3. order preserve
        4. Random access not allowed
         */
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        Queue<Integer> queue = new LinkedList<>();
        System.out.println(ll);
        ll.add(2,60);
        System.out.println(ll);
        ll.addFirst(11);
        ll.addLast(12);

//        frequent fetching of data --> AL
//        frequent insertion and deletion ->ll
    }
}
