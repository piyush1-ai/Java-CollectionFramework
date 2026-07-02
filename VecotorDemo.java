
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector; // thread safe

public class VecotorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
            vector.add(20);
            vector.add(30);
            vector.add(50);
            vector.add(40);

        System.out.println(vector);
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer data = enumeration.nextElement();
            System.out.println(data);
        }
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
