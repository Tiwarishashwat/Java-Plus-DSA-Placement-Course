class Vehicle {
    String model;              // instance field
    private int speed;

    Vehicle(){
        model = "SUV";
        speed = 40;
        System.out.println("Const is called");
    }

    Vehicle(String model, int speed){
        this(); //current class constructor call
        System.out.println("before: " + this.model);
        this.model = model;
        this.speed = speed;
        System.out.println("after: " + this.model);
    }

    Vehicle(Vehicle that){
        this.speed = that.speed;
        this.model = that.model;
    }

    void accelerate(int delta) { // behaviour
        speed += delta;
    }

    int getSpeed() {
        return speed;
    }
}


public class ConstructorDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Default: " + v.getSpeed());

        Vehicle v1 = new Vehicle("FORD", 60);
        System.out.println("Parameterized: " + v1.getSpeed());


        //copy const
        Vehicle v2 = new Vehicle(v1);
        System.out.println("Copy: " + v2.getSpeed());

        Vehicle v3 = v1;
        System.out.println("before v3 speed: " + v3.getSpeed());
        v3.accelerate(20);
        System.out.println("after v1 speed: " + v1.getSpeed());
        System.out.println("after v3 speed: " + v3.getSpeed());


    }
}
