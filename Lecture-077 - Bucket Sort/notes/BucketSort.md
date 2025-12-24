# Bucket Sort
Bucket Sort is a sorting algorithm that distributes the elements of an array into a number
of buckets. Each bucket is then sorted individually, either using a different sorting algorithm
or by recursively applying the bucket sort algorithm. 
The basic idea is to divide the range of input values into a fixed number of buckets and then 
distribute the elements into these buckets. Finally, the elements in each bucket are sorted,
and the sorted buckets are concatenated to get the sorted array.

# Steps Involved
## 1. Determine the range of input values:
Find the maximum value in the array to be sorted to determine the range of values.

## 2. Create buckets:

Divide the range of values into a fixed number of buckets. The number of buckets can
be determined based on the input range and distribution.

## 3. Distribute elements into buckets:

Iterate through the input array and place each element into the corresponding bucket
based on its value. This is often done using a mapping function that takes the element's
value and assigns it to the appropriate bucket.

## 4. Sort individual buckets:

Sort each bucket, either using another sorting algorithm or by recursively applying the 
bucket sort algorithm. 

### Pro Tip -> Combine Step 3 and 4 by applying insertion sort!

## 5. Concatenate the sorted buckets:

Concatenate the sorted buckets to obtain the final sorted array.

# Algorithm Analysis:
The efficiency of Bucket Sort depends on the distribution of the input elements. If the elements are uniformly distributed across the range, and each bucket contains approximately the same number of elements, Bucket Sort can be very efficient. However, if the distribution is highly skewed, some buckets may end up with more elements, affecting the overall performance.

The time complexity of Bucket Sort depends on the sorting algorithm used for the individual buckets. If each bucket is sorted using a comparison-based sorting algorithm, the overall time complexity is influenced by that algorithm. In the best case, when the distribution is even and the buckets are sorted efficiently, Bucket Sort can achieve linear time complexity. However, in the worst case, it may degrade to quadratic time complexity.

Bucket Sort is often used when the input is uniformly distributed, and the range of values is known and not too large. It is not suitable for every scenario, and its performance characteristics depend on the specific characteristics of the input data.

Best & Average Case Time Complexity: O(N+K)
Worst Case Time Complexity: O(N^2)

Space Complexity: O(N+K)

here N=number of elements
K=number of buckets.