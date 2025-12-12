class Animal {
    int noOfLegs;
    private void hear(){
        System.out.println("Animal is hearing");
    }
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {  // Single inheritance
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.noOfLegs = 4;
        d.eat();  // from Animal
        d.bark(); // from Dog
//      d.hear(); // cannot be called
        Animal a = new Animal();
//        a.bark(); // parent cannot access child methods.
    }
}
