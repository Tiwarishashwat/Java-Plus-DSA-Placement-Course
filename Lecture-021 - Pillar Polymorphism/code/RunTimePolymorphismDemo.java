class Battery {
    Battery(){
        System.out.println("Device battery");
    }
}

class LithiumIon extends Battery{
    LithiumIon(){
        System.out.println("LithiumIon battery");
    }
}

class Device {
    void charge() {
        System.out.println("Charging device...");
    }
    Battery battery(){
        return new Battery();
    }
}

class Phone extends Device {
    @Override
    public void charge() {
        System.out.println("Phone is charging with Type-C cable");
    }
    @Override
    LithiumIon battery(){
        return new LithiumIon();
    }
}

class Laptop extends Device {
    @Override
    void charge() {
        System.out.println("Laptop is charging with power adapter");
    }
}

class SmartWatch extends Device {
    @Override
    void charge() {
        System.out.println("SmartWatch is charging wirelessly");
    }
}

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        Device d;  // Reference of parent

        d = new Phone();
        d.charge();   // Phone is charging with Type-C cable

        d.battery(); // lithium overrides here!

        d = new Laptop();
        d.charge();   // Laptop is charging with power adapter

        d = new SmartWatch();
        d.charge();   // SmartWatch is charging wirelessly


    }
}
