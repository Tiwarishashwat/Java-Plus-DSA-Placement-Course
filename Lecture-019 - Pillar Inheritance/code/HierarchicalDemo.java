class Appliance {
    void switchOn() {
        System.out.println("Appliance is turned on");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating");
    }
}

class Light extends Appliance {
    void glow() {
        System.out.println("Light is glowing");
    }
}


public class HierarchicalDemo {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.switchOn();
        f.rotate();

        Light l = new Light();
        l.switchOn();
        l.glow();
    }
}
