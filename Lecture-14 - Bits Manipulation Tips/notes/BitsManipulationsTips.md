Questions > 
1. Find number is even or odd
-> if num & 1 == 1 then it is odd
-> otherwise it is even

2. Find the ith bit of a number
-> create a mask using (1 << i)
-> do the & of number with the mask
-> num & (1 << i)

3. check if ith bit of a number is set
-> create a mask using (1 << i)
-> do the & of number with the mask
-> num = num & (1 << i), if num = 0, ith bit is not set, otherwise it is set.

4. Set the ith bit of a number
-> create a mask using (1 << i)
-> do the | of number with the mask
-> num = num | (1 << i)

5. unset the ith bit of a number
-> create a mask using ~(1 << i)
-> do the & of number with the mask
-> num = num & !(1 << i)

6. Toggle the ith bit of a number
-> create a mask using (1 << i)
-> do the ^ of number with the mask
-> num = num ^ (1 << i)

7. Find the last set bit
-> n & (n-1)

8. Find number of set bits in a number.
->  change n to n &= (n - 1) inside a loop and keep on incrementing till n becomes 0 

9. Find if a number is power of 2.
-> simple, there should be only 1 set bit in the representation of that number.
-> n & (n-1) = 0 then it is of power 2.

10. print bits, (num >> i) & 1
