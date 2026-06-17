import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 4, 2, 1));
        System.out.println(list);
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer data : list) {
            if (!unique.contains(data)) {
                unique.add(data);
            }
        }
        System.out.println(unique);

        /*
        note : RandomAccess is marker interface hence Arraylist and vector
        implements it so that we can access any element in order of 1
         */
    }

}
