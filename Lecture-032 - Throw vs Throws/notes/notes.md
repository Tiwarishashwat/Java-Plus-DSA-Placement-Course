###  throw Keyword
Used to explicitly throw an exception.
```java
public class ThrowDemo {
    public static void main(String[] args) {
        int age = 15;

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // method that may throw exception
    public static void checkAge(int age) {
        if (age < 18) {
            // explicitly throwing exception
            throw new ArithmeticException("Age must be 18 or above!");
        } else {
            System.out.println("You are allowed to vote!");
        }
    }
}

```

###  throws Keyword
Used in method signature to declare exceptions.
```java
import java.io.*;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile();   // must handle IOException here
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // method declares it might throw IOException
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // may throw FileNotFoundException
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}

```

# `throw` vs `throws` in Java

## Quick Comparison Table

| Feature           | `throw` | `throws` |
|-------------------|---------|----------|
| **Usage**         | Inside method/block | In method signature |
| **Purpose**       | Actually *throws* an exception | Declares potential exceptions (warning to caller) |
| **Followed by**   | An exception **object** | One or more exception **classes** |
| **Count**         | Can throw only **one** object at a time | Can declare **multiple** exception classes |
| **Compiler Check**| No compile-time enforcement (just throws) | Compiler enforces handling of checked exceptions |
| **Example**       | `throw new NullPointerException();` | `void readFile() throws IOException, SQLException` |

---

## Key Points
- **`throw`** = Action → actually throws an exception object.  
- **`throws`** = Declaration → warns/declares that a method *may* throw certain exceptions.  
- For **checked exceptions**: Compiler forces you to either handle with try-catch or declare with `throws`.  
- For **unchecked exceptions** (subclasses of RuntimeException): `throws` is optional (compiler doesn’t enforce).  


---
