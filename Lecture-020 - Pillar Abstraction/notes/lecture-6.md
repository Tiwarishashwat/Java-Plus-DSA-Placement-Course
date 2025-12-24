# Abstraction in Java

Abstraction is one of the four pillars of Object-Oriented Programming (OOP).  
It is the process of **hiding implementation details** and showing only the essential features to the user.

---

## 1. What is Abstraction?
- Abstraction focuses on **what an object does**, not **how it does it**.
- It hides the internal implementation and exposes only the necessary functionality.
- Example: A TV remote is an abstraction for a television's complex functions. You interact with a simple interface of buttons like "power" and "volume" without needing to understand the TV's internal circuitry. This principle of hiding the implementation and showing only essential features is the core of abstraction.

---

## 2. How to Achieve Abstraction in Java?
Abstraction in Java can be achieved in two ways:
1. **Abstract Classes (0%–100% abstraction)**
2. **Interfaces (100% abstraction before Java 8, but Java 8+ allows default and static methods)**

---

## 3. Abstract Classes
- A class declared with the `abstract` keyword.
- Can have **abstract methods** (without body) and **concrete methods** (with body).
- Cannot be instantiated (no objects can be created directly).
- Can have **constructors** (used for initializing variables when subclass objects are created).

### Example of Abstract Class:
```java
abstract class Animal {
    // abstract method (no body)
    abstract void sound();

    // concrete method (with body)
    void eat() {
        System.out.println("This animal eats food.");
    }

    // constructor in abstract class
    Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Dog extends Animal {
    // implementing abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        // Animal a = new Animal(); //  Not allowed
        Dog d = new Dog(); //  Allowed
        d.sound();
        d.eat();
    }
}
```
Output:

    Animal constructor called.
    Dog barks.
    This animal eats food.


Key Points:

**Abstract methods** → declared without body, must be implemented by child class.

**Concrete methods** → normal methods with body, can be inherited as is.

**Constructors** → allowed in abstract classes, executed when a subclass object is created.

**Objects** → cannot create an object of abstract class directly.


## 4. Interfaces in Java

- An interface is a collection of abstract methods (and from Java 8, also default and static methods).

- Provides 100% abstraction (before Java 8).

- Used to achieve multiple inheritance in Java.

```java
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key.");
    }
    public void stop() {
        System.out.println("Car stops with brake.");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}

```
Output:

    Car starts with key.
    Car stops with brake.

## 5. Multiple Inheritance Using Interfaces

- Java does not support multiple inheritance with classes, but it allows it with interfaces.

- A class can implement multiple interfaces.

```java
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Method from A");
    }
    public void showB() {
        System.out.println("Method from B");
    }
}

public class TestMultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}

```

## Summary

- Abstraction → Hides implementation, shows only essential features.

- Abstract Classes → Can have abstract + concrete methods, can have constructors, cannot create objects directly.

- Abstract Methods → Must be implemented by subclasses.

- Interfaces → Provide full abstraction, used for multiple inheritance.

- Multiple Inheritance → Achieved in Java using interfaces, not classes.