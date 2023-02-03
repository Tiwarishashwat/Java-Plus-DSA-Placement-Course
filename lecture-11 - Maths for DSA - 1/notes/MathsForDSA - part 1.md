# Maths For DSA

## Number System
### Any number of Base N means that it has digits from 0 to N-1
Example
Base 2 -> 0,1
Base 3 -> 0,1,2

Some special highlighted Bases are
Binary -> Base 2
Octal -> Base 8
Decimal -> Base 10
HexaDecimal -> Base 16
Note: HexaDecimal has given some special names in the form of Alphabets to 10, 11, 12, 13, 14 and 15.
HexaDecimal -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

### Conversion of a number from Any base to Decimal
Suppose you want to convert a number of base 'x' to Decimal(Base 10).
The approach is simple,
To convert a number of any base to decimal, follow these steps:

1. Identify the base of the number.
2. Write down the digits of the number.
3. For each digit, multiply by the base raised to the power of its position, starting from the rightmost digit with position 0.
4. Sum all the products obtained from step 3.

Example: Convert the number 1011 from base 2 to decimal

1. The base of the number is 2.
2. The digits of the number are 1, 0, 1, and 1.
For each digit:
a. The rightmost digit (1) is multiplied by 2^0 (1)
b. The next digit to the left (1) is multiplied by 2^1 (2)
c. The next digit to the left (0) is multiplied by 2^2 (0)
d. The leftmost digit (1) is multiplied by 2^3 (8)

Sum the products: 1 + 2 + 8 = 11.
Therefore, the decimal equivalent of the binary number 1011 is 11.


### Conversion of a number from Decimal to Any base
To convert a decimal number to any base, follow these steps:

1. Identify the desired base.
2. Divide the decimal number by the base, and take the integer quotient as the next digit to the left.
3. Repeat step 2 using the remainder obtained in step 2 as the new decimal number.
4. Repeat steps 2 and 3 until the quotient is 0.
5. The remainders obtained in step 3, read from bottom to top, represent the digits of the converted number.
Example: Convert the decimal number 11 to base 2

1. The desired base is 2.
2. Divide 11 by 2: 11 / 2 = 5 with a remainder of 1.
3. Divide 5 by 2: 5 / 2 = 2 with a remainder of 1.
4. Divide 2 by 2: 2 / 2 = 1 with a remainder of 0.
5. Divide 1 by 2: 1 / 2 = 0 with a remainder of 1.

The remainders obtained in step 3, read from bottom to top, are the digits of the converted number: 1011.
Therefore, the binary equivalent of the decimal number 11 is 1011.

## Check if a Number is even or odd.
To check if a number is even or odd, you can use the modulus operator % to determine the remainder when the number is divided by 2. If the remainder is 0, the number is even. If the remainder is 1, the number is odd.s

## Find power of a number
The power of a number says how many times to use the number in a multiplication. Powers are also called Exponents or Indices.
1. If the power is 1, then you just have the number itself. For example, 5^1 = 5
2. If the power is 0, then you get 1. For example, 5^0 = 1
3. Negative exponent means how many times to divide one by the number.
Example->
-> 5^3 = 5 * 5 * 5 = 125.

## Find power of a number using fast exponentiation
Binary exponentiation (also known as exponentiation by squaring or fast exponentiation) is a trick which allows to calculate a^n  using only O(log n)  multiplications.
The idea of binary exponentiation is as follows:
1. 2^7 = 2 * (2*2)^3
2. 4^3 = 4 * (4*4)^1
3. 16^1 = 16 * 1