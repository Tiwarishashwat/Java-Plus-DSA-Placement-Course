class E {
    int speed = 50;

    E() {
        System.out.println("Parent constructor");
    }
    E(String name){
        System.out.println("Hello " + name);
    }

    void display() { System.out.println("Parent display"); }
}
class F extends E {
    int speed = 100;
    F() {
        super("shashwat"); // calls Parent constructor (must be first line)
        System.out.println("Child constructor");
    }
    void show() {
        System.out.println(speed); // 100 (child's value)
        System.out.println(super.speed); // 50 (parent’s value)
    }
    void display() {
        System.out.println("Child display");
        super.display(); // calls parent’s version
    }
}



public class SuperKeyWordDemo {
}
