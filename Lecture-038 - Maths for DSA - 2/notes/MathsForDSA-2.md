# Maths for DSA – Part 2

## Armstrong Number

**Definition**: A number is Armstrong if the sum of its digits raised to the number of digits equals the number.

### Example:
153 → 1³ + 5³ + 3³ = 153

```java
    public boolean isArmstrong(int num){
        if(num<0) return false;
       int res =0;
       int copy = num;
       int digits = (int)Math.log10(num) + 1;
       while(num>0){
           int digit = num % 10;
           res = res + (int)Math.pow(digit,digits);
           num = num / 10;
       }
       return (copy == res);
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
    public void printDivisors(int num){
        int sqrt = (int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                System.out.print(i + " ");
                if(num/i != i){
                    System.out.print(num/i + " ");
                }
            }
        }
    }
```

- Every divisor of a number n comes in a pair (i, n/i) — and one of the numbers in each pair is always ≤ √n.
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
    public boolean isPrime(int num){
        if(num<2){
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
```

**Time Complexity**: O(√n)

---

## Sieve of Eratosthenes

**Goal**: Find all primes from 0 to n.

It's a super-efficient algorithm to find all prime numbers from 0 to n.  
Instead of checking each number one by one, it marks all the non-prime (composite) numbers in a smart way.

### How it works:
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
public void printPrimes(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(num);
//
        for(int i=2;i<=sqrt;i++){
            if(arr[i]){
                //num/i
                for(int j=i*i;j<=num;j=j+i){
                    arr[j] = false;
                }
            }
        }

        for(int i=2;i<=num;i++){
            if(arr[i]){
                System.out.print(i + " ");
            }
        }

    }
```
**Time Complexity**: O(n log log n)

---

## GCD and LCM

### GCD: Euclidean Algorithm

The Greatest Common Divisor (GCD) of two numbers is the largest number that divides both without leaving a remainder.

```java
    private int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
//        cases for handling zero:
        if(a==0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;

        int min = Math.min(a,b);
        int res=1;
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                res = i;
            }
        }
        return res;
    }
```

### Euclidean Algorithm Logic:
```
gcd(a, b) = gcd(a-b, b) // note a<=b
```

Efficient way is:

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
The remainder (a % b) is made using a and b.
So, any number that divides a and b will also divide a % b.
And vice versa.
Thus, GCD doesn’t change — it just gets simpler!
```

```java
    private int findGcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b>a){
            return findGcd(b,a);
        }
//        log(min(a,b))
        while(b>0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
```
**Time Complexity**: O(log(min(a, b)))

---

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

## Unique and All Prime Factors

### Find unique prime factors of a number
```java
    private ArrayList<Integer> findUniquePrimeFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                res.add(i);
                while(num%i==0){
                    num = num / i;
                }
            }
        }
        if(num>1){
            res.add(num);
        }
        return res;
    }
```

### Find all prime factors of a number
```java
    private ArrayList<Integer> findAllPrimeFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(num);i++){
            while(num%i==0){
                res.add(i);
                num = num / i;
            }
        }
        if(num>1){
            res.add(num);
        }
        return res;
    }
```

---

## Smallest Prime Factor (SPF)

Find all Smallest Prime Factors (SPF) till num.

```java
private ArrayList<Integer> findAllSPF(int num){
        ArrayList<Integer> res = new ArrayList<>();
        int prime[] = new int[num+1];
        for(int i=2;i<=num;i++){
            prime[i] = i;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(prime[i]==i){
                for(int j=i*i;j<=num;j=j+i){
                    if(prime[j] == j){
                        prime[j] = i;
                    }
                }
            }
        }
        for(int i=2;i<=num;i++){
            res.add(prime[i]);
        }
        return res;
    }
```

---

## Factorial of a Number

```
n! = n × (n-1) × (n-2) × ... × 2 × 1
```

```java
    private void printFactorial(int num){
        int res=1;
        for(int i=num;i>=2;i--){
            res = res * i;
        }
        System.out.println(res);
    }
```

**Time Complexity**: O(n)

---

## Trailing Zeros in Factorial

A trailing zero is a 0 at the end of a number.

### Examples:
- 100 has 2 trailing zeros  
- 5040 (which is 7!) has 1 trailing zero

### Idea:
Only a pair of 2 and 5 forms a trailing zero.  
Since there are always more 2s than 5s in prime factors of a factorial, count the number of 5s.

```java
    public int trailingZeroes(int n) {
        int res=0;
        int i=5;
        while(i<=n){
            res = res + n/i;
            i = i * 5;
        }
        return res;
    }
```
**Time Complexity**: O(log n)

---

## Modular Arithmetic

### Rules
- (a + b) % m = (a % m + b % m) % m
- (a - b) % m = (a % m - b % m + m) % m
- (a * b) % m = (a % m * b % m) % m

---

**Time Complexity** (for modular exponentiation): O(log b)

---

## Ceil and Floor

These functions are used to round a decimal number either up or down to the nearest integer.

- `Math.ceil` → Returns the smallest integer that is greater than or equal to val (rounds up).  
- `Math.floor` → Returns the largest integer that is less than or equal to val (rounds down).

```java
int ceil = (int)Math.ceil(val);
int floor = (int)Math.floor(val);
```

Both functions return a double, so we cast it to int to get an integer.

**Time Complexity**: O(1)

---

**Question:** Can you calculate floor and ceil without using Math.ceil or Math.floor?
