
# Maths for DSA – Part 2

## Armstrong Number

**Definition**: A number is Armstrong if the sum of its digits raised to the number of digits equals the number.

### Example:
153 → 1³ + 5³ + 3³ = 153

```java
boolean isArmstrong(int n) {
    int temp = n, sum = 0;
    int digits = (int)Math.log10(n) + 1;
    while(n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n /= 10;
    }
    return sum == temp;
}
```

---

## Palindrome Number

### Idea:
1. Reverse the number.
2. Compare it with the original.

```java
boolean isPalindrome(int n) {
    return n == reverse(n);
}
```

---

## Print All Divisors

```java
// Efficiently print all divisors of n using square root logic
void printDivisors(int n) {
    for(int i = 1; i <= Math.sqrt(n); i++) {
        if(n % i == 0) {
            System.out.print(i + " ");
            if(i != n/i) System.out.print(n/i + " ");
        }
    }
}
```

- Every divisor of a number n comes in a pair (i, n/i) — and one of the numbers in each pair is always ≤ √n
- If you check all numbers i from 1 to n, the naive way takes O(n) time.
- But if i divides n, then n/i is also a divisor. So instead of going till n, we only go till √n, and for each valid i, we print both i and n/i.

```
For example, for n = 36:
i = 2 → 36 % 2 == 0, so both 2 and 36/2 = 18 are divisors
i = 6 → 36 % 6 == 0, so both 6 and 6 are divisors (but same)
```

**Time Complexity**: O(√n)

---

## Check Prime
A prime number is a number greater than 1 that has no divisors other than 1 and itself.
We only loop till √n (i.e., i * i <= n) instead of looping till n-1 because:

If n has any divisor other than 1 and itself, one of them must be ≤ √n.

```java
// Check if a number is prime using 2 to √n
boolean isPrime(int n) {
    if(n <= 1) return false;
    for(int i = 2; i*i <= n; i++) {
        if(n % i == 0) return false;
    }
    return true;
}
```

---

## Sieve of Eratosthenes

**Goal**: Find all primes from 0 to n.

It's a super-efficient algorithm to find all prime numbers from 0 to n.
Instead of checking each number one by one, it marks all the non-prime (composite) numbers in a smart way.

How it works:
```
Initialize all numbers as prime:
We assume every number from 2 to n is prime (true).

Start from 2 (the first prime):

If prime[i] is true, it's a prime.

Then mark all multiples of i starting from i*i as false (not prime).
Why i*i? Because all smaller multiples (i*2, i*3, etc.) would’ve been marked already.

Repeat till i*i <= n.
```

Why i * i <= n?
```
Because for any number n, if it has a factor > √n, the corresponding pair is < √n, so it would’ve already been marked by earlier primes.

Example (n = 30):
Start with all true.

i = 2 → mark 4, 6, 8, ..., 30 as false

i = 3 → mark 9, 12, 15, ..., 30 as false

i = 4 → skip (already false)

i = 5 → mark 25, 30 as false

After the loop, the indices with true are your primes.
```

```java
boolean[] sieve(int n) {
    boolean[] prime = new boolean[n+1];
    Arrays.fill(prime, true);
    prime[0] = prime[1] = false;

    for(int i = 2; i*i <= n; i++) {
        if(prime[i]) {
            for(int j = i*i; j <= n; j += i)
                prime[j] = false;
        }
    }
    return prime;
}
```
**Time Complexity**: O(n log log n)

---

## GCD and LCM

### GCD: Euclidean Algorithm

The Greatest Common Divisor (GCD) of two numbers is the largest number that divides both without leaving a remainder.

Euclidean Algorithm Logic:
```
gcd(a, b) = gcd(b, a % b)
```

This works because the GCD of two numbers doesn’t change if the larger number is replaced by its remainder with the smaller number.

It keeps reducing the problem until b becomes 0.

At that point, a is the GCD.
```
gcd(48, 18)
→ gcd(18, 48 % 18) → gcd(18, 12)
→ gcd(12, 6)
→ gcd(6, 0) → return 6
```

Why is this true?
```
Because:
The remainder (a % b) is made using a and b
So, any number that divides a and b will also divide a % b
And vice versa
Thus, GCD doesn’t change — it just gets simpler!
```

```java
int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
```
**Time Complexity**: O(log(min(a, b)))

### LCM
The Least Common Multiple (LCM) of two numbers is the smallest number that is a multiple of both.
We use the relationship:
```
LCM(a, b) = (a * b) / GCD(a, b)
```

This is safe because:
```
The product a * b includes both shared and unique factors.
Dividing by the GCD removes the common part counted twice.
```

```java
int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}
```
**Note**: Always calculate GCD first.

---

## Modular Arithmetic

### Rules
- (a + b) % m = (a % m + b % m) % m
- (a - b) % m = (a % m - b % m + m) % m
- (a * b) % m = (a % m * b % m) % m

---

## Fast Modular Exponentiation

You want to calculate: a^b % mod

But directly multiplying a b times is very slow for large b.
So we use exponentiation by squaring — a smart trick to make it fast (O(log b)).

Instead of doing:
```
res = a * a * a * ... * a  (b times)
```

We break b into powers of 2 using its binary representation.
```
Let’s say: b = 13  → binary = 1101

a^13 = a^8 * a^4 * a^1
```
Only multiply the powers where the binary bit is 1.
6^13 mod 100

```java
int modPower(int a, int b, int mod) {
    int res = 1;
    a %= mod;
    while(b > 0) {
        if((b & 1) == 1) res = (res * a) % mod;  // if b is odd
        a = (a * a) % mod;
        b = b / 2
    }
    return res;
}
```
Let’s say: a = 3, b = 5, mod = 100

Binary of 5 = 101

```
Step 1: res = 1, a = 3
b = 5 → last bit = 1 → res = 1 × 3 = 3, then a = 3² = 9, b = 2

Step 2: b = 2 → last bit = 0 → skip multiply, a = 9² = 81, b = 1

Step 3: b = 1 → last bit = 1 → res = 3 × 81 = 243, b = 0

Final res = 243 % 100 = 43
So 3^5 % 100 = 43
```

**Time Complexity**: O(log b)

---

## Factorial
```
n! = n × (n-1) × (n-2) × ... × 2 × 1
```

```java
int fact(int n) {
    int res = 1;
    for(int i = 2; i <= n; i++) res *= i;
    return res;
}
```

---

## Trailing Zeros in Factorial

A trailing zero is a 0 at the end of a number.
Example:

100 has 2 trailing zeros

5040 (which is 7!) has 1 trailing zero

### Idea:
Only pair of 2 and 5 forms a trailing zero.
Since there are always more 2s than 5s in prime factors of a factorial, count number of 5s.

```java
int trailingZeros(int n) {
    int count = 0;
    for(int i = 5; n / i >= 1; i *= 5)
        count += n / i;
    return count;
}
```
**Time Complexity**: O(log₅n)

---

## Newton Raphson Square Root

Find the square root of a number x without using Math.sqrt()
We want to approximate the square root using math.

We want to solve this equation:
guess² = x

But instead of guessing randomly, we improve the guess step by step using:
newGuess = (guess + x / guess) / 2;

This formula moves your guess closer and closer to the real square root.
This is called the Newton-Raphson method, a powerful numerical technique for solving equations.

```java
double sqrt(double x) {
    double guess = x;
    double epsilon = 1e-6;
    while(Math.abs(guess * guess - x) > epsilon) {
        guess = (guess + x / guess) / 2;
    }
    return guess;
}
```

epsilon is a tiny number like 0.000001 — it defines how accurate your result should be.

**Explanation**: Uses iterative approximation. Each step gets closer to real sqrt.

```java
Example:
Suppose x = 9

Start with guess = 9

Step 1: (9 + 9 / 9)/2 = (9 + 1)/2 = 5.0

Step 2: (5 + 9 / 5)/2 = (5 + 1.8)/2 = 3.4

Step 3: (3.4 + 9 / 3.4)/2 ≈ 3.0235

...

After a few steps: ≈ 3.0000001 ✅ (very close to actual √9 = 3)
```

**Time Complexity**: O(log n)

---

## Ceil and Floor
These functions are used to round a decimal number either up or down to the nearest integer.
Math.ceil -> Returns the smallest integer that is greater than or equal to val. It rounds up.
Math.floor -> Returns the largest integer that is less than or equal to val. It rounds down.
```java
int ceil = (int)Math.ceil(val);
int floor = (int)Math.floor(val);
```

Both functions return a double, so we cast it to int to get an integer.
**Time Complexity**: O(1)

Question:
Can you calculate floor and ceil without using Math.ceil or Math.floor ?
---


