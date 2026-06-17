package JavaGenirics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {
      /*  generic does not follow inheritance like other classes
        List<Number> list = new ArrayList<Integer>(); --> error
        This is the reason wildCard exists
        1.Upper bound wildcard -?Extends

       */
        List<? extends  Number> list = new ArrayList<>(); // upper bound
        List<? super  Integer> list2 = new ArrayList<>(); // lower bound

    }
}
