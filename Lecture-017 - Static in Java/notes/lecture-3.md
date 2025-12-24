# Static in Java

In Java, the **`static`** keyword is used for memory management and to
create members that belong to the class rather than any specific object.

------------------------------------------------------------------------

## 1. Static Variable

-   A **static variable** is shared among all objects of the class.
-   It belongs to the class, not to individual objects.
-   It is created only once in the memory (class area).
-   Commonly used for constants or counters.

### Example:

``` java
class Student {
    int rollNo;
    String name;
    static String college = "ABC College"; // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class TestStaticVariable {
    public static void main(String args[]) {
        Student s1 = new Student(101, "Raj");
        Student s2 = new Student(102, "Anita");
        s1.display();
        s2.display();
    }
}
```

Output:

    101 Raj ABC College
    102 Anita ABC College

------------------------------------------------------------------------

## 2. Static Method

-   A **static method** belongs to the class rather than an object.
-   It can be called without creating an object of the class.
-   It can only access **static data** and **static methods** directly.
-   Cannot use `this` or `super` inside static methods.

### Example:

``` java
class Calculator {
    static int cube(int x) {
        return x * x * x;
    }
}

public class TestStaticMethod {
    public static void main(String args[]) {
        System.out.println(Calculator.cube(5)); // calling without object
    }
}
```

Output:

    125

------------------------------------------------------------------------

## 3. Static Block

-   A **static block** is used to initialize static data members.
-   It runs only once, when the class is first loaded into memory.
-   Executes **before main() method**.

### Example:

``` java
class Example {
    static int count;

    // static block
    static {
        count = 10;
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Count = " + count);
    }
}
```

Output:

    Static block executed.
    Main method executed.
    Count = 10

------------------------------------------------------------------------

## Summary

-   **Static Variable** → shared across all objects, belongs to the
    class.
-   **Static Method** → can be called without an object, works with
    static data.
-   **Static Block** → runs once when class loads, used for
    initialization.
