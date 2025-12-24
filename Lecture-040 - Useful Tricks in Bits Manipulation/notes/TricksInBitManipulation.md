# Lecture 2 -- Useful Tricks in Bit Manipulation

Welcome back! In this lecture, we will go beyond the basics and learn
**useful tricks** with bits.\
These tricks form the building blocks of many interview problems.

------------------------------------------------------------------------

## 1. Check if k-th Bit is Set

We can check if the k-th bit (0-indexed from right) is `1` or not.

``` java
private boolean checkSetBit(int num, int k){
        return ((1<<k) & num) != 0;
    }
```

Example:

    n = 5 (binary 101)
    Check 2nd bit (k=2):
    5 & (1<<2) = 101 & 100 = 100 → not zero → bit is set

------------------------------------------------------------------------

## 2. Set / Unset / Toggle a Bit

-   **Set a Bit (make it 1)**

``` java
 private int setBit(int num, int k){
        return (1<<k | num);
    }
```

-   **Unset a Bit (make it 0)**

``` java
 private int unsetBit(int num, int k){
        return (~(1<<k) & num);
    }
```

-   **Toggle a Bit (flip 0→1 or 1→0)**

``` java
    private int toggleBit(int num, int k){
        return ((1<<k) ^ num);
    }
```

------------------------------------------------------------------------

## 3. Count Set Bits

How many 1s are present in the binary form of a number?

### Method 1: Built-in

``` java
int count = Integer.bitCount(n);
```

### Method 2: Brian Kernighan's Algorithm

``` java
    private int countBitsUsingBrianAlgo(int num){
        if(num<0){
            num = (~num + 1);
        }
        int count=0;
        while(num>0){
            num = num & num-1;
            count++;
        }
        return count;
    }
```

This runs in O(number of set bits), faster than checking all 32
positions.

------------------------------------------------------------------------

## 4. Rightmost Set Bit

To isolate the lowest set bit:

``` java
private int rightMostSetBit(int num){
        return (num & -num);
    }
```

Example:

    n = 12 (1100)
    n & -n = 4 (0100)


------------------------------------------------------------------------
## 5. Check if Number is Power of 2

A power of 2 has only **one set bit**.

``` java
    private boolean isPowerOfTwo(int num){
        return ((num & num -1)==0);
    }
```

Example:\
- 8 → 1000 → Yes\
- 10 → 1010 → No

follow up question, check if a number is a power of 2, consider 1 is not a power of 2.

``` java
    private boolean isPowerOfTwo(int num){
        //odd num - > X -- following
        if((num & 1)!=0){ // return false if number is 1 / odd
            return false;
        }
        return ((num & num -1)==0);
    }
```

------------------------------------------------------------------------

## 6. Character Case Conversion using Bits

Uppercase to Lowercase → set the 5th bit (add 32).

```java
 private char toLower(char ch){ //ch → A → 65 → 1000001
        return (char)(ch | (1<<5)); //1100001 → a
    }

```

Lowercase to Uppercase → unset the 5th bit (remove 32).

```java
 private char toUpper(char ch){ //ch → a → 97 → 1100001
        return (char)(ch & ~(1<<5));  //1000001 → A
    }

```

Toggle Case → flip the 5th bit.

```java
    private char toggleCase(char ch){ //ch → A → 65 → 1000001
        return (char)(ch ^ (1<<5)); //1100001 → a
    }

```

### Using ' ' (space) and '_' (underscore)

- ASCII values:

- ' ' (space) = 32 = 00100000

- '_' (underscore) = 95 = 01011111

These can be used as bit masks for quick conversions:

Convert Uppercase → Lowercase (OR with space)

```java
  private char toLowerSpecial(char ch){
        return (char)(ch | ' ');
    }

```

Convert Lowercase → Uppercase (AND with underscore)
```java
    private char toUpperSpecial(char ch){
        return (char)(ch & '_');
    }

```

Toggle Case (XOR with space)
```java
private char toggleSpecialCase(char ch){
        return (char)(ch ^ ' ');
    }

```

------------------------------------------------------------------------

## Summary of Lecture 2

-   Learned how to check, set, unset, and toggle a bit.\
-   Efficient methods to **count set bits**.\
-   Tricks like **power of 2 check**, **rightmost set bit**, and
    **clearing last set bit**.\
-   Understood the powerful **properties of XOR**.

In the next lecture, we will use these tricks to solve **standard
interview problems** including unique numbers and generating all
subsets.
