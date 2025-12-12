//T-> type
//E -> element
//K -> key
//V -> Value

public class MyGeneric {

    public <E> void heyGen(E element) {
        System.out.println("Hi generics " + element);
    }
    public static void main(String[] args) {

        MyGeneric mg = new MyGeneric();
        mg.heyGen("shashwat");
//        IntegerDisplayer obj = new IntegerDisplayer();
//        obj.setNum(20);
//        obj.display();
//
//        DoubleDisplayer obj1 = new DoubleDisplayer();
//        obj1.setNum(20.0);
//        obj1.display();

//        Displayer<Integer> obj2 = new Displayer<>();
//        obj2.setNum(20);
//        obj2.display();
//
//        Displayer<Double> obj3 = new Displayer<>();
//        obj3.setNum(20.0);
//        obj3.display();
//
//        Displayer2 d2 = new Displayer2();
//        d2.setNum(20);
//        d2.setNum(20.0);
//        d2.display();
//        Displayer<Student> obj2 = new Displayer<>();
//        obj2.setNum(new Student());
//        obj2.display();
//
//        Displayer<Teacher> obj4 = new Displayer<>();
//        obj4.setNum(new Teacher());
//        obj4.display();
    }
}

class College {
    void printCollegeName(){
        System.out.println("XYZ institute of technology");
    }
}

class Student extends College{
    void printName() {
        System.out.println("Student name printed");
    }
}

class Teacher extends College{
    void printName() {
        System.out.println("Teacher name printed");
    }
}


class Displayer2 {
    Object num;

    public void setNum(Object num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

class Displayer<T extends College> {
    T num;

    public void setNum(T num) {
        this.num.printCollegeName();
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

class IntegerDisplayer {
    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

class DoubleDisplayer {
    Double num;

    public void setNum(Double num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

interface MyInterface2<T extends Comparable>{
    public <T> void print(T name);
}

class MyImplementor implements MyInterface2 {



    @Override
    public void print(Object name) {

    }
}




class Confidential {
    static boolean isAspirant;
    Confidential(){
        isAspirant = true;
    }
    public static void main(String[] args) {
        if(!isSubscribed()){
            System.out.println("toh kar naa, karta kyu nhi hai!!!!");
        }
        System.out.println("");
    }
    static boolean isSubscribed() {
        if(isAspirant){
            return true;
        }
        return true;
    }
}










































