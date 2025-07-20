
# Array Data Structure Notes

## 1. What is a Data Structure?
A way to organize and store data for efficient access and modification.

## 2. Types of Data Structures
- Linear: Array, LinkedList, Stack, Queue
- Non-linear: Tree, Graph

## 3. What is an Array?
- A fixed-size, contiguous collection of elements of the same type.
```java
int[] arr = new int[5];      // Declaration
int[] arr2 = {1, 2, 3};      // Initialization
```

## 4. Why is Array Required?
- Easy element access via index
- Memory efficiency due to contiguous allocation

## 5. How is Array Represented in Memory?
- Stored in contiguous memory locations
- Access time: O(1) for arr[i]

## 6. Insert Element in Array
```java
arr[index] = value;  // Simple insert
```

## 7. Delete Element in Array
```java
arr[index] = 0;  // Overwrite or reset
```

## 8. Update Element in Array
```java
arr[index] = newValue;
```

## 9. Traverse an Array
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

## 10. Shifting Elements in Array

### Required for inserting/deleting in middle

### Insert with Shift
```java
int[] arr = new int[6];
int size = 3;
int index = 1;
int value = 99;

for (int i = size; i > index; i--) {
    arr[i] = arr[i - 1];  // Shift right
}
arr[index] = value;
size++;
```

### Delete with Shift
```java
int index = 1;

for (int i = index; i < size - 1; i++) {
    arr[i] = arr[i + 1];  // Shift left
}
size--;
```

## 11. Static vs Dynamic Data Structures

| Static (Array)        | Dynamic (ArrayList)     |
|-----------------------|-------------------------|
| Fixed Size            | Grows/Shrinks at runtime|
| Fast access           | Slower access           |
| Less flexible         | More flexible           |

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10); list.remove(0);
```

## 12. Size vs Capacity (in Dynamic Arrays)

- **Capacity**: The total number of elements the array can currently hold.
- **Size**: The number of elements actually present in the array.

In `ArrayList`, the capacity grows automatically when size exceeds it.

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
// list.size() returns number of elements added
```

Internally, when capacity is exceeded:
- A new, larger array is created.
- All elements are copied over (this takes O(n)).

That’s why adding to an ArrayList is amortized O(1), but worst case can be O(n).


## 13. Multidimensional Arrays (2D Arrays)
```java
int[][] matrix = new int[3][3];
int[][] matrix2 = { {1,2}, {3,4} };
```

## 14. Insert in 2D Array
```java
matrix[i][j] = value;
```

## 15. Delete in 2D Array
```java
matrix[i][j] = 0;  // Overwrite
```

## 16. Update in 2D Array
```java
matrix[i][j] = newValue;
```

## 17. Traverse a 2D Array
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## 18. Jagged Array
- 2D array with different column sizes
```java
int[][] jagged = new int[2][];
jagged[0] = new int[3];
jagged[1] = new int[2];
```

## 19. Matrix Representation
- Matrix = 2D Array
- Used in image processing, graphs, game logic

## 20. Time Complexities

| Operation      | Time Complexity |
|----------------|------------------|
| Access         | O(1)             |
| Insert (end)   | O(1) or O(n)     |
| Delete         | O(n)             |
| Search         | O(n)             |

## Pro Tip:
Arrays are fast for access, but costly for middle insertions/deletions due to shifting.
