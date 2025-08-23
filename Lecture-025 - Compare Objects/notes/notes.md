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

Example: Sorting Students by increasing order of Roll Number

```java
import java.util.*;
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    //neg -> no swap
    //pos -> swap
    //zero -> objects are equal
//    [A, B, C]
    @Override
    public int compareTo(Student that){
//        this , that
        if(this.rollNo < that.rollNo){
            return -100; //no swap req
        }else{
            return 1; //swap
        }
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));

        Collections.sort(list);
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

Example: sorting students by decreasing order of marks

```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class MyCustomComparator implements Comparator<Student>{
    // decreasing
    @Override
    public int compare(Student s1, Student s2){
        if(s1.marks < s2.marks){
            return 1;
        }else{
            return -1;
        }
    }
}


public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
            list.add(new Student(3, "Amit",50));
            list.add(new Student(1, "Ravi",70));
            list.add(new Student(2, "Neha",80));

            Collections.sort(list, new MyCustomComparator());

        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}


```
Instead of creating a separate class that implements `Comparator`, we can use an **anonymous inner class** directly at the point of sorting.

### Example: Sort Students by marks (Descending)

```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorAnonymousDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));


        // Using Comparator with Anonymous Class
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s1.marks < s2.marks){
                    return 1;
                }else{
                    return -1;
                }
            }

        });

        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}
```

trick to avoid <  or > symbols..

- compareTo(first, second)
  
- for decreasing order sorting -> return (second - first)
  
- for increasing order sorting -> return (first - second)

### Example: Sort Students by marks (Descending)

```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorTrickDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));
        list.add(new Student(4, "Priya",80));

        //(first, second)
        // dec -> second - first
        //inc -> first - second
        // Using Comparator with Anonymous Class
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                
               return s2.marks - s1.marks;

            }
        });

        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}

```
### Example: Sort Students by marks (Descending) and if marks is same then sort in increasing order of roll number.
```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorTrickDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));
        list.add(new Student(4, "Priya",80));

        //(first, second)
        // dec -> second - first
        //inc -> first - second
        // Using Comparator with Anonymous Class
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                // cond -> sort in dec order of marks.
                // if marks is same then sort in increasing order of rollNo.
                if(s1.marks == s2.marks){
                    return s1.rollNo - s2.rollNo;
                }

               return s2.marks - s1.marks;

            }
        });

        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
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
        return s2.marks - s1.marks; // descending
    }
});
```
code with lambda
```java
Collections.sort(list, (s1, s2) -> s2.marks - s1.marks);
```
Full Code with lambda: (decreasing order of marks)

```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));
        list.add(new Student(4, "Priya",80));

        //(first, second)
        // dec -> second - first
        //inc -> first - second
        // Using Comparator with Lambda expression

        Collections.sort(list, (s1,s2) ->  s2.marks - s1.marks);


        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}


```
Full Code with lambda: (decreasing order of marks and if marks are same then increasing order of roll no.)

```java
import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit",50));
        list.add(new Student(1, "Ravi",70));
        list.add(new Student(2, "Neha",80));
        list.add(new Student(4, "Priya",80));

        //(first, second)
        // dec -> second - first
        //inc -> first - second
        // Using Comparator with Lambda expression

        // cond -> sort in dec order of marks.
        // if marks is same then sort in increasing order of rollNo.
        Collections.sort(list, (s1,s2) -> {
            if(s1.marks == s2.marks){
                return s1.rollNo - s2.rollNo;
            }
            return s2.marks - s1.marks;
        });
        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}

```

---

## When to Use?

**Comparable** → Use when there is a default / natural ordering (e.g., roll number, ID, price).

**Comparator** → Use when:

- You need multiple sorting criteria (e.g., by name, by roll number, by marks).

- You don’t want to modify the original class.

