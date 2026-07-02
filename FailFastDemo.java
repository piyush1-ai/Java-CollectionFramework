package Map;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()){
            Integer data = iterator.next();
            System.out.println(data);
            al.add(90);
/*
            1.Fail-fast :
            While one thread iterate collection data if other thread trying
            to perform any modification to the same collection object then immediately we get iterator
            fail by raising CME such type of iterator called as Fail-Fast Iterator
            note : Internally these iterator maintained one flag  named modification data to check collection
            data or underlying collection modification

            2. Fail-safe:
            
*/
        }
    }
}
