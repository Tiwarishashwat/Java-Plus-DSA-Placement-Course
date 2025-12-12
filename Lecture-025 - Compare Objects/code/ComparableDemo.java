//import java.util.*;
//class Student implements Comparable<Student> {
//    int rollNo;
//    String name;
//    int marks;
//    Student(int rollNo, String name, int marks) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.marks = marks;
//    }
//    //neg -> no swap
//    //pos -> swap
//    //zero -> objects are equal
////    [A, B, C]
//    @Override
//    public int compareTo(Student that){
////        this , that
//        if(this.rollNo < that.rollNo){
//            return -100; //no swap req
//        }else{
//            return 1; //swap
//        }
//    }
//
//}
//
//public class ComparableDemo {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student(3, "Amit",50));
//        list.add(new Student(1, "Ravi",70));
//        list.add(new Student(2, "Neha",80));
//
//        Collections.sort(list);
//        for (Student s : list) {
//            System.out.println(s.rollNo + " " + s.name);
//        }
//    }
//}
