class Student {
   static String canteen;
   static String university;
   static { //block
       System.out.println("Static Block Invoked");
       canteen = "messy mess";
       university ="IIT Bidholi";
       greetStudent();
   }
   String name;
   int rollNumber;
   Student(String name, int rollNumber){

       this.name = name;
       this.rollNumber = rollNumber;
   }
   static void greetStudent(){
       System.out.println("Hello and welcome to " + university);
   }

   public int getRollNumber(){
       return rollNumber;
   }

}

public class StaticDemo {
   public static void main(String[] args) {
       System.out.println(Student.canteen);
       Student s1 = new Student("shashwat",47);
       Student.canteen = "new canteen";
       System.out.println(Student.canteen);


   }
}
