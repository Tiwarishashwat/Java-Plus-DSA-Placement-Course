## **User-Defined or custom Exceptions**
Custom exceptions created by extending `Exception` or `RuntimeException`.

```java
// Step 1: Custom Exception
class LowMarksException extends Exception {
    public LowMarksException(String message) {
        super(message);
    }

}

public class MyCustomException {
    // Step 2: Method that checks eligibility
    public static void enrollStudent(String name, int marks) throws LowMarksException {
        if (marks < 40) {
            throw new LowMarksException("Sorry " + name + ", you need at least 40 marks to enroll!");
        } else {
            System.out.println(name + " enrolled successfully ");
        }
    }

    public static void main(String[] args) {
        try {
            enrollStudent("Ravi", 35); //  exception case
        } catch (LowMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            enrollStudent("Sita", 75); //  valid case
        } catch (LowMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

```

##  Exception vs Error vs RuntimeException

| Type              | Inherits   | Meant to be Handled? | Checked? |
|-------------------|------------|-----------------------|----------|
| Error              | Throwable |  No                 |  No     |
| Exception          | Throwable |  Yes                |  Yes (except RuntimeException) |
| RuntimeException   | Exception |  Yes                |  No     |
