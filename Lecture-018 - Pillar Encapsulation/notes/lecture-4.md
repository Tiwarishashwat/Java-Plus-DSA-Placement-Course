# Encapsulation in Java

Encapsulation is one of the four pillars of Object-Oriented Programming
(OOP).\
It is the process of **wrapping data (variables) and methods (functions)
into a single unit (class)** and restricting direct access to the data.

------------------------------------------------------------------------

## Key Points

-   Data is hidden from direct access by making variables **private**.
-   Provides controlled access through **public getter and setter
    methods**.
-   Improves security by preventing unauthorized access/modification of
    data.
-   Helps in achieving **data hiding** and **abstraction**.

------------------------------------------------------------------------

## Example of Encapsulation

``` java
class Student {
    // private variables - hidden from outside classes
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // setting values using setter methods
        s.setName("Raj");
        s.setAge(20);

        // getting values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // invalid age example
        s.setAge(-5);
    }
}
```

### Output:

    Name: Raj
    Age: 20
    Age must be positive.

------------------------------------------------------------------------

## Advantages of Encapsulation

1.  **Data Hiding** → internal details are hidden, only necessary
    information is exposed.
2.  **Improved Security** → restricts direct modification of fields.
3.  **Code Maintainability** → fields can be changed internally without
    affecting external classes.
4.  **Flexibility** → validation logic can be added in setters before
    assigning values.
5.  **Reusability** → encapsulated code can be reused in different
    projects.

------------------------------------------------------------------------

## Summary

-   **Encapsulation** = wrapping data + methods in one unit (class).
-   Use **private variables** with **public getter & setter methods**
    for controlled access.
-   Provides **security, data hiding, flexibility, and
    maintainability**.
