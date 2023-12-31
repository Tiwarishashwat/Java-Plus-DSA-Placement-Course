# MSB and LSB
1. MSB is left most bit and in case of signed numbers they will denote sign.
-> 0 is positive
-> 1 is negative
2. LSB is the right most bit.
3. Range of signed numbers is [-(2^n-1)+1 , (2^n-1)-1]
4. Range of unsigned numbers is [0, (2^n)-1] 

# Bit Addition
1. 1 + 1 is 10
2. 1 + 1 + 1 is 11 
Note: when any bit exceeds the limit, it is discarded. 

# Bit Subtraction
1. Subtraction is not done directly,
2. We first find the 2's complement, and add the 2's complement into the number.
3. Subtract num1 - num2,
4. find 2's complement of num2. (Reverse the bits and add 1)
5. Add num1 and 'num2, where 'num2 is 2's complement of num2.

# Bitwise Operators
1. Bitwise 'AND' (&) -> AND of two bits is '1' if and only if both bits are '1'.
Note -> when you 'AND' any number with '1', the res is same as the number.

2. Bitwise 'OR' (|) -> OR of two bits is '1' if atleast any one of the two bits is '1'.

3. Bitwise 'XOR' (^) ->  XOR of two bits is '1' if and only if any one of the bit is '1'.
Note -> when you 'XOR' any number with '1', the res is complement the number.
when you 'XOR' any number with '0', the res is same as the number.

4. Left shift operators (<<) ->
1. It will shift the bits of number to the left and add zeros in the end.
ex - 
10110 << 2 will be 1011000
Note that we shifted each bit by 2 places and added same number of zeros in the end.
Observation -> a << b will be a*2^b

5. Right shift operators (>>) ->
1. It will shift the bits of number to the right.
ex - 
10110 >> 2 will be 101
Observation -> a >> b will be a/2^b

6. Bitwise Not Operator (~) ->
1. It will invert all the bits, that is change 0 to 1 or 1 to 0.
ex -
~(1011100) -> (0100011)































## find even and odd numbers!
if num1 & 1 is 0 then number is odd otherwise it is even


# Bit Manipulation Questions
1. Base changing method
Observation on Bits.
Base 2 -> 
1. (10)₂ = (2)₁₀
2. (100)₂ = (4)₁₀
3. (1000)₂ = (8)₁₀

As you can observe the above decimal numbers are power of 2.
lets observe a pattern on Base 3 ->
1. (10)₃ = (3)₁₀
2. (100)₃ = (9)₁₀
3. (1000)₃ = (27)₁₀

As you can observe the above decimal numbers are power of 3.

So, we can conclude that,
A number x is a power of y when (x)ᵧ has '1' at the left most bit and
remaining all '0'
