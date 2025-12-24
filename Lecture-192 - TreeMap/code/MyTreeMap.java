import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student>{ //Comparator
    int rollNo;
    int marks;
    String name;
    Student(int rollNo, int marks, String name){
        this.marks = marks;
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public int compareTo(Student that) { //compare
        if(that.marks == this.marks){
            if(this.rollNo == that.rollNo){
                return this.name.compareTo(that.name); //lex name
            }
            return this.rollNo - that.rollNo; //inc
        }
        return that.marks - this.marks; //dec
    }
    public String toString(){
        return "Student: " + this.name;
    }

}
public class MyTreeMap {
    //equals, hashcode -> hash
    public static void main(String[] args) {
        TreeMap<Student,Integer> tmap = new TreeMap<>();
        tmap.put(new Student(4,50,"AMAN"),10);
        tmap.put(new Student(3,40,"VIVEK"),12);
        tmap.put(new Student(1,80,"MOHIT"),15);
        tmap.put(new Student(2,80,"ELVISH"),18);
        Student obj = new Student(1,80,"ELVISH");
//        System.out.println(tmap.containsKey(obj));
//        System.out.println(tmap);
//        for(Map.Entry<Student,Integer> entry : tmap.entrySet()){
//            System.out.print("key -> " + entry.getKey());
//            System.out.println(" ,Value -> " + entry.getValue());
//        }
        TreeMap<Integer,Integer> tmap2 =new TreeMap<>();
        tmap2.put(1,10);
        tmap2.put(4,12);
        tmap2.put(5,14);
        tmap2.put(7,16);
        tmap2.put(8,18);
        System.out.println(tmap2.ceilingEntry(6));
    }
}
