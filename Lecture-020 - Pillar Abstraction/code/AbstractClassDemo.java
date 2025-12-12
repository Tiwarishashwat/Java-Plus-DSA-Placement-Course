// Abstract class
abstract class Shape {
    Shape(){
        System.out.println("I am shape");
    }
    // Abstract method (no body)
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape");
    }
}

// Concrete class
class Circle extends Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

// Another concrete class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    void area() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
//        Shape s = new Shape(); -> Compile-time error
        Shape s1 = new Circle(5);       // Circle object
        Shape s2 = new Rectangle(4, 6); // Rectangle object
        s1.area(); //circle
        s2.area(); //rect
        s1.display(); // Concrete method from abstract class
    }
}
