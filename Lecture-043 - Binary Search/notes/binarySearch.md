# Binary Search Notes

In this lecture, we will study about binary search and its 3 variants.

---

## 1. Sorted Array
Binary Search works only on **sorted arrays**.  
- If the array is not sorted, first sort the array before applying Binary Search.

Increasing order ->
2,2,3,4,5,7,10

Decreasing order ->
12,9,3,1,1,1,-1

---

## 2. Binary Search in Increasing Order

```java
static void binarySearch(int arr[], int target){
    int ans = -1;
    int start = 0;
    int end = arr.length-1;
    while (start<=end){
        int mid = start + (end-start)/2; // avoids overflow
        if(arr[mid] == target){
            ans = mid;
            break;
        } else if(arr[mid]<target){
            start = mid+1;
        } else {
            end = mid-1;
        }
    }
    if (ans == -1){
        System.out.println("Element not found");
    }
    else {
        System.out.println("Found element "+ target+ " at index : "+ ans);
    }
}
```

**Time Complexity**:  
- Best Case: O(1)  
- Worst Case: O(log n)  
- Average Case: O(log n)

---

## 3. Binary Search in Decreasing Order

```java
static void binarySearchDesc(int arr[], int target){
    int ans = -1;
    int start = 0;
    int end = arr.length-1;
    while (start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            ans = mid;
            break;
        } else if(arr[mid]<target){
            end = mid-1;
        } else {
            start = mid+1;
        }
    }
    if (ans == -1){
        System.out.println("Element not found");
    }
    else {
        System.out.println("Found element "+ target+ " at index : "+ ans);
    }
}
```

---

## 4. Order Agnostic Binary Search
If you do not know whether the array is sorted in increasing or decreasing order, first check the **first and last elements** and then apply the appropriate binary search.

```java
static void binarySearchOrderAgnostic(int arr[], int target){
    int start = 0;
    int end = arr.length-1;
    if(arr[start]<=arr[end]){
        binarySearch(arr,target); // increasing order
    }
    else {
        binarySearchDesc(arr,target); // decreasing order
    }
}
```

---

## 5. Avoid Overflow in Finding Mid
Instead of writing:
```java
int mid = (start + end) / 2;
```
We use:
```java
int mid = start + (end - start) / 2;
```
This prevents **integer overflow** when `start + end` exceeds the maximum integer value.

---

## 6. Why Binary Search is Faster
- Instead of scanning all elements one by one like Linear Search, Binary Search cuts the search space in **half each time**.  
- Therefore, it has **O(log n)** time complexity, which is much faster than **O(n)** for large datasets.

---

## 7. Find if Array is Sorted in Increasing or Decreasing Order

```java
if(arr[0] < arr[arr.length-1]){
    System.out.println("Array is sorted in increasing order");
} else {
    System.out.println("Array is sorted in decreasing order");
}
```

---

# Summary
- Binary Search only works on **sorted arrays**.  
- Can be applied on **increasing** or **decreasing** arrays.  
- Use **Order Agnostic Binary Search** when order is unknown.  
- Always calculate `mid` using `start + (end-start)/2` to avoid overflow.  
- Binary Search is efficient with **O(log n)** complexity compared to Linear Search's **O(n)**.  
