import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        FIFO:-
        Priority Queue:
        It is a queue where elements are processed based on priority not insertion order
        Note: it does not follow FIFO

         */
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(200);
        pq.add(30);
        pq.add(2);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        /*
        Collection provided 3 functionalities to fetch data from collection
        1. Enumeration : we can use it to get object from legacy class(vector)
        -we can create enumeration object by using elements()

        Note:
        work for only legacy classes
        - only can do read operation & we can't perform remove operation
        - To overcome this limitations java introduce iterator()

        2. Iterator:
        -we can use this at any class (it can work on legacy classes)
        -It can do both read and remove operations
        - create iterator object using iterator()
        problems:
        -enumeration and iterator both can move in forward direction
        -we can only do read and remove operation, we can't perform addition of
        new object and replacement

        3. ListIterator:
        - Child interface of iterator
        - move in forward and backward direction
        - It can perform addition and replacement of new object
         */
    }
}
