class Person {
    void sleep() {
        System.out.println("Person sleeps");
    }
}

class Engineer extends Person {
    void work() {
        System.out.println("Employee works");
    }
}

class HR extends Person {
    void hire() {
        System.out.println("Hire employees");
    }
}

class TeamLead extends Engineer {   // Multilevel part
    void manage() {
        System.out.println("TeamLead manages project");
    }
}

public class HybridDemo {
    public static void main(String[] args) {
        TeamLead t = new TeamLead();
        t.sleep();  // from Person
        t.work();   // from Employee
        t.manage(); // from Manager

        HR h = new HR();
        h.sleep();  // from Person
        h.hire();  // from Student
    }
}
