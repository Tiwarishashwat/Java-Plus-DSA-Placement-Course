# Spanning Tree & Minimum Spanning Tree – Mini Notes

## 1. Undirected Graph
An **Undirected Graph** is a graph where:
- Edges have **no direction**
- Connection is **bidirectional**

```
A —— B —— C
```
Traversal can happen both ways.

---

## 2. Acyclic Graph
An **Acyclic Graph** is a graph that:
- **Does not contain any cycle**

### Important Point
- A **tree** is always acyclic
- An undirected acyclic graph is a **forest**

```
A —— B —— C   (Acyclic)
```

---

## 3. Spanning Tree
A **Spanning Tree** is a subgraph that:
- Includes **all vertices** of the graph
- Is **connected**
- Is **acyclic**
- Has exactly **(V − 1) edges**, where V = number of vertices

### Key Properties
- Formed only from **undirected graphs**
- Multiple spanning trees can exist for one graph

### Diagram
```
Original Graph:
A —— B
|  \  |
C —— D

One Spanning Tree:
A —— B
|
C —— D
```

---

## 4. Minimum Spanning Tree (MST)
A **Minimum Spanning Tree** is a spanning tree that:
- Connects all vertices
- Has **minimum total edge weight**

### Conditions
- Graph must be:
  - **Connected**
  - **Undirected**
  - **Weighted**

### Real-life Example
- Laying minimum-cost cables
- Road construction with minimum distance

---

## 5. Why MST is Important?
- Reduces cost while keeping all nodes connected
- Used in:
  - Network design
  - Clustering
  - Image segmentation

---

## Algorithms to find MST?
 - Prim's Algorithm
 - Kruskal's Algorithm



## 9. Summary
- **Spanning Tree** connects all nodes without cycles
- **MST** minimizes total edge weight
- Works only on **connected, undirected, weighted graphs**
- Prim and Kruskal are greedy algorithms for MST
