//import java.util.*;
//
//class Student {
//    int rollNo;
//    String name;
//    int marks;
//
//    Student(int rollNo, String name, int marks) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.marks = marks;
//    }
//}
//
//public class ComparatorAnonymousDemo {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student(3, "Amit",50));
//        list.add(new Student(1, "Ravi",70));
//        list.add(new Student(2, "Neha",80));
//
//
//        // Using Comparator with Anonymous Class
//        Collections.sort(list, new Comparator<Student>(){
//            @Override
//            public int compare(Student s1, Student s2){
//                if(s1.marks < s2.marks){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//
//        });
//
//        for (Student s : list) {
//            System.out.println(s.marks + " " + s.name);
//        }
//    }
//}