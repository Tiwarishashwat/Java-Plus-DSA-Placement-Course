# Inheritance in Java

Inheritance is one of the four pillars of Object-Oriented Programming
(OOP).\
It allows a class (**child/subclass**) to acquire properties and
behaviors (fields and methods) of another class
(**parent/superclass**).\
This promotes **code reusability** and establishes a **parent-child
relationship** between classes.

------------------------------------------------------------------------

## 1. What is Inheritance?

-   Mechanism of reusing code from one class into another.
-   The **`extends`** keyword is used in Java to implement inheritance.
-   A **child class** can use methods and variables of the **parent
    class**.

### Example:

``` java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // child’s own method
    }
}
```

**Output:**

    This animal eats food.
    Dog barks.

------------------------------------------------------------------------

## 2. Types of Inheritance in Java

### (a) Single Inheritance

-   A child class inherits from a single parent class.

``` java
class A { }
class B extends A { }
```

### (b) Multilevel Inheritance

-   A class inherits from another class, which itself inherits from
    another class.

``` java
class A { }
class B extends A { }
class C extends B { }
```

### (c) Hierarchical Inheritance

-   Multiple child classes inherit from a single parent class.

``` java
class A { }
class B extends A { }
class C extends A { }
```

### (d) Hybrid Inheritance

-   A combination of two or more types of inheritance.
-   **Not directly supported in Java** due to ambiguity issues caused by
    multiple inheritance with classes.

------------------------------------------------------------------------

## 3. Multiple Inheritance in Java

-   **Multiple inheritance with classes is not supported in Java.**
-   Reason: **Diamond Problem** → If two parent classes have the same
    method and a child class inherits both, the compiler gets confused
    which one to use.

### Example (Not Allowed in Java):

``` java
class A {
    void show() { System.out.println("Class A"); }
}

class B {
    void show() { System.out.println("Class B"); }
}

// Not allowed in Java
class C extends A, B { 
    // Ambiguity: Which show() method should C inherit?
}
```

➡ Java avoids this problem by not allowing multiple inheritance with
**classes**.\
➡ However, multiple inheritance is possible in Java using
**interfaces**.

------------------------------------------------------------------------

## 4. Parent-Child Method Access

-   A **child class** can call both its own methods and inherited
    methods of the parent.
-   A **parent class** cannot call child methods directly, because it
    doesn't know about child-specific implementations.

Example:

``` java
class Parent {
    void parentMethod() {
        System.out.println("Method in parent class.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Method in child class.");
    }
}

public class TestMethods {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();
        // p.childMethod(); //  Not allowed

        Child c = new Child();
        c.parentMethod(); //  allowed
        c.childMethod();  //  allowed
    }
}
```

------------------------------------------------------------------------

## 5. Object Class in Java

-   In Java, **Object class is the parent of all classes**.
-   Every class in Java either directly or indirectly inherits from
    `Object` class.
-   It provides some common methods like:
    -   `toString()`
    -   `equals(Object obj)`
    -   `hashCode()`
    -   `getClass()`

### Example:

``` java
class Demo { }

public class TestObjectClass {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.toString()); // from Object class
        System.out.println(d.hashCode()); // from Object class
    }
}
```

------------------------------------------------------------------------

## Summary

-   **Inheritance** → acquiring properties and methods from a parent
    class.
-   Types: **Single, Multilevel, Hierarchical, Hybrid (not supported
    directly)**.
-   **Multiple inheritance** with classes is not allowed to prevent
    ambiguity (diamond problem).
-   Child can access parent methods, but parent cannot access child
    methods.
-   **Object class** is the root class of Java, parent of all classes.
