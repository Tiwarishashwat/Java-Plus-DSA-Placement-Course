import java.util.*;
import java.util.stream.StreamSupport;

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +this.name + " , " + this.rollNo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student s){
            return this.rollNo == s.rollNo && this.name.equals(s.name);
        }
      return false;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //autoboxing ->
        list.add(7);
        list.add(9);
        list.add(1,5);
        list.set(1,6);
        list.addFirst(10);
        list.addLast(8);
        list.remove(3);
        list.remove(Integer.valueOf(8));
        System.out.println(list);

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1,"shashwat"));
        list2.add(new Student(2,"aman"));
//        System.out.println(list2);
        list2.remove(new Student(2,"aman"));
        ListIterator<Student> listIterator = list2.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Reverse");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("Enhanced for loop");
        for(Student s : list2){
            System.out.println(s);
        }
        System.out.println("Size: " + list2.size());


        Collections.sort(list);
        System.out.println("for loop");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + ",");
        }

//        HW: list2 -> sort increasing order of rollNo!

    }
}
