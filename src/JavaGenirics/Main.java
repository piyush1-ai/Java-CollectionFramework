package JavaGenirics;

public class Main {
    public static void main(String[] args) {
        Gift<Integer> intGift = new Gift<>();
        intGift.set(10);
        System.out.println(intGift.getValue());
    }
}
