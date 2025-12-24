# Nested Classes in Java

In Java, it is possible to define a class inside another class. Such classes are called **nested classes**.  
Nested classes logically group classes that are only used in one place, making the code more readable and maintainable.

---

## 1. Types of Nested Classes
Java supports **two main types** of nested classes:

1. **Non-static Nested Class (Inner Class)**
   - Member Inner Class  
   - Local Inner Class  
   - Anonymous Inner Class  
2. **Static Nested Class**

---

## 2. Member Inner Class
- Defined **inside another class** (as a member).
- Can access all members (even private) of the outer class.
- To create an object, you first need an object of the outer class.

### Example:
```java
class Outer {
    private String msg = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(msg); // accessing outer's private member
        }
    }
}

public class TestMemberInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // object creation
        inner.display();
    }
}
```
Output:
    Hello from Outer class

## 3. Local Inner Class

- Declared inside a method, constructor, or block.

- Scope is limited to that method/constructor/block.

- Cannot be accessed outside.

```java
class Outer {
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }
        LocalInner obj = new LocalInner();
        obj.display();
    }
}

public class TestLocalInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();
    }
}

```

Output:
    Inside Local Inner Class

## 4. Anonymous Inner Class

- A class without a name.

- Used to override methods of a class or interface instantly.

- Created at the point of object creation.

```java
abstract class Animal {
    abstract void sound();
}

public class TestAnonymousInner {
    public static void main(String[] args) {
        Animal a = new Animal() {   // anonymous inner class
            void sound() {
                System.out.println("Dog barks");
            }
        };
        a.sound();
    }
}

```
Output:
    Dog barks

## 5. Static Nested Class

- Declared with the static keyword inside another class.

- Behaves like a top-level class but is logically grouped.

- Can only access static members of the outer class directly.

- No need to create an object of the outer class to instantiate.

Example:

```java
class Outer {
    static String msg = "Hello from Outer";

    static class Nested {
        void display() {
            System.out.println(msg); // can access static data
        }
    }
}

public class TestStaticNested {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested(); // object creation
        nested.display();
    }
}

```

Output:
    Hello from Outer

## 6. Scope and Object Creation Summary    
## Scope and Object Creation Summary

| Type                  | Where Defined                     | How to Create Object                         | Scope / Access                                   |
|-----------------------|-----------------------------------|----------------------------------------------|-------------------------------------------------|
| Member Inner Class    | Inside class, as a member         | `Outer.Inner inner = outer.new Inner();`     | Can access all outer members (including private) |
| Local Inner Class     | Inside method, constructor, block | Defined and used only within that method     | Scope limited to method/constructor/block        |
| Anonymous Inner Class | At the point of object creation   | `ClassName obj = new ClassName(){...};`      | Used for overriding or implementing interfaces   |
| Static Nested Class   | Inside class with `static` keyword| `Outer.Nested obj = new Outer.Nested();`     | Can access only static members of outer class    |


Summary

- Nested classes allow logical grouping of classes inside another class.

- Member Inner Class → Needs outer object, can access all outer members.

- Local Inner Class → Scope limited to method/constructor/block.

- Anonymous Inner Class → Used for instant overriding/implementation.

- Static Nested Class → Does not need outer object, can only access static members of outer class.