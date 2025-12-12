class LivingThing {
    void breathe() {
        System.out.println("Living thing breathes");
    }
}

class Human extends LivingThing {
    void walk() {
        System.out.println("Human walks");
    }
}

class Employee extends Human {  // Multilevel
    void work() {
        System.out.println("Employee works in office");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.breathe(); // from LivingThing
        e.walk();    // from Human
        e.work();    // from Employee
    }
}
