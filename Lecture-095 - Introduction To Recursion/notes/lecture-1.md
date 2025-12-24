#  Recursion Series – Lecture 1: Introduction to Recursion

---

##  What is Recursion?

Recursion is a **method where a function calls itself** to solve a smaller instance of the same problem.

It works by:

1. Breaking a problem into smaller subproblems.
2. Solving the smaller subproblems recursively.
3. Combining their results to get the final answer.

---

##  Real-Life Analogy

Imagine standing in front of a mirror holding another mirror. You see infinite reflections — that’s **recursion in action**.

Or think of **Russian dolls** — each doll contains a smaller one inside, until the smallest one (base case) ends.

---

##  Structure of a Recursive Function

Every recursive function has two main parts:

1. **Base Case** → When to stop recursion
2. **Recursive Case** → The step where function calls itself

```java
void function() {
    // Base case
    if (condition) return;

    // Recursive case
    function();
}
```

Without a base case, the function will call itself infinitely → causing **StackOverflowError** in Java.

---

##  Example 1: Print Numbers 1 to N

```java
public class PrintNumbers {
    static void print(int n) {
        if (n == 0) return; // Base case
        print(n - 1);       // Recursive call
        System.out.print(n + " "); // Task after recursion
    }

    public static void main(String[] args) {
        print(5);
    }
}
```

###  Dry Run for n = 3

| Call Stack                                | Output |
| ----------------------------------------- | ------ |
| print(3) → print(2) → print(1) → print(0) |        |
| print(0) returns                          |        |
| print(1) prints "1"                       | 1      |
| print(2) prints "2"                       | 1 2    |
| print(3) prints "3"                       | 1 2 3  |

**Output:** `1 2 3`

This is a **top-down recursion** (first go deep, then print while returning).

---

##  Example 2: Print Numbers N to 1

```java
public class PrintNumbersRev {
    static void printRev(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printRev(n - 1);
    }

    public static void main(String[] args) {
        printRev(5);
    }
}
```

**Output:** `5 4 3 2 1`

Here, the task is done **before** the recursive call → **bottom-up recursion**.

---

##  Example 3: Factorial of N

**Definition:**
`factorial(n) = n * factorial(n - 1)`
with base case `factorial(0) = 1`.

```java
public class Factorial {
    static int fact(int n) {
        if (n == 0) return 1;  // Base case
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
```

**Dry Run (n = 3):**

```
fact(3)
→ 3 * fact(2)
→ 3 * (2 * fact(1))
→ 3 * (2 * (1 * fact(0)))
→ 3 * (2 * (1 * 1))
= 6
```

**Output:** `120`

---

##  Example 4: Fibonacci Series

**Definition:**
`fib(n) = fib(n-1) + fib(n-2)`
with base cases `fib(0)=0, fib(1)=1`.

```java
public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            System.out.print(fib(i) + " ");
    }
}
```

**Output:** `0 1 1 2 3 5 8`

---

##  Time & Space Complexity

| Example      | Time Complexity | Space Complexity | Reason                       |
| ------------ | --------------- | ---------------- | ---------------------------- |
| Print 1 to N | O(n)            | O(n)             | One recursive call per level |
| Factorial    | O(n)            | O(n)             | Linear recursion             |
| Fibonacci    | O(2ⁿ)           | O(n)             | Two calls at each level      |

>  Tip: Count number of recursive calls → it usually equals the time complexity.

---

##  Common Mistakes

1. **Missing Base Case**

   * Leads to infinite recursion → StackOverflowError.

2. **Wrong Return Statement**

   * If you forget `return` in `return n * fact(n-1)`, result will be wrong.

3. **Changing State Before Base Case**

   * Leads to incorrect recursion flow.

---

##  Key Points to Remember

* Every recursion must move toward the base case.
* Recursion uses **call stack memory**.
* Trace recursion by imagining **“who called me”**.
* Time complexity depends on **number of calls**.
* Many algorithms (Backtracking, DP, Divide & Conquer) are built on recursion.

---

##  Practice Questions

1. Print numbers from N to 1 and 1 to N
2. Factorial of N
3. Sum of first N natural numbers
4. Fibonacci sequence
5. Count number of function calls in Fibonacci (for understanding complexity)

---