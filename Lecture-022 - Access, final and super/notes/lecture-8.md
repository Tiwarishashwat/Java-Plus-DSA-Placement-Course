# Final, Super, and Access Modifiers in Java

---

## 1. Access Modifiers in Java (Visibility)

Java provides four access modifiers that control visibility of classes, variables, and methods.

# Access Modifiers in Java (Visibility)

| **Modifier**              | **Within Class** | **Within Package** | **Subclass (other package)** | **Outside Package** |
|---------------------------|--------------|----------------|--------------------------------------|---------------------|
| **private**               | Yes          | No             | No                        | No              |
| **default (no keyword)**  | Yes          | Yes            | No                        | No              |
| **protected**             | Yes          | Yes            | Yes                       | No              |
| **public**                | Yes          | Yes            | Yes                       | Yes             |


## 2. `final` Keyword in Java
The `final` keyword can be used with **variables, methods, and classes**.

- **Final Variable** → value cannot be changed once assigned.
- **Final Method** → cannot be overridden by child classes.
- **Final Class** → cannot be inherited.

### Example:
```java
class Vehicle {
    final int speedLimit = 100; // final variable

    final void run() {          // final method
        System.out.println("Vehicle is running safely");
    }
}

final class Car {               // final class
    void display() {
        System.out.println("Car class cannot be inherited");
    }
}
```
## 3. super Keyword in Java

The super keyword refers to the parent class object.
It is used for:

- Accessing parent class variables/methods when they are hidden by child.

- Calling parent class constructor from child class constructor.

Example:
```java
class Animal {
    String name = "Animal";

    void display() {
        System.out.println("This is an animal");
    }

    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        super.display(); // calls parent method
        System.out.println("This is a dog");
    }

    Dog() {
        super(); // calls parent constructor
        System.out.println("Dog constructor called");
    }

    void printNames() {
        System.out.println(super.name); // parent variable
        System.out.println(name);       // child variable
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.printNames();
    }
}

```
Output
    Animal constructor called
    Dog constructor called
    This is an animal
    This is a dog
    Animal
    Dog


## Summary

**final** →

- Variable: cannot be reassigned

- Method: cannot be overridden

- Class: cannot be inherited


**super** → used to call parent class variables, methods, and constructors.

**Access Modifiers** → define scope of members:

- private (within class only)

- default (within package)

- protected (package + subclasses)

- public (accessible everywhere)