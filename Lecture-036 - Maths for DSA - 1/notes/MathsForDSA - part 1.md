## Maths for DSA Part 1 – Number Systems & Basics

---

### Even or Odd Check
if a number is even then it is divisible by 2.
```java
boolean isEven(int n) {
    return (n % 2) == 0;
}
```
**Time Complexity**: O(1)

---

### Digit Extraction and Manipulation

#### Extract & Reduce Digits
To process each digit of a number (from last to first), we use:

% 10 to extract the last digit.
/ 10 to remove the last digit.

```java
while(num > 0) {
    int digit = num % 10;  // Extract last digit
    System.out.print(digit + " ")
    num /= 10; // Remove last digit
}
```
This is useful for problems like:

1. Reversing a number

2. Checking for palindrome

3. Summing digits

4. Armstrong number

**Time Complexity**: O(log₁₀n)

#### Form number by appending digit at end
To add a digit at the end (right side) of a number.
For example:
If oldNum = 42 and digit = 5, then
newNum = 42 * 10 + 5 = 425

This is often used in building numbers from digit arrays or reversing digits.

```java
int newNum = oldNum * 10 + digit;
```

#### Form number by adding digit at front
To add a digit at the front (left side) of a number.

```java
int newNum = digit * (int)Math.pow(10, (int)Math.log10(oldNum)+1) + oldNum;
```

Explanation:

Math.log10(oldNum) gives the number of digits minus one.

So we calculate 10^(number of digits) to shift the old number.

Then we add the digit at the front.

```java
oldNum = 23, digit = 4
newNum = 4 * 100 + 23 = 423
```

## Count Digits

### Method 1: Basic Loop
```java
// Count digits by dividing the number by 10 until it becomes 0
int countDigits(int n) {
    int count = 0;
    while(n > 0) {
        count++;
        n /= 10;
    }
    return count;
}
```
**Explanation**: Each division by 10 reduces one digit. This runs in O(log₁₀n) time.

### Method 2: Using Log
```java
int count = (int)Math.log10(n) + 1;
```
**Explanation**: log₁₀(n) gives the number of digits minus 1.

---

---
### Reverse a Number
Reversing a number means rearranging its digits in the opposite order. For example, reversing 1234 gives 4321.
We extract digits from the end of the number one by one using % 10, and build the reversed number by multiplying the result by 10 and adding the extracted digit.

```java
int reverse(int n) {
    int rev = 0;
    while(n > 0) {
        rev = rev * 10 + n % 10; // Add last digit to reversed number
        n /= 10; // Remove last digit from original number
    }
    return rev;
}
```
Example:
Let’s reverse 123:

Step	n	rev
1	123	0×10 + 3 = 3
2	12	3×10 + 2 = 32
3	1	32×10 + 1 = 321

Final result: 321

**Time Complexity**: O(log₁₀n)

---

### Number System
**Definition**: Represents values using digits or symbols in a consistent manner (e.g., binary, decimal, hexadecimal).

Any number of Base N means that it has digits from 0 to N-1
Example Base 2 -> 0,1 Base 3 -> 0,1,2

Some special highlighted Bases are 
Binary -> Base 2 
Octal -> Base 8 
Decimal -> Base 10 
HexaDecimal -> Base 16 
Note: HexaDecimal has given some special names in the form of Alphabets to 10, 11, 12, 13, 14 and 15. HexaDecimal -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

---

### Conversion of Number System
Convert numbers between different bases.

#### Any Base to Decimal

Suppose you want to convert a number of base 'x' to Decimal(Base 10). The approach is simple, To convert a number of any base to decimal, follow these steps:

Identify the base of the number.
Write down the digits of the number.
For each digit, multiply by the base raised to the power of its position, starting from the rightmost digit with position 0.
Sum all the products obtained from step 3.
Example: Convert the number 1011 from base 2 to decimal

The base of the number is 2.
The digits of the number are 1, 0, 1, and 1. For each digit: a. The rightmost digit (1) is multiplied by 2^0 (1) b. The next digit to the left (1) is multiplied by 2^1 (2) c. The next digit to the left (0) is multiplied by 2^2 (0) d. The leftmost digit (1) is multiplied by 2^3 (8)
Sum the products: 1 + 2 + 8 = 11. Therefore, the decimal equivalent of the binary number 1011 is 11.

```java
int convertToDecimal(int num, int base) {
    int res = 0, pow = 1;
    while(num > 0) {
        res += (num % 10) * pow;
        num /= 10;
        pow *= base;
    }
    return res;
}
```
**Time Complexity**: O(log₁₀n)

#### Decimal to Any Base
To convert a decimal number to any base, follow these steps:

Identify the desired base.

Divide the decimal number by the base, and take the integer quotient as the next digit to the left.

Repeat step 2 using the remainder obtained in step 2 as the new decimal number.

Repeat steps 2 and 3 until the quotient is 0.

The remainders obtained in step 3, read from bottom to top, represent the digits of the converted number. Example: Convert the decimal number 11 to base 2

The desired base is 2.

Divide 11 by 2: 11 / 2 = 5 with a remainder of 1.

Divide 5 by 2: 5 / 2 = 2 with a remainder of 1.

Divide 2 by 2: 2 / 2 = 1 with a remainder of 0.

Divide 1 by 2: 1 / 2 = 0 with a remainder of 1.

The remainders obtained in step 3, read from bottom to top, are the digits of the converted number: 1011. Therefore, the binary equivalent of the decimal number 11 is 1011.


```java
String convertFromDecimal(int num, int base) {
    StringBuilder sb = new StringBuilder();
    while(num > 0) {
        sb.append(num % base);
        num /= base;
    }
    return sb.reverse().toString();
}
```
**Time Complexity**: O(logₙ base)

---

### Conversion Code Snippets

- Decimal to Binary – O(log₂n)
- Decimal to Any Base – O(logₙ base)
- Binary to Decimal – O(log₁₀n)
- Any Base to Decimal – O(log₁₀n)

---

### Power of a Number (Normal)
```java
int power(int a, int b) {
    int res = 1;
    for(int i = 0; i < b; i++) res *= a;
    return res;
}
```
**Time Complexity**: O(b)

---

### Fast Exponentiation
Fast exponentiation (also called binary exponentiation) is a technique to calculate powers quickly — like calculating a^b — in O(log b) time instead of O(b).

Why is it fast?
It reduces the number of multiplications by dividing the exponent by 2 at each step (like how binary numbers work). Here's the idea:

Instead of:

```java
a^8 = a * a * a * a * a * a * a * a   → 8 multiplications
```
Do:

```java
a^8 = ((a^2)^2)^2                     → Only 3 multiplications!
```

How does it work?
Use these rules:

If b is even, then a^b = (a^2)^(b/2)

If b is odd, then a^b = a * (a^2)^(b/2)

You keep squaring the base and halving the exponent. If exponent is odd, multiply result with current base.


```java
int fastPower(int a, int b) {
    int res = 1;
    while(b > 0) {
        if((b & 1) == 1) res *= a;
        a *= a;
        b = b/2;
    }
    return res;
}
```
**Time Complexity**: O(log b)

---



