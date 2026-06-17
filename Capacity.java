import java.util.ArrayList;

public class Capacity {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // 10
        System.out.println(list.size());
        // size --> physical size
        // capacity ---> virtual size
        // when physical size == virtual size memory will increase

        /*
        load factor :
        fill ratio .75 of hashset a new hashset will be created


        why we are not using primitive data type:
            - it will not give me the functionality of cloning
         */
    }
}
