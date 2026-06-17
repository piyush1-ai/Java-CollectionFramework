package WrapperClasses;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
//        ArrayList<int> arrayList = new ArrayList<int>(); --> not possible
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        /*
            Wrapper classes is used to wrap primitive data types into
            objects so we can handle primitive also like object
            note: java generics only work with objects

            AutoBoxing :
            If we put primitive data in arraylist , do we need to convert primitive to wrapper manually ?
            Compiler Convert primitive to wrapper class object

            Ways of creating Wrapper class object
            1. ALl most all wrapper class have 2 constructor , only Character class have 1 constructor
         */
        int a= 100;
        Integer b = a ; // autoboxing
        System.out.println(b);

        /* Utility methods
        * className.valueOf(a)
        * c.XXXValue()
        * parseXXX()
        * toString()
        * */
    }
}
