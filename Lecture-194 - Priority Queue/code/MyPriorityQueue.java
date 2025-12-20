import java.util.Collections;
import java.util.PriorityQueue;
class NewStudent implements Comparable<NewStudent>{
    int marks;
    String name;
    NewStudent(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student name: " + this.name + " , marks: " + this.marks;
    }
    @Override
    public int compareTo(NewStudent that) {
//        return this.marks - that.marks; //inc - asc
        if(that.marks==this.marks){
            return this.name.compareTo(that.name); //-neg, 0, pos
        }
        return that.marks - this.marks; //dec - dsc
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NewStudent){
            NewStudent that = (NewStudent) obj;
            boolean isNameSame = (this.name.compareTo(that.name))==0;
            if(this.marks == that.marks && isNameSame) {
                return true;
            }
        }
        return false;
    }
}
public class MyPriorityQueue {
    public static void main(String[] args) {
//        PriorityQueue<Integer> minPq = new PriorityQueue<>(); //min
//        minPq.offer(1);
//        minPq.offer(2);
//        minPq.offer(10);
//        minPq.offer(0);
//        System.out.println("highest priority element-> " + minPq.peek());

//        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); //min
//        maxPq.offer(1);
//        maxPq.offer(2);
//        maxPq.offer(10);
//        maxPq.offer(0);
//        System.out.println("max pq : highest priority element-> " + maxPq.peek());
//        System.out.println(maxPq.contains(10));
//        System.out.println("max pq : deleted-> " + maxPq.poll());
//        System.out.println("max pq : highest priority element-> " + maxPq.peek());
//        System.out.println(maxPq.contains(10));

        PriorityQueue<NewStudent> minStudentPq = new PriorityQueue<>();
        minStudentPq.offer(new NewStudent("shashwat",90));
        minStudentPq.offer(new NewStudent("aman",70));
        minStudentPq.offer(new NewStudent("mohit",90));
        System.out.println(minStudentPq.peek());
//        System.out.println(minStudentPq.contains(ns));
    }
}
