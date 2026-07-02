package WrapperClasses;

public class ValueOfDemo {
    public static void main(String[] args) {
       Integer i2 =  Integer.valueOf("10");
        System.out.println(i2);

        Integer i = Integer.valueOf("100");
        System.out.println(i.intValue());
        System.out.println(i );

        int i3 = Integer.parseInt("10"); // --> string convert into primitive int
        System.out.println(i3);

        boolean b = Boolean.parseBoolean("1");
        System.out.println(b);

        Integer i4 = Integer.valueOf("100"); // --> convert into wrapper class
        System.out.println(i4.toString());

    }
}
