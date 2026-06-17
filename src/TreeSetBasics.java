import java.util.TreeSet;

class Student implements Comparable<Student>{
    int id ;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student o){
        return this.id - o.id; //  ascending order

        // 0 == equals
        // 1 == this.id > o.id this.id wala object bad me aa jayega

        // -1 == this.id < o.  this.id wala object pahele aa jayega
        }
}
public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(80);

        System.out.println(set);

        TreeSet<Student> studentSet = new TreeSet<>();
        Student s1 = new Student(1,"piyush");
        Student s2 = new Student(2,"sonu");


        studentSet.add(s1);
        studentSet.add(s2);

        /*
        Comparable:
        1. It contains only one method.: compareTo(object O)

         */
    }
}
