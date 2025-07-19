
# ✳️ Exception Handling in Java – Quick Revision Notes

## ✅ What is an Exception?
- An **exception** is an event that disrupts the normal flow of program execution (e.g., divide by zero, null access, invalid file).
- **Exceptions can be handled** using try-catch blocks.

## ❌ What is an Error?
- Errors are **serious issues** like `OutOfMemoryError`, `StackOverflowError`, etc.
- They are **not meant to be caught or handled** in code.

> 🔹 Both `Exception` and `Error` inherit from the `Throwable` class.

---

## 🔰 Types of Exceptions

### 1. **Built-in Exceptions**

#### a) Checked Exceptions (Compile-time)
Handled during compilation. Must be either **caught** or **declared** with `throws`.

- `IOException`
- `SQLException`
- `FileNotFoundException`
- `ClassNotFoundException`

#### b) Unchecked Exceptions (Runtime)
Checked during runtime. **No compiler enforcement** to handle.

- `ArithmeticException`
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `ClassCastException`
- `IllegalArgumentException`

> 🔹 All unchecked exceptions are subclasses of `RuntimeException`.

---

### 2. **User-Defined Exceptions**
Custom exceptions created by extending `Exception` or `RuntimeException`.

```java
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
```

---

## 🔄 Exception Handling Keywords

### ✅ try-catch Block
```java
try {
    // risky code
} catch (ExceptionType e) {
    // handle exception
}
```

### 🔚 finally Block
Always executes (even if exception is not thrown or caught). Used for cleanup.

```java
try {
    // code
} catch (Exception e) {
    // handling
} finally {
    // cleanup
}
```

### 🚀 throw Keyword
Used to explicitly throw an exception.
```java
throw new IllegalArgumentException("Invalid input");
```

### 📝 throws Keyword
Used in method signature to declare exceptions.
```java
public void readFile() throws IOException, SQLException {
    // code
}
```

---

## 🆕 Java 7+ Enhancements

### 🔁 Multi-Catch Block
```java
try {
    // code
} catch (IOException | SQLException ex) {
    // handle multiple types
}
```

### 🔐 try-with-resources
Auto-close resources like files, DB connections, etc.
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // auto-closed
} catch (IOException e) {
    // handle
}
```

---

## 🆚 Exception vs Error vs RuntimeException

| Type              | Inherits   | Meant to be Handled? | Checked? |
|-------------------|------------|-----------------------|----------|
| Error              | Throwable | ❌ No                 | ❌ No     |
| Exception          | Throwable | ✅ Yes                | ✅ Yes (except RuntimeException) |
| RuntimeException   | Exception | ✅ Yes                | ❌ No     |
