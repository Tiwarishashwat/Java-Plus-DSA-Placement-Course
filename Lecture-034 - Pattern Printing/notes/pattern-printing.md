
# Pattern Printing for Beginners

> Learn the basics of problem-solving and logic building with simple pattern problems.

---

**Goal:** Not just to print stars, but to learn how to **analyze**, **break down problems**, and **build logic step-by-step**.

**Core Concepts Learned:**
- Loop control (for, while)
- Nested loops
- Conditionals
- Dry run and trace
- Problem deconstruction

---

### Intro to Pattern Printing

**What You Will Learn:**
- Why pattern printing is useful for logic building
- Types of patterns: shape-based, number-based, character-based
- How to trace loop execution

---

### Solid Patterns (Basics)

#### Square Pattern
```
*****
*****
*****
*****
```

```java
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- Looping basics
- Row vs column logic

---

#### Right-Angled Triangle
```
*
**
***
****
```

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- How inner loop depends on outer loop
- Incremental star printing

---

### Number and Character Patterns

#### Number Triangle
```
1
12
123
1234
```

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

**What You Will Learn:**
- Printing incremental numbers
- Understanding loop counters

---

#### Character Triangle
```
A
AB
ABC
```

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print((char)('A' + j));
    }
    System.out.println();
}
```

**What You Will Learn:**
- ASCII manipulation
- Type casting and characters

---

### Inverted and Mirrored Patterns

#### Inverted Triangle
```
****
***
**
*
```

```java
for (int i = 4; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- Reverse looping
- Decreasing pattern logic

---

#### Mirrored Triangle
```
   *
  **
 ***
****
```

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- Printing spaces
- Right-aligned logic

---

### Pyramid and Diamond Patterns

#### Centered Pyramid
```
   *
  ***
 *****
*******
```

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- Odd number pattern logic
- Symmetry and spacing

---

#### Diamond
```
   *
  ***
 *****
*******
 *****
  ***
   *
```

```java
int n = 4;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```

**What You Will Learn:**
- Merging logic from two loops
- Top and bottom symmetry

---

### Lecture 6: Advanced Number Patterns

#### Pascal’s Triangle (assignment)

#### Floyd’s Triangle
```
1
2 3
4 5 6
7 8 9 10
```

```java
int num = 1;
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}
```

**What You Will Learn:**
- Tracking a value across loops
- Pattern logic with increasing sequence

---

## Bonus Tips

- Try modifying one pattern into another
- Practice 2 patterns daily
- Compete in time-based challenges
