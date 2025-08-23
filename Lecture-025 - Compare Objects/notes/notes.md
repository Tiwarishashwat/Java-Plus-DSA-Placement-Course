# Comparable and Comparator in Java

In Java, when we need to **compare objects** (not just primitive values), we use either:
- **Comparable** (natural ordering)
- **Comparator** (custom ordering)

---

## 1. Why Do We Need Them?
- Objects of user-defined classes (e.g., `Student`, `Employee`) don’t have a default way of being compared.
- For sorting or searching collections (like `Collections.sort()` or `TreeSet`), Java needs a comparison logic.
- That’s where **Comparable** and **Comparator** come in.

---

## 2. Comparable Interface
- Belongs to `java.lang` package.
- Provides **natural ordering** of objects.
- A class implements `Comparable<T>` and overrides the `compareTo()` method.

### Syntax
```java
public interface Comparable<T> {
    public int compareTo(T o);
}
```

Return values of compareTo()

- 0 → Current object is equal to the given object.

- Positive (> 0) → Current object is greater.

- Negative (< 0) → Current object is smaller.

Quick trick:
- If result < 0 → keep as is.

- If result > 0 → swap elements.

- If result = 0 → consider equal (no swap).

Example: Sorting Students by Roll Number

```java
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo; // natural ordering by roll number
    }
}

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list); // uses compareTo

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}

```
---

## 3. Comparator Interface

- Belongs to java.util package.

- Used when we want multiple or custom sorting logics.

- Defines the method compare().

```java
public interface Comparator<T> {
    public int compare(T o1, T o2);
}

```

Example: sorting students by name

```java
import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // compare names alphabetically
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}

```
Instead of creating a separate class that implements `Comparator`, we can use an **anonymous inner class** directly at the point of sorting.

### Example: Sort Students by Roll Number (Descending)

```java
import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ComparatorAnonymousDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        // Using Comparator with Anonymous Class
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.rollNo - s1.rollNo; // descending by roll number
            }
        });

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}
```
## Lambda Expressions in Java (Introduced in Java 8)

A lambda expression is a short block of code that takes in parameters and returns a value.

It provides a clear and concise way to represent an implementation of a functional interface (an interface with a single abstract method, e.g., Comparator, Runnable).

Instead of creating an anonymous inner class, you can write the implementation in a lambda form.
Syntax:
(parameter1, parameter2, ...) -> { body of the method }
- left side → parameters
- Arrow -> → separates parameters and body
- Right side → body (expression or block of code)

Example: Comparator using Lambda
code with anonymous class:
```java
Collections.sort(list, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.rollNo - s1.rollNo; // descending
    }
});
```
code with lambda
```java
Collections.sort(list, (s1, s2) -> s2.rollNo - s1.rollNo);
```
Full Code with lambda:

```java
import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        // Using Comparator with Lambda
        Collections.sort(list, (s1, s2) -> s2.rollNo - s1.rollNo);

        for (Student s : list) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}
```
```
Output:
    3 Amit
    2 Neha
    1 Ravi
```

---

## When to Use?

**Comparable** → Use when there is a default / natural ordering (e.g., roll number, ID, price).

**Comparator** → Use when:

- You need multiple sorting criteria (e.g., by name, by roll number, by marks).

- You don’t want to modify the original class.

