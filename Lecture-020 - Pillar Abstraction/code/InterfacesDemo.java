// Interface
interface Payment {
    void pay(double amount);  // abstract method (all payment types must implement it)
}

// UPI payment
class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Credit Card payment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}


// Main class
public class InterfacesDemo {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CreditCardPayment();

        p1.pay(500);
        p2.pay(1200);

    }
}


