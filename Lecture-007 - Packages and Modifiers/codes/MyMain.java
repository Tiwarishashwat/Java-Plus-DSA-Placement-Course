// package com.college;

// import com.college.student.MyStudent;
// import com.college.student.studentdetails.StudentDetails;
// import com.college.teacher.MyTeacher;
// import com.college.teacher.teacherdetails.TeacherDetails;

class MyMain {
    int a = 0 ;
    static int b; 
    static {
        b = b + 10;
    }
    static class ChotaMain{

        static void print(){
            System.out.println(b);
            System.out.println(a);
        }

    }
    

 

    public static void main(java.lang.String[] args) {
        System.out.println("I am Main");

        // MyStudent ms = new MyStudent();
        // ms.print();

        // MyTeacher mt = new MyTeacher();
        // mt.print();

        // StudentDetails sd = new StudentDetails();
        // sd.print();

        // TeacherDetails td = new TeacherDetails();
        // td.print();
        System.out.println(MyMain.b);
        // MyMain m = new MyMain();  
        // System.out.println(m.b+m.a);        

    }
}



