class Engine {
    void run() {
        System.out.println("Engine running...");
    }
}

class Truck {
    private Engine engine; // composition

    Truck() {
        engine = new Engine(); // created inside
    }

    void start() {
        engine.run();
        System.out.println("Truck is moving...");
    }
}
