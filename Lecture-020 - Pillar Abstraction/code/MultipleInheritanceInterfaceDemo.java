// First interface
interface Printer {
    void print(String document);
    void switchOn();
}

// Second interface
interface Scanner {
    void scan(String document);
    void switchOn();
}

// A class implementing both interfaces
class MultiFunctionMachine implements Printer, Scanner {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    public void switchOn() {
        System.out.println("powering on");
    }


}

// Main class
public class MultipleInheritanceInterfaceDemo {
    public static void main(String[] args) {
        MultiFunctionMachine mfm = new MultiFunctionMachine();
        mfm.switchOn();
        mfm.print("Report.pdf");
        mfm.scan("ID Card");

    }
}
