public class NestedClass {
    public static void main(String[] args) {


        Outer obj1 = new Outer();
        Outer.Inner innerObject = obj1.new Inner();

        obj1.displayData();
        innerObject.displayData();

        NoName nn = new NoName(){
            void display(){
                System.out.println("Anonymous class");
            }

            void print(){
                System.out.println("printed class");
            }
        };

        nn.display();
        nn.print();

        NoGame ng = new NoGame(){
            public void display(){
                System.out.println("No Game");
            }
        };

        ng.display();








//        Outer outerObject = new Outer();
//        Outer.Inner innerObject = outerObject.new Inner();
//        outerObject.displayData();
//        innerObject.displayData();


//        Outer outerObject = new Outer();
//        Outer.Inner innerObject = outerObject.new Inner();

        // Anonymous inner class
//        NoName nn = new NoName(){
//            void display(){
//                System.out.println("This is Noname object");
//            }
//        };
//
//        nn.display();
//
//        NoGame ng = new NoGame() {
//            public void display() {
//                System.out.println("This is Nogame object");
//            }
//        };
//
//        ng.display();
//
//        Normal nc = new Normal(){};
//        nc.display();
//
//        Fan f = new Fan();
//        f.display();
//
        OuterNonStatic ons = new OuterNonStatic();
        OuterNonStatic.InnerStatic obj = new OuterNonStatic.InnerStatic();
        obj.display();

        // no need of object
        OuterNonStatic.InnerSecondStatic.display();
        // no need of object
        OuterNonStatic.InnerSecondStatic obj2 = new OuterNonStatic.InnerSecondStatic();
    }
}

class OuterNonStatic{

    static int age;
    String name;
    static class InnerStatic {
        void display(){
            age = 20;
            System.out.println("Non Static Method inside Static Inner class");
        }
    }

    static class InnerSecondStatic {
        static void display(){
            System.out.println("Static method inside Non-Static Inner class");
        }
    }
}

// Local Inner Class
class Fan {
    void display(){
        System.out.println("Outer display");
        class InnerFan {
            void display() {
                System.out.println("Inner Display");
            }
        }
        InnerFan f = new InnerFan();
        f.display();
    }
}


class Normal {
    void display(){
        System.out.println("This is Normal class");
    }
}
abstract class NoName {
    abstract void display();
    abstract void print();
}

interface NoGame {
    void display();
}

class Outer {
    static int rollNumber;
    String name;
    private int age;
    int data;
    Outer(){
        rollNumber = 100;
        this.name = "shashwat";
        this.age = 24;
        this.data = 10;
        System.out.println("Init Outer");
    }

    public void displayData(){
        System.out.println("Outer Data is: " + data);
        Inner obj = new Inner();
        System.out.println("Inner Data is: " + obj.data);
        System.out.println("Inner rollNumber is: "+ Inner.rollNumber);
    }
    //member inner class
    class Inner {
        static int rollNumber;
        static String name;
        int data;
        Inner(){
            name = "Inner";
            this.data = 20;
            System.out.println("Init Inner");
        }
        Inner(int data){
            name = "inner";
            this.data = data;
        }
        public void displayData(){
            System.out.println("Data is: "+ data); //outer / Inner ?
            System.out.println("Outer Data is: " + Outer.this.data);
            System.out.println("Outer age is: " + Outer.this.age);
            Outer.this.displayData();
        }

        public void displayRollNumber(){
            System.out.println("Outer RollNumber is: "+Outer.rollNumber);
            System.out.println("Inner RollNumber is: "+ rollNumber);
        }
    }
    class InnerNew extends Inner{

    }
}

//1.  MIC -> Access Specifiers -> Yes
//2. LIC -> Access Specifiers -> No - [final and abstract]
//3. AIC -> No














