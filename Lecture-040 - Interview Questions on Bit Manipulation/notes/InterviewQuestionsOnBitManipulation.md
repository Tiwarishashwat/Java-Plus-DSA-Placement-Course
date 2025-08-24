Questions->
1. Clear till ith bit from LSB
-> num & ~((1 << i+1) - 1)

2. Clear till ith bit from MSB
-> num & ((1 << i+1) - 1)

3. Convert upper case to lower case (set the 5th bit)
-> a = 'A' | (1<<5)
-> COOL Tarika -> a = 'A' | ' '

4. Convert lower case to upper case (unset the 5th bit)
-> A = 'a' & ~(1<<5)
-> COOL Tarika -> A = 'a' & '_'

5. Swap two numbers using xor
-> num1 and num2.
-> num1 = num1 ^ num2
-> num2 = num1 ^ num2
-> num1 = num1 ^ num2

6. Find the only unique element in an array when all other elements are repeated twice.
-> XOR the whole array, remaining will be the result.
why?
ex - [2,5,6,7,5,2,1,6]
do an xor of the whole array and we know that,
-> xor of same number is 0.
-> xor of any number with 0 is the number itself.
-> so duplicates will cancel out and become 0, 
-> finally xor of 0 with any number will give the number itself.

7. Find the only unique element when all the numbers in the array is repeating 't' times
-> Add all the numbers, modulo it by 't', thats your answer.
2,2,2,3,3,3,5,5,5,7
2 * 3 + 3 * 3 + 5 * 3 + 7
3(2 + 3 + 5) + 7
30 + 7
37

8. Find the two unique elements in an array where all others are repeating twice.
-> find XOR of all numbers.
-> find right most set bit of the number, suppose the position is i
-> now make two groups of the array, one will have ith bit as set and others will have 0.
-> do xor of res and one of the groups, you will get the first number.
-> do xor of res2 with res1, you will get the second number.



