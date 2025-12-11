Jump Search ->
1. Jump Search is a searching algorithm which works on sorted data.
2. Jump Search works on blocks. It first searches for the potential block,
once the potential block is found, the algorithm applies Linear search on the bloc,
if element is found return the index, otherwise return -1.

User can decide the block size, usually a block size of sqRoot(N) is choosen where N is 
the length of array.
Time complexity -> O(BlockSize) // BlockSize is usually sqroot(N)

Ternary Search ->
1. Ternary Search is a searching algorithm which works on sorted data.
2. The concept is very much similar to binary search, in a binary search,
we divide the array into two halves but here in ternary search, we will divide the 
array into three halves.
mid1 = l + (r-l)/3 
mid2 = r – (r-l)/3 

where l is the starting index of the search space.
and r is the last index of the search space.
Cases of ternary search ->
1. if element is found at mid1, return mid1.
2. if element is found at mid2, return mid2.
3. if element is less than arr[mid1] , move towards the left side of mid1 [l, mid1-1]
4. if element is greater than arr[mid2], move towards the right side of mid2 [mid2+1, r]
5. Else move towards the middle part[mid1+1, mid2-1]

Interpolation Search ->
1. Interpolation Search is a searching algorithm which works on sorted as well as uniform data.
2. The idea is to search at the most likely place, the element can be present, just incase it
is not present, the algorithm determines where to go next just like binary search.
That is ..
a. Found element is greater than Target element, then move towards left.
b. Found element is less than Target element, then move towards right. 

How to find the position (say pos)?

pos = lo + (x - arr[lo]) *(hi - lo)/(arr[hi] - arr[lo])

where lo -> start position of the search space.
hi -> end position of the search space.
x -> target element
arr -> name of the array.

This search is having a time complexity of log2(log2N).

Exponential Search ->

Exponential search also works on sorted data, It is a very efficient searching
algorithm, somewhat similar to Binary Search on an infinite Array.

The idea is to start with a subarray of size 1, compare the last element of subarray with 1.
Keep on doubling the subarray unless the target is less than the last element of the subarray.
Now that we have enclosed a range where element can be found, simply apply binary search on this
range.