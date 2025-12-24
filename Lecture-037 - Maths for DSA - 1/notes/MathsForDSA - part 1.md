
# Maths for DSA Part 1 – Number Systems & Basics

---

## Count Digits

### Method 1: Using Log
```java
int count = (int)Math.log10(n) + 1;
```
**Explanation**: `log₁₀(n)` gives the number of digits minus 1.  
Works only on positive numbers.

- If `n > 0` → `(int)Math.log10(n) + 1`
- If `n == 0` → `1`
- If `n < 0` → take `-n` and apply formula

```java
public void findDigitsUsingFormula(int num){
    if(num == 0){
        System.out.println("Number of digits: " + 1);
        return;
    }
    if(num < 0){
        num = -num;
    }
    int res = (int)Math.log10(num) + 1;
    System.out.println("Number of digits: " + res);
}
```
**Time Complexity**: `O(1)`

---

### Method 2: Basic Loop
```java
public void findDigitsUsingDivision(int num){
    if(num == 0){
        System.out.println("Number of digits: " + 1);
        return;
    }
    if(num < 0){
        num = -num;
    }
    int res = 0;
    while (num > 0){
        num /= 10;
        res++;
    }
    System.out.println("Number of digits: " + res);
}
```
**Explanation**: Each division by `10` removes one digit.  
**Time Complexity**: `O(d)` where `d` is the number of digits (≈ `O(log₁₀ n)`).

---

## Forming Numbers using Digit Manipulation

### Append Digit at End
Example: `oldNum = 42`, `digit = 5` → `newNum = 42 * 10 + 5 = 425`
```java
int newNum = oldNum * 10 + digit;
```

```java
public void appendDigit(int num, int digit){
    boolean isNeg = false;
    if(num < 0){
        isNeg = true;
        num = -num;
    }
    int res = num * 10 + digit;
    if(isNeg){
        res = -res;
    }
    System.out.println("new number is: " + res);
}
```
**Time Complexity**: `O(1)`

---

### Insert Digit at Front
```java
int newNum = digit * (int)Math.pow(10, (int)Math.log10(oldNum) + 1) + oldNum;
```
Example: `oldNum = 23`, `digit = 4` → `newNum = 423`

```java
public void insertAtFront(int num, int digit){
    boolean isNeg = false;
    if(num < 0){
        num = -num;
        isNeg = true;
    }
    int digits = (num == 0) ? 1 : (int)Math.log10(num) + 1;
    int res = digit * (int)Math.pow(10, digits) + num;
    if(isNeg){
        res = -res;
    }
    System.out.println("New number is: " + res);
}
```
**Time Complexity**: `O(1)`

---

## Digit Extraction and Manipulation

### Extract & Reduce Digits
```java
while(num > 0) {
    int digit = num % 10;   // Extract last digit
    System.out.print(digit + " ");
    num /= 10;              // Remove last digit
}
```
Useful for:
1. Reversing a number  
2. Checking palindrome  
3. Summing digits  
4. Armstrong number

**Time Complexity**: `O(d)` where `d` is number of digits (≈ `O(log₁₀ n)`)

---

### Reverse a Number
```java
public void reverse(int num){
    if(num == 0){
        System.out.println("Reversed number is: 0");
        return;
    }
    int res = 0;
    boolean isNeg = false;
    if(num < 0){
        isNeg = true;
        num = -num;
    }
    while (num > 0){
        int d = num % 10;
        res = res * 10 + d;
        num /= 10;
    }
    if(isNeg){
        res = -res;
    }
    System.out.println("Reversed number is: " + res);
}
```
**Example**: `123` → `321`  
**Time Complexity**: `O(d)`

---

### Even or Odd Check
```java
boolean isEven(int n) {
    return (n % 2) == 0;
}
```
**Time Complexity**: `O(1)`

---

## Power of a Number

### Normal Method
```java
public void findPower(int a, int b){
    boolean isNeg = false;
    if(b < 0){
        b = -b;
        isNeg = true;
    }
    double res = 1;
    for(int i = 0; i < b; i++){
        res *= a;
    }
    if(isNeg){
        res = 1 / res;
    }
    System.out.println("power is: " + res);
}
```
**Time Complexity**: `O(b)`

---

### Fast Exponentiation (Binary Exponentiation)
```java
public void fastExponentiation(int a, int b){
    boolean isNeg = false;
    if(b < 0){
        isNeg = true;
        b = -b;
    }
    double res = 1.0;
    while (b > 0){
        if(b % 2 != 0){
            res *= a;
            b--;
        }
        b /= 2;
        a = a * a;
    }
    if(isNeg){
        res = 1 / res;
    }
    System.out.println("res is " + res);
}
```
**Time Complexity**: `O(log b)`

---

## Number Systems
**Definition**: Represents values using digits or symbols in a consistent manner (e.g., binary, decimal, hexadecimal).

Any number of Base N means that it has digits from 0 to N-1

Example: 
Base 2 -> 0,1 

Base 3 -> 0,1,2

Number Systems:
- Binary → Base 2  
- Octal → Base 8  
- Decimal → Base 10  
- Hexadecimal → Base 16 (digits 0–9, A–F)

---

## Base Conversions

### Any Base → Decimal
Steps:
1. Start from rightmost digit (position = 0).  
2. Multiply `digit × (base^position)`.  
3. Add to result.  
4. Increase position and repeat.

Example: `1011 (base 2)` → `11 (decimal)`

```java
    public void convertToDecimal(String input, int currentBase){
      int res=0;
      int pos=0;
      int len=input.length();
      for(int i=len-1;i>=0;i--){
          int digit = getDigit(input.charAt(i));
          res = res + digit * (int)Math.pow(currentBase,pos);
          pos++;
      }
      System.out.println("Converted number is: " + res);
    }

// helper to convert character digit to integer value
private int getDigit(char ch){
        switch (ch){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return ch-'0';
        }
    }
```
**Time Complexity**: `O(d)` where `d` is number of digits in the input (≈ `O(log_{base} n)`)

---

### Decimal → Any Base
Example: `11 (decimal)` → `1011 (binary)`

```java
    public void convertFromDecimal(int input, int destinationBase){
       StringBuilder res = new StringBuilder();
       while (input>0){
           int r = input % destinationBase;
           char ch = getChar(r);
           res.append(ch);
           input = input / destinationBase;
       }
        System.out.println("Converted number is: " + res.reverse());
    }

    private char getChar(int r){
        switch (r){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char)(r+'0');
        }
    }


```
**Time Complexity**: `O(d)` where `d` is number of digits in the destination base representation (≈ `O(log_{destinationBase} n)`)

---

## Conversion Summary

- Decimal → Binary → `O(d)` (where `d` ≈ `log₂ n`)  
- Decimal → Any Base → `O(d)` (where `d` ≈ `log_{base} n`)  
- Binary → Decimal → `O(d)`  
- Any Base → Decimal → `O(d)`

---

## Notes & Edge Cases
- For functions using `Math.log10(num)` ensure `num > 0`. Handle `0` and negative inputs explicitly.
- Conversions assume valid input characters for the given base (e.g., hex digits `0-9, A-F`). `getDigit` normalizes lowercase to uppercase.
- Time complexities are expressed in terms of number of digits `d` which is often `≈ log_{base}(n)`.

---
