package JavaGenirics;

public class Gift <T>{
    T value;
    void set(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
