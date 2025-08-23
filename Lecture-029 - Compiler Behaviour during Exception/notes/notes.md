## Compiler Behavior During Exceptions

- **Checked Exceptions:** These are verified by the compiler at compile time. If they are not handled (either using `try-catch` or by declaring with `throws`), the code will not compile.  
- **Unchecked Exceptions (Runtime Exceptions):** These are **not checked** at compile time. The code will compile even if they are not handled, but it may throw an error and fail **at runtime** if such an exception occurs.

example:
```java
import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        // if we remove try and catch from this code, it will not compile.
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) { //checked exception
            System.out.println("File not found!"); // handled
        }

    }
}
```

---