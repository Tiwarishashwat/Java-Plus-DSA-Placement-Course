#  Recursion Series – Lecture 2: Recursion on Arrays

---

##  Objective

Now that you understand recursion flow and call stacks, it’s time to apply recursion to **arrays** — one of the most common and interview-loved areas.

By the end of this lecture, you’ll be able to:

* Perform searches recursively
* Return indices or lists from recursion
* Analyze recursive complexity on arrays

---

##  Key Idea

Recursion on arrays is just recursion with **index movement**.

At each step:

1. You process one element.
2. Then you **move to the next index** recursively.
3. Base case → when index crosses array bounds.

---

##  Example 1: Print All Elements of an Array

```java
public class PrintArray {
    static void printArray(int[] arr, int index) {
        if (index == arr.length) return; // Base case
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1); // Move to next index
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printArray(arr, 0);
    }
}
```

**Output:**

```
10 20 30 40
```

**Complexity:**

* Time: O(n)
* Space: O(n) (due to recursive call stack)

---

##  Example 2: Recursive Linear Search

Find if an element `target` exists in an array.

```java
public class LinearSearch {
    static boolean search(int[] arr, int index, int target) {
        if (index == arr.length) return false;  // Base case
        if (arr[index] == target) return true;  // Found
        return search(arr, index + 1, target);  // Move next
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 12};
        System.out.println(search(arr, 0, 7));   // true
        System.out.println(search(arr, 0, 10));  // false
    }
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

##  Example 3: Return Index of First Occurrence

```java
public class FirstIndex {
    static int findFirst(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return findFirst(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 9};
        System.out.println(findFirst(arr, 0, 7)); // 1
    }
}
```

---

##  Example 4: Return Index of Last Occurrence

Here, recursion goes to the **end first**, then checks while returning.

```java
public class LastIndex {
    static int findLast(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        int restIndex = findLast(arr, index + 1, target);
        if (restIndex != -1) return restIndex;
        if (arr[index] == target) return index;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 9};
        System.out.println(findLast(arr, 0, 7)); // 3
    }
}
```

**Flow:**

* Goes deep first → checks backwards while returning.

---

##  Concept: Return Multiple Indices (Using Lists)

Return all occurrences of an element using recursion.

```java
import java.util.*;

public class AllIndices {
    static ArrayList<Integer> findAll(int[] arr, int index, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        if (index == arr.length) return result;

        // Small answer from next call
        ArrayList<Integer> smallAns = findAll(arr, index + 1, target);

        // If found at current index
        if (arr[index] == target)
            result.add(index);

        result.addAll(smallAns);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 7, 4, 7};
        System.out.println(findAll(arr, 0, 7)); // [0, 2, 4]
    }
}
```

**Concept Used:**
Recursion builds the result backward (from the end).
We combine results from smaller subproblems to get the final list.

---

##  Example 5: Recursive Binary Search (Sorted Array)

Binary Search is a **logarithmic recursive algorithm**.

```java
public class BinarySearch {
    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, low, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 8)); // 3
    }
}
```

**Time Complexity:** O(log n)
**Space Complexity:** O(log n)

---

##  Recursion Complexity Patterns for Arrays

| Problem                            | Calls per Step | Depth | Time Complexity | Example          |
| ---------------------------------- | -------------- | ----- | --------------- | ---------------- |
| Print/Linear Search                | 1              | n     | O(n)            | Simple traversal |
| Return All Indices                 | 1              | n     | O(n)            | Builds list      |
| Binary Search                      | 1              | log n | O(log n)        | Sorted arrays    |
| Divide & Conquer (like Merge Sort) | 2              | log n | O(n log n)      | Coming later     |

---

##  Common Mistakes

1. Forgetting to increment the index → infinite recursion.
2. Returning `void` when you need a result.
3. Creating new list every call (instead of combining properly).
4. Confusing base case with terminating condition (`index == arr.length`).

---

##  Key Takeaways

* Arrays + recursion = index-based recursion.
* Base case → when index crosses array length.
* You can return values, indices, or lists recursively.
* Recursion on arrays forms the foundation for **divide-and-conquer algorithms** like Merge Sort.

---

##  Practice Questions

1. Print all array elements recursively (forward & backward).
2. Find sum of all elements recursively.
3. Find min and max recursively.
4. Count occurrences of a target element.
5. Implement recursive binary search (sorted array).

---

##  What’s Next

**Lecture 4 – Recursion on Strings**

* String-based recursion
* Reverse, palindrome check
* Generate subsequences
* Analyze string recursion complexity (O(2ⁿ))

---
