# AVL Trees – Mini Notes

## 1. Balanced Trees
A **Balanced Tree** is a tree where:
- The height difference between left and right subtrees is limited
- Ensures **O(log n)** time complexity for search, insert, and delete

Balanced trees prevent skewed structures.

---

## 2. AVL Tree
An **AVL Tree** is a **self-balancing Binary Search Tree (BST)** where:
- Balance is maintained after every insertion and deletion
- Named after **Adelson-Velsky and Landis**

### Key Property
```
| height(left subtree) − height(right subtree) | ≤ 1
```

---

## 3. Balance Factor of AVL Tree
The **Balance Factor (BF)** of a node is:
```
BF = Height(Left Subtree) − Height(Right Subtree)
```

### Valid Balance Factor Values
- `-1` → Right heavy
- `0`  → Balanced
- `+1` → Left heavy

If BF becomes `< -1` or `> +1`, the tree becomes **unbalanced**.

---

## 4. Insert in AVL Tree
Steps:
1. Insert the node like a normal **BST**
2. Update height of ancestor nodes
3. Check balance factor
4. Perform required **rotation** to rebalance

Time Complexity: **O(log n)**

---

## 5. Delete in AVL Tree
Steps:
1. Delete node like a normal **BST**
2. Update heights of ancestors
3. Check balance factor
4. Perform required **rotation(s)**

Time Complexity: **O(log n)**

---

## 6. AVL Tree Rotations
Rotations are used to **restore balance**.

There are **4 cases**:

---

## 7. LL Rotation (Left-Left Case)
### Condition:
- Insertion in **left subtree of left child**

### Fix:
- **Single Right Rotation**

---

## 8. RR Rotation (Right-Right Case)
### Condition:
- Insertion in **right subtree of right child**

### Fix:
- **Single Left Rotation**

---

## 9. LR Rotation (Left-Right Case)
### Condition:
- Insertion in **right subtree of left child**

### Fix:
1. Left rotation on left child
2. Right rotation on root

(Double rotation)

---

## 10. RL Rotation (Right-Left Case)
### Condition:
- Insertion in **left subtree of right child**

### Fix:
1. Right rotation on right child
2. Left rotation on root

(Double rotation)

---

## 11. Summary
- AVL Tree is a **self-balancing BST**
- Balance Factor ∈ {-1, 0, +1}
- Rotations maintain height balance
- Guarantees **logarithmic performance**
