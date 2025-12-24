import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));
        list.add(new Student(4, "Priya",80));

        //(first, second)
        // dec -> second - first
        //inc -> first - second
        // Using Comparator with Lambda expression

        // cond -> sort in dec order of marks.
        // if marks is same then sort in increasing order of rollNo.
        Collections.sort(list, (s1,s2) -> {
            if(s1.marks == s2.marks){
                return s1.rollNo - s2.rollNo;
            }
            return s2.marks - s1.marks;
        });
        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}



