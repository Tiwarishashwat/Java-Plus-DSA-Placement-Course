class A {
    final int SPEED_LIMIT = 80;

    void updateSpeed(){
//         SPEED_LIMIT = 100;   //error
    }


    final void display() {
        System.out.println("Parent display");
    }
}
class B extends A {
//     void display();  //not allowed (cannot override)
}

final class C {

}

//class D extends C{
//
//}
public class FinalKeyWordDemo {
}
