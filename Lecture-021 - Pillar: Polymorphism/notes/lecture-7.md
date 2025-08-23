# Polymorphism in Java

Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).  
It means **"many forms"** — the same method or object can behave differently depending on the situation.

---

## 1. What is Polymorphism?
- Polymorphism allows a single interface to be used for different underlying data types.
- In Java, it is mainly divided into two types:
  1. **Compile-time Polymorphism** (Early Binding / Method Overloading)
  2. **Runtime Polymorphism** (Late Binding / Method Overriding)

---

## 2. Compile-time Polymorphism (Method Overloading)
- Achieved using **method overloading**.
- Multiple methods with the **same name but different parameter lists** (different number or types of parameters).
- Decision of which method to call is made at **compile time**.

### Example:
```java
class Calculator {
    // method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // overloaded method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // calls first method
        System.out.println(calc.add(5, 10, 15));   // calls second method
    }
}
```

Output:
    15
    30

## 3. Runtime Polymorphism (Method Overriding)

- Achieved using method overriding.

- A child class provides a specific implementation of a method already defined in the parent class.

- Decision of which method to call is made at runtime.

- Requires inheritance and usually upcasting (reference of parent, object of child).

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound(); // calls Dog’s implementation
    }
}

```

Output:
    Dog barks

## 4. Rules for Method Overloading

- Must change number of parameters or type of parameters or order of parameters.

- Cannot overload only by changing return type.

- Can have different access modifiers.

## 5. Rules for Method Overriding

- Method name, parameters, and return type must be same as parent’s.

- Cannot override private, static, or final methods.

- Access modifier in child should not be more restrictive than parent.

- Example: Parent has protected, child can use public, but not private.

- Overridden method is always resolved at runtime (late binding).

## Summary

- Compile-time Polymorphism (Overloading) → Same method name, different parameters. Decision made at compile time.

- Runtime Polymorphism (Overriding) → Child redefines parent’s method. Decision made at runtime.

- Overloading Rules → Must change parameters, not just return type.

- Overriding Rules → Same method signature, cannot override private/static/final, access level can be widened.