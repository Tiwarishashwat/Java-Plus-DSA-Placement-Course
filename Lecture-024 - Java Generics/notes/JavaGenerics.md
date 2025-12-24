# Generics in Java

Generics in Java were introduced in **Java 5** to provide **type safety** and **compile-time checking** while working with collections, classes, methods, and interfaces.

---

## 1. What are Generics?
- Generics allow you to write **type-independent code**.
- They enable classes, interfaces, and methods to **operate on objects of specified types** without the need for explicit typecasting.
- Provides **compile-time type checking** and reduces `ClassCastException` at runtime.

---

## 2. Why Generics? 
A) To handle Code redundancy by removing explicit type castings

**Without Generics**
```java
class IntegerDisplayer {
    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}
//just for handling a different data type we are duplicating entire class
class DoubleDisplayer {
    Double num;

    public void setNum(Double num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

public class MyGeneric {
    public static void main(String[] args) {
        IntegerDisplayer obj = new IntegerDisplayer(); 
        obj.setNum(20);
        obj.display();

        DoubleDisplayer obj1 = new DoubleDisplayer(); 
        obj1.setNum(20.0);
        obj1.display();
    }
}

```
**With Generics**

```java
// create only class with generics
class Displayer<T> {
    T num;

    public void setNum(T num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

public class MyGeneric {
    public static void main(String[] args) {
        Displayer<Integer> obj2 = new Displayer<>();
        obj2.setNum(20);
        obj2.display();

        Displayer<Double> obj3 = new Displayer<>();
        obj3.setNum(20.0);
        obj3.display();
    }
}
```

B) To handle Type Safety
Although we can use Object to handle any type like Integer, Character etc but we can't guarentee type safety.

**Without Generics**
```java
import java.util.*;

public class WithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type
        list.add("Hello");
        list.add(100); // allowed (not type-safe)

        for (Object obj : list) {
            String str = (String) obj; // ClassCastException at runtime
            System.out.println(str);
        }
    }
}
```

**With Generics**
```java
import java.util.*;

public class WithGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // type-safe
        list.add("Hello");
        // list.add(100); // compile-time error (type safety)

        for (String str : list) { // no explicit casting needed
            System.out.println(str);
        }
    }
}
```

- Generics enforce compile-time checking.
- Prevents runtime errors caused by wrong type insertion.

---

## 3. Forms of Generics in Java
(a) **Generic Classes**

Define a class with type parameters.

```java
// create only class with generics
class Displayer<T> {
    T num;

    public void setNum(T num) {
        this.num = num;
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

public class MyGeneric {
    public static void main(String[] args) {
        Displayer<Integer> obj2 = new Displayer<>();
        obj2.setNum(20);
        obj2.display();

        Displayer<Double> obj3 = new Displayer<>();
        obj3.setNum(20.0);
        obj3.display();
    }
}

```

(b) **Generic Methods**

Methods can declare their own type parameters.

```java

public class MyGeneric {
    public <E> void heyGen(E element) {
        System.out.println("Hi generics " + element);
    }
    public static void main(String[] args) {
        MyGeneric mg = new MyGeneric();
        mg.heyGen("shashwat");
    }
}

```

(c) **Generic Interfaces**

Interfaces can also be generic.

```java
interface Container<T> {
    void add(T item);
    T get();
}

class StringContainer implements Container<String> {
    private String item;

    public void add(String item) {
        this.item = item;
    }
    public String get() {
        return item;
    }
}

public class TestGenericInterface {
    public static void main(String[] args) {
        Container<String> c = new StringContainer();
        c.add("Java Generics");
        System.out.println(c.get());
    }
}

```
(d) **Bounded Generics**

Restrict types using extends (upper bound).

```java
class College {
    void printCollegeName(){
        System.out.println("XYZ institute of technology");
    }
}

class Student extends College{
    void printName() {
        System.out.println("Student name printed");
    }
}

class Teacher extends College{
    void printName() {
        System.out.println("Teacher name printed");
    }
}

//T must extend College 
class Displayer<T extends College> {
    T num;

    public void setNum(T num) {
        this.num = num;
        this.num.printCollegeName();
    }

    public void display(){
        System.out.println("element -> "+ this.num);
    }
}

public class MyGeneric {
    public static void main(String[] args) {
        Displayer<Student> obj2 = new Displayer<>();
        obj2.setNum(new Student());
        obj2.display();

        Displayer<Teacher> obj4 = new Displayer<>();
        obj4.setNum(new Teacher());
        obj4.display();
    }
}
```

## 4. Summary

- Generics provide type safety and eliminate explicit typecasting.

- Can be applied to Classes, Methods, and Interfaces.

- Bounded Generics restrict type parameters.

- Widely used in Collections Framework (List<T>, Map<K,V>, etc.).