import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CursorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("piyush","sonu","yash","monu"));
        System.out.println(names);
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String data = it.next();
            if(data.equals("monu"))
                System.out.println("found");
            else System.out.println(data);
        }
    }
}
