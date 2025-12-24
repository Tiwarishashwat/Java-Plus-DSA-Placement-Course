class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        System.out.println("int int");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("double double");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("int int int");
        return a + b + c;
    }
}
public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));        // calls int add(int, int)
        System.out.println(calc.add(5.5, 10.5));    // calls double add(double, double)
        System.out.println(calc.add(1, 2, 3));      // calls int add(int, int, int)
    }
}
