# Linear Search Notes

## 1. Linear Search Algorithm
Linear search is the simplest searching technique.  
We check each element of the array sequentially until the target element is found or the array ends.

**Time Complexity**:  
- Best Case: O(1) (if element is at first position)  
- Worst Case: O(n) (if element is at last position or not present)  
- Average Case: O(n)

---

## 2. Search First Occurrence of Element in 1D Array

```java
public static void linearSearch(int arr[], int target, boolean findLast){
    int ans = -1;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            ans = i;
            if(findLast == false){
                break;
            }
        }
    }
    if(ans == -1) {
        System.out.println("Element is not present in the array");
    } else {
        System.out.println("Found element at pos: "+ ans);
    }
}
```

---

## 3. Search First Occurrence of Element in 2D Array

```java
public static void linearSearch2d(int arr[][], int target, boolean findLast){
    int outerIndex=-1;
    int InnerIndex=-1;
    for(int i=0;i<arr.length;i++){
        boolean found = false;
        for(int j=0;j<arr[i].length;j++){
            if(target == arr[i][j]){
                outerIndex = i;
                InnerIndex = j;
                if(findLast == false){
                    found = true;
                    break;
                }
            }
        }
        if(found == true){
            break;
        }
    }

    if(outerIndex == -1) {
        System.out.println("Element is not present in the array");
    } else {
        System.out.println("Found element at pos: "+ outerIndex + "," + InnerIndex);
    }
}
```

---

## 4. Find Maximum Element in 1D Array

```java
public static void findMax(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }
    System.out.println("Maximum element is :" + max);
}
```

---

## 5. Find Maximum Sum Subarray in 2D Array  
We can calculate maximum row sum and return the row with maximum sum.

```java
public static void findMaximumSumSubarray(int arr[][]){
    int max = Integer.MIN_VALUE;
    int resIndex = -1;
    for(int i=0;i<arr.length;i++){
        int sum = 0;
        for(int j=0;j<arr[i].length;j++){
            sum = sum + arr[i][j];
        }
        if(sum>max){
            max = sum;
            resIndex = i;
        }
    }
    System.out.println("Maximum sum subarray is :"+ max +", for the index "+ resIndex);
}
```

---

## 6. Find Minimum Element in 1D Array

```java
public static void findMin(int arr[]){
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    System.out.println("Minimum element is :" + min);
}
```

---

## 7. Find Minimum Sum Subarray in 2D Array  
(Same logic as max sum, but for minimum row sum)

*Exercise for students:* Try to implement on your own by modifying `findMaximumSumSubarray`.

---

## 8. Search All Occurrences of Element in 1D Array

```java
public static void linearSearchMultiple(int arr[],int target){
    int ans[] = new int[arr.length];
    int k = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            ans[k] = i;
            k++;
        }
    }
    if(k == 0) {
        System.out.println("Element is not present in the array");
    } else {
        for(int i=0;i<k;i++) {
            System.out.println("Found element at pos: " + ans[i]);
        }
    }
}
```

---

## 9. Search All Occurrences of Element in 2D Array

```java
public static void linearSearchMultiple2d(int arr[][], int target){
    int size = 0;
    for(int i=0;i<arr.length;i++){
        size = size + arr[i].length;
    }
    int ans[][] = new int[size][2];
    int k=0;

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(target == arr[i][j]){
                ans[k][0] = i;
                ans[k][1] = j;
                k++;
            }
        }
    }

    if(k == 0) {
        System.out.println("Element is not present in the array");
    } else {
        for(int i=0;i<k;i++) {
            System.out.println("Found element at pos: " + ans[i][0] + "," + ans[i][1]);
        }
    }
}
```

---

## 10. Search Last Occurrence of Element in 1D Array

Already handled by setting `findLast = true` in `linearSearch`.

---

## 11. Search Last Occurrence of Element in 2D Array

Already handled by setting `findLast = true` in `linearSearch2d`.

---

## 12. How to Use LeetCode

- Go to [https://leetcode.com](https://leetcode.com)  
- Create a free account  
- Start with **Easy** problems (Arrays, Strings, Searching)  
- Use the **Discuss** section for different approaches  
- Practice consistently!
- Ratio: 20% easy, 50% medium, 30% hard

---

## 13. How to Find Number of Elements in 2D Array

```java
int size = 0;
for(int i=0;i<arr.length;i++){
    size = size + arr[i].length;
}
System.out.println("Total elements in 2D array: " + size);
```

---

# Summary
- Linear Search is simple but not efficient for large data.  
- Works on **both 1D and 2D arrays**.  
- Useful to understand before moving to **Binary Search**.  
