# Lecture 3 -- Standard Questions in Bit Manipulation

In this lecture, we will use the tricks learned earlier to solve
**classic interview questions**.\
These are must-know problems for coding interviews.

------------------------------------------------------------------------

## 1. Find the Unique Number (all others appear twice) - [Single Number I]

If every number appears twice except one, we can find it using XOR.

``` java
public int singleNumber(int[] nums) {
        int xor=0;
        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
    }
```


### Why does this work?

-   Pairs cancel out: `a ^ a = 0`
-   0 with unique element = that element.
-   `(a ^ b) ^ c = a ^ (b ^ c)` (associative)\
-   `a ^ b = b ^ a` (commutative)

Example: `[2, 3, 5, 3, 2]` → result = `5`

------------------------------------------------------------------------

## 2. Find Unique Number (all others appear thrice) [Single Number II]

When every element appears 3 times except one, use **bit counts**.

``` java
    public int singleNumber(int[] nums) {
        int res=0;
        // 32*N
        for(int i=0;i<32;i++){
            int bitCount=0;
            for(int num : nums){
                if((num & (1<<i))!=0){ //just checking if ith bit was set in num
                    bitCount++;
                }
            }
            if(bitCount%3!=0){ //set the ith bit if count is not divisible by 3
                res = res | (1<<i);
            }
        }
        return res; 
    }
```

### Idea:

-   Count bits column-wise.\
-   If a bit count is not divisible by 3, that bit belongs to the unique
    number.

**time complexity**: `Looping through 32 bits (constant for int), each iteration checks all N numbers → O(32 * N) ≈ O(N).`

------------------------------------------------------------------------
## 3. Find 2 Unique Numbers (all others appear twice)

If two numbers appear once and the rest appear twice:

1.  XOR of all numbers = `x ^ y`\
2.  Find rightmost set bit of `x ^ y`.\
3.  Divide numbers into 2 groups based on this bit.\
4.  XOR within each group → gives `x` and `y`.

why it works?
rsb = xor & (-xor) isolates the rightmost set bit, which guarantees x and y differ at this bit, so they get separated into different groups.

``` java
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num : nums){
            xor = xor ^ num;
        }
        int rsb = xor & (-xor);
        int xorA=0;
        int xorB=0;
        for(int num : nums){
            if((num & rsb)!=0){
                xorA = xorA ^ num;
            }else{
                xorB = xorB ^ num;
            }
        }
        return new int[]{xorA,xorB};
    }
```

------------------------------------------------------------------------

## 4. Minimum Number of Bit Flips (Convert A → B)

We can count how many bits are different between two numbers.

``` java
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count=0;
        while(xor>0){
            xor = xor & (xor-1);
            count++;
        }
        return count;
    }
```

Example:\
- `a = 10 (1010)`\
- `b = 7  (0111)`\
- `a ^ b` = `13 (1101)` → 3 bits differ → flips = 3.


------------------------------------------------------------------------

## 5. Print All Subsets (Power Set)

We can generate all subsets of an array using bitmasking.

``` java
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        int subsets = 1<<len;
        for(int i=0;i<subsets;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
```

### Output for \[1, 2, 3\]:

{}
{1}
{2}
{1, 2}
{3}
{1, 3}
{2, 3}
{1, 2, 3}


------------------------------------------------------------------------

## Summary of Lecture 3

-   Solved standard problems: unique numbers (twice/thrice).\
-   Learned how to generate **power set** using bitmasking.\
-   Counted bit flips between two numbers.\
