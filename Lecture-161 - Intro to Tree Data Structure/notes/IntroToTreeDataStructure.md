# Tree Data Structure – Mini Notes (Non-Linear DS)

## 1. What is a Tree Data Structure?
A **Tree** is a **non-linear, hierarchical data structure** used to represent relationships between elements.

- Consists of **nodes** connected by **edges**
- Has exactly **one root node**
- Each node can have **zero or more children**

### Real-life Examples
- Organization hierarchy  
- Folder structure in a computer  

---

## 2. Tree as a Non-Linear Data Structure
- Data is **not stored sequentially**
- One node can connect to **multiple nodes**
- Traversal is not linear

---

## 3. Tree as a Hierarchical Data Structure
- Data is organized in **levels**
- Root at the top, leaf nodes at the bottom
- Clearly represents **parent-child relationships**

---

## 4. Basic Terminologies in Tree

### Node
A **node** is the fundamental unit of a tree that stores data.

---

### Edge
An **edge** is a connection between two nodes.

---

### Root
The **root** is the topmost node of a tree and has **no parent**.

---

### Parent of a Node
The **parent** is the immediate predecessor of a node.

---

### Child of a Node
A **child** is a node that directly descends from another node.

---

### Leaf Node
A **leaf** (or external node) is a node that has **no children**.

---

### Ancestor
An **ancestor** of a node includes its **parent, grandparent, and all nodes up to the root**.

---

### Descendant
A **descendant** of a node includes its **children, grandchildren, and all nodes below it**.

---

### Siblings
Nodes that share the **same parent** are called **siblings**.

---

### Cousins
Nodes are called **cousins** if:
- They are at the **same level**
- Their **parents are siblings**

---

### Neighbour
Two nodes are **neighbours** if they are **directly connected by an edge**.

---

### Subtree
A **subtree** is a tree formed by any node and **all of its descendants**.

---

## 5. Types of Trees
- Binary Tree
- Binary Search Tree (BST)
- AVL Tree
- Heap
- N-ary Tree
- Trie

---

## 6. Binary Tree
A **Binary Tree** is a tree in which:
- Each node has **at most two children**
- Referred to as **left child** and **right child**

### Types
- Full Binary Tree
- Complete Binary Tree
- Perfect Binary Tree
- Skewed Binary Tree

---

## 7. N-ary Tree
An **N-ary Tree** is a tree where:
- Each node can have **at most N children**

---

## 8. Ternary Tree
A **Ternary Tree** is a special N-ary tree where:
- Each node has **at most three children**

---

## 9. Properties of a Tree Data Structure
- Exactly **one root**
- Every node (except root) has **one parent**
- No cycles
- Connected structure
- Number of edges = Number of nodes − 1

---

## 10. Depth of a Tree
**Depth of a node**:
- Number of edges from the **root to that node**

**Depth of tree**:
- Maximum depth of any node

---

## 11. Height of a Tree
**Height of a node**:
- Number of edges on the **longest path from that node to a leaf**

**Height of tree**:
- Height of the root node

---

## 12. Summary
- Tree is a **non-linear and hierarchical data structure**
- Nodes are connected via edges
- Concepts like ancestor, descendant, subtree define structure
- Binary, N-ary, and Ternary trees are commonly used in DSA
