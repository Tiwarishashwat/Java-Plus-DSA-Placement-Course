#  Exception Handling in Java

##  What is an Error?
- Errors are **serious issues** like `OutOfMemoryError`, `StackOverflowError`, etc.
- They are **not meant to be caught or handled** in code.

##  What is an Exception?
- An **exception** is an event that disrupts the normal flow of program execution (e.g., divide by zero, null access, invalid file).
- **Exceptions can be handled** using try-catch blocks.

###  try-catch Block
```java
try {
    // risky code
} catch (ExceptionType e) {
    // handle exception
}
```

below code will crash when user enters a string in input.
```java
import java.util.Scanner;
public class TryCatchExample {
    //Example of Runtime Exception / unchecked exception
    public int getUserInput(){
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt(); //if user enters string, program will crash
        return val;
    }
    public static void main(String[] args) {
        TryCatchExample t = new TryCatchExample();
        System.out.println("Insert a number");
        int val = t.getUserInput();
        System.out.println("Inserted value: " + val);
    }
}
```
using try-catch will help in handling the exception properly
```java
import java.util.Scanner;
public class TryCatchExample {
    //Example of Runtime Exception / unchecked exception
    public int getUserInput(){
        Scanner sc = new Scanner(System.in);
        int val=0;
        try{ //putting risking code inside try block
            val=sc.nextInt();
        }catch (Exception e){ //in case of exception we just print
            System.out.println("failed: " + e);
        }
        return val;
    }
    public static void main(String[] args) {
        TryCatchExample t = new TryCatchExample();
        System.out.println("Insert a number");
        int val = t.getUserInput();
        System.out.println("Inserted value: " + val);
    }
}
```
>  Both `Exception` and `Error` inherit from the `Throwable` class.

---

## Exceptions are of two types

### a) Checked Exceptions (Compile-time)
Handled during compilation. Must be either **caught** or **declared** with `throws`.

- `IOException`
- `SQLException`
- `FileNotFoundException`
- `ClassNotFoundException`

### b) Unchecked Exceptions (Runtime)
Checked during runtime. **No compiler enforcement** to handle.

- `ArithmeticException`
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `ClassCastException`
- `IllegalArgumentException`

>  All unchecked exceptions are subclasses of `RuntimeException`.

```
Throwable
 ├── Error                  (Serious problems, not handled)
 │     └── OutOfMemoryError, StackOverflowError, ...
 │
 └── Exception              (Problems you can handle)
       ├── RuntimeException (Unchecked exceptions)
       │      ├── NullPointerException
       │      ├── ArithmeticException
       │      └── ...
       │
       └── [Other Exceptions] (Checked exceptions)
              ├── IOException
              ├── SQLException
              ├── ClassNotFoundException
              └── ...
```


---