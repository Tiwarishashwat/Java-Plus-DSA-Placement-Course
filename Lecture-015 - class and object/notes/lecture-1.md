# Java OOP Basics

## 1. What is a Class?
- A **class** is a blueprint or template for creating objects.
- It defines **properties (fields/variables)** and **behaviors (methods)**.

## 2. What is an Object?
- An **object** is an instance of a class.
- It represents a real-world entity with **state (data)** and **behavior (methods)**.

## 3. How to Create an Object of a Class?
- General syntax:
  ```java
  ClassName obj = new ClassName();
  ```
- Example:
  ```java
  Student s1 = new Student();
  ```

## 4. How Object is Stored in Memory?
- When an object is created:
  - **Heap Memory**: Actual object (instance variables) is stored here.
  - **Stack Memory**: Reference variable (like `s1`) is stored here, which points to the object in heap.

## 5. What is `new` Keyword?
- The **`new` keyword** is used to create objects in Java.
- It allocates memory in the **heap** and returns the reference.
- Example:
  ```java
  Student s1 = new Student(); // 'new' allocates memory
  ```

## 6. Constructor in Java
- A **constructor** is a special method used to initialize objects.
- Has the same name as the class, no return type (not even `void`).
- Called automatically when an object is created.
