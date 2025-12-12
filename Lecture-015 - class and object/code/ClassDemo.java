class Car {
    String model;              // instance field
    private int speed;

    void accelerate(int delta) { // behaviour
        speed += delta;
    }

    int getSpeed() {
        return speed;
    }

    public static void connectDataBase(){
        System.out.println("database is connected now");
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        //heap memory
        Car car = new Car(); //default constructor
        car.model = "honda city";
        car.accelerate(60);
        System.out.println( car.getSpeed());
    }
}
