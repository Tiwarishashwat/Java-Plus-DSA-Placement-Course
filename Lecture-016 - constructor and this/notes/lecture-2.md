# Java OOP Basics - Lecture 2

## 1. Constructor Definition
- A **constructor** is a special method in Java used to initialize objects.
- Rules:
  - Has the **same name as the class**.
  - No return type (not even `void`).
  - Called automatically when an object is created.

---

## 2. Types of Constructors

### a) Default Constructor
- Created by compiler if no constructor is defined.
- Initializes instance variables with default values.
```java
class Student {
    String name;
    int age;
    // default constructor is implicitly provided
}
```

### b) Parameterized Constructor
- Allows passing values at the time of object creation.
```java
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

### c) Copy Constructor (User-defined)
- Copies values of one object into another.
```java
class Student {
    String name;
    int age;

    Student(Student s) {   // copy constructor
        this.name = s.name;
        this.age = s.age;
    }
}
```

---

## 3. `this` Keyword
- Refers to the **current object**.
- Uses:
  - To differentiate between instance variables and parameters.
  - To call another constructor in the same class.
  - To return current object.

Example:
```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // resolves ambiguity
        this.age = age;
    }
}
```

---

## 4. `this()` - Calling One Constructor from Another
- Used to call another constructor of the **same class**.
- Must be the **first statement** in the constructor.

Example:
```java
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0); // calls parameterized constructor
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 5. Object Copying

### a) Reference Copy
- Both references point to the **same object**.
```java
Student s1 = new Student("Rahul", 20);
Student s2 = s1; // reference copy
```

### b) Field-wise Copy (Manual Copy)
- Create new object and assign values manually.
```java
Student s1 = new Student("Rahul", 20);
Student s2 = new Student();
s2.name = s1.name;
s2.age = s1.age;
```

### c) Copy Constructor
- Already explained above, copies fields automatically.
```java
Student s3 = new Student(s1); // uses copy constructor
```

---
