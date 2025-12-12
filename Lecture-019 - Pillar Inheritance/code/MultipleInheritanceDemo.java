class Father {
    void snore(){
        System.out.println("Father's snoring");
    }
}

class Mother {
    void snore(){
        System.out.println("Mother's snoring");
    }
}
class Child extends Father {
    void play(){
        System.out.println("Child is playing");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.snore();
    }
}
