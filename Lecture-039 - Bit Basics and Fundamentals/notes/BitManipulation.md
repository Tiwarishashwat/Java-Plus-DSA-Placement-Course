# Lecture 1 -- Bit Manipulation Basics + Fundamentals

Welcome to the first lecture on **Bit Manipulation**. In this session,
we will start from the very basics of how computers store numbers in
binary form, understand bitwise operators, and learn some fundamental
tricks.

------------------------------------------------------------------------

## 1. Binary Representation of Numbers

Every integer in a computer is stored as a sequence of **0s and 1s
(binary)**.

-   Example:
    -   `5 → 101 (in binary)`
    -   `10 → 1010 (in binary)`

The position of each bit represents a power of 2.

For example:

    5 = 1×2² + 0×2¹ + 1×2⁰ = 4 + 1 = 5

In binary system, the right most bit is called LSB (Least Significant Bit) and the left most bit is called MSB (Most Significant Bit).

In binary system, the sign of a number is represented by MSB(Most significant bit).

If MSB -> 0 then number is positive
If MSB -> 1 then number is negative

-   Example:
    -   `"00...001010" is a positive number`
    -   `"10...001010" is a negative number`

### How is negative number stored?
-   Negative numbers are stored in **2's complement form**.
-   2's complement = 1's complement + 1;
-   1's complement = ~x (flip bits of x)
-   So in short how is -x stored? `-x = ~x + 1`

#### (a) One's Complement
- One’s complement of a number is simply flipping all its bits.
- In Java, the operator ~ works as bitwise NOT, which actually gives two’s complement result (i.e., -(n+1)).

- Example:
```java
int x = 5;       // 000...0101  
int ones = ~x;   // 111...1010 → -6 (two’s complement form)  
System.out.println(ones);

```
- Note: In Java, because integers are signed, ~x effectively represents the negative number.

#### (b) Two's Complement

-   Negative numbers are stored in **2's complement form**.
-   `-x = ~x + 1`

-   Example with 5 and -5 (using 8 bits for clarity):
    -   `+5 = 00000101`  
    -   `~5 = 11111010`   (One’s complement)  
    -   `+1 = 00000001`  
    -   `-5 = 11111011`   (Two’s complement) 

So:

00000101 → +5

11111011 → -5

### (c) Range of Integers

-   Java `int` = **32 bits**\
-   Largest number
    - "01....111111" (32 bits) => `2^31 - 1`
-   Smallest number
    - "10....000000" (32 bits) => convert to 2's complement => "01....111111" + 1 => "10....000000" => `-2^31`
-   Range = `-2^31` to `2^31 - 1`

Range of int = -2^31 to 2^31-1

------------------------------------------------------------------------

## 2. Bitwise Operators

Java provides special operators to work directly at the **bit level**.

### (a) AND `&`

- Returns `1` only if both bits are `1`.

| A | B | A & B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |

```java
System.out.println(5 & 3); // 101 & 011 = 001 → 1
```

---

### (b) OR `|`

- Returns `1` if at least one bit is `1`.

| A | B | A \| B |
|---|---|--------|
| 0 | 0 |   0    |
| 0 | 1 |   1    |
| 1 | 0 |   1    |
| 1 | 1 |   1    |

```java
System.out.println(5 | 3); // 101 | 011 = 111 → 7
```

---

### (c) XOR `^`

- Returns `1` if the two bits are different.

| A | B | A ^ B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   0   |

```java
System.out.println(5 ^ 3); // 101 ^ 011 = 110 → 6
```

---

### (d) NOT `~`

- Flips all bits (works in 2's complement form).

| A | ~A |
|---|----|
| 0 |  1 |
| 1 |  0 |

```java
System.out.println(~5); // -(5+1) = -6
```

direct formula: ~n = -(n+1)

---

### (e) Left Shift `<<`

-   Shifts bits left (equivalent to multiplying by 2 each shift).

``` java
System.out.println(5 << 1); // 10
```
formula: n << k = n*2^k

### (f) Right Shift `>>`

-   Shifts bits right (divides by 2 for each shift).

``` java
System.out.println(10 >> 1); // 5
```
formula: n >> k = n/(2^k)

This works only for positive numbers. For negative numbers, sign bit handling changes the result.

### (g) Unsigned Right Shift `>>>`

-   Similar to `>>`, but fills with `0` even for negative numbers. This is why `>>>` can make negative numbers appear as very large positive numbers.


### Difference Between >> and >>>

#### Right Shift >> (Arithmetic Shift)

- Preserves the sign bit (leftmost bit).

- Negative numbers remain negative after shifting.

Example:
```java
System.out.println(-10 >> 1); // -5
```

#### Unsigned Right Shift >>> (Logical Shift)

- Always fills 0 on the left, regardless of sign.

- Can turn a negative number into a large positive number.

Example:
```java
System.out.println(-10 >>> 1); // 2147483643
```

- Use >> when you want to preserve sign (typical division).
- Use >>> when you want raw bit shifting without caring about sign.

------------------------------------------------------------------------

## 3. Fundamental Concepts

### (a) Check Odd/Even

-   A number is **odd** if its last bit is `1`, otherwise **even**.

``` java
    public boolean isEven(int num){
        return (num & 1)==0;
    }
```

### (b) Swap Two Numbers using XOR

Without a temporary variable!

``` java
public void swap(int a, int b){
        System.out.println("Before swap a: " + a + " b:" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap a: " + a + " b:" + b);
    }
```


------------------------------------------------------------------------

## Summary of Lecture 1

-   Learned binary representation.\
-   Understood bitwise operators (`&, |, ^, ~, <<, >>, >>>`).\
-   Covered fundamental tricks: odd/even check, XOR swap, two's
    complement, integer range.

In the next lecture, we will explore **useful tricks** with bits like
counting set bits, checking power of 2, and more.
