
# Lecture: Time & Space Complexity for Coding Interviews

## What You Will Learn
- What algorithm complexity means in real-world terms  
- How time and space complexity affect performance  
- Practical Big-O notations and how to read them  
- Techniques to calculate complexity in real code  
- Optimization insights often asked in interviews  

---

## 1. What is Algorithm Complexity?

**Definition:**  
Algorithm complexity refers to the **amount of resources** (time, space) an algorithm consumes as the input size grows.

**How do we know if code is good enough or not?**  
We measure code quality using **time** and **space complexity**. The better the algorithm, the **lesser** time and space it will require.

**Example:**  
- Linear Search → O(N)
- Binary Search → O(log N)

If `n = 10⁴`, then:
- Linear Search takes 10,000 operations  
- Binary Search takes around 13 operations  

Now you can see why time complexity is so important!

---

## 2. Time Complexity

**Time Complexity** is the rate at which execution time increases with input size.

**Important Notes:**
- It has no real-world time unit like seconds.
- Two machines might give different runtimes for the same code, hence we use **Asymptotic Notation**.

### Rules for analyzing time complexity:
1. Always analyze **worst-case** scenario.
2. **Ignore constants** (e.g., O(2n) → O(n)).
3. **Drop low-order terms** (e.g., O(n² + n) → O(n²)).
4. In general, OuterLoop × InnerLoop = Total Complexity
5. If input is divided, use logs:
   - Divided by 2 → log base 2 → O(log₂n)
   - Divided by 3 → log base 3 → O(log₃n)
6. Function calls: Analyze each function's complexity individually and include them where they're called.
7. Conditions and branches (`if/else`): Consider the **branch with higher complexity** for worst-case.
8. Loops depending on input values (e.g., `while(i < n)` with `i *= 2`) → Usually log-based complexities.


---

## 3. Space Complexity

**Space Complexity** = Input + Auxiliary Space

Auxiliary space is the **extra** memory used by the algorithm.

💡 **Tips:**
- Do **not** modify the input unless allowed.
- If modified, revert it before the function ends.
- Avoid unnecessary extra space to avoid rejections.

---

## 4. Big-O Cheat Sheet

| Name         | Big-O     | Example                  |
|--------------|-----------|--------------------------|
| Constant     | O(1)      | Accessing array element  |
| Logarithmic  | O(log n)  | Binary Search            |
| Linear       | O(n)      | Single loop              |
| Linearithmic | O(n log n)| Merge/Quick Sort (avg)   |
| Quadratic    | O(n²)     | Nested loops             |
| Cubic        | O(n³)     | Triple nested loops      |
| Exponential  | O(2ⁿ)     | Recursive Fibonacci      |
| Factorial    | O(n!)     | Generating permutations  |

📎 **Reference:** https://www.bigocheatsheet.com/

---

## 5. Asymptotic Notations

Since we can’t express exact complexity, we use **asymptotic notation** (means: approaching a value).

| Notation  | Meaning                    |
|-----------|----------------------------|
| **O**     | Upper bound (worst-case)   |
| **Ω**     | Lower bound (best-case)    |
| **Θ**     | Average case (tight bound) |

---

## 6. How to Calculate Time Complexity

### Step-by-step:
1. Count operations inside loops
2. Consider nested vs sequential loops
3. Include recursion/method calls
4. Apply rules for simplification

### Examples:

```java
// O(n)
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

```java
// O(n)
for (int i = n-1; i >= 0; i++) {
    System.out.println(i);
}
```

```java
// O(n) [n/5 -> n //avoid constant]
for (int i = 0; i < n; i+=5) {
    System.out.println(i);
}
```

```java
// O(n^2)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```

```java
// O(n*m)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.println(i + j);
    }
}
```

```java
// O(n^2) [sum of n natural number, n*(n+1)/2 -> n^2/2 + n/2 -> n^2 + n (after removing constants) -> n^2 (after removing high power polynomial)]
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        System.out.println(i + j);
    }
}
```

```java
// O(log n base 2)
for (int i = 0; i < n; i*=2) {
    System.out.println(i);
}
```

```java
// O(log n base 2)
for (int i = n; i >= 1; i/=2) {
    System.out.println(i);
}
```

```java
// O(sqRoot N)
for (int i = 1; i*i < n; i++) {
    System.out.println(i);
}
```

```java
// O(log log n base 2)
for (int i = 1; i < n; i*=2) {
    System.out.println(i);
}

for (int j = 1; j < k; j*=2) {
    System.out.println(j);
}
```


```java
// O(log n base 2) [input is reduced to half]
int binarySearch(int[] arr, int x) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
        int m = (l + r) / 2;
        if (arr[m] == x)
            return m;
        else if (arr[m] < x)
            l = m + 1;
        else
            r = m - 1;
    }
    return -1;
}
```

```java
// O(n + m)
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < m; j++) {
    System.out.println(j);
}
```

```java
// O(n) [2n -> n //avoid constant]
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```

---

### Optimization Tricks:
- Avoid nested loops
- Use Hashing for faster lookup
- Replace recursion with iteration if deep
- Use prefix sums, two pointers, or sliding windows
- Use binary search for sorted input

---

## Interview Tips

- Clarify input size (n)
- Start with brute force, then optimize
- Always mention time & space trade-offs
- Practice dry runs and complexity estimation

---
