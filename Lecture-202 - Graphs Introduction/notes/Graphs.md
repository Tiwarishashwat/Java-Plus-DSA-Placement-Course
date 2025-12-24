# Graph Data Structure – Mini Notes

## 1. Introduction to Graphs
A **Graph** is a **non-linear data structure** used to represent **connections or relationships** between entities.

- Graph consists of **vertices (nodes)** and **edges (connections)**
- Widely used in real-world problems like networks, maps, and social media

### Real-life Examples
- Social networks (users & friendships)
- Road maps (cities & roads)
- Computer networks

---

## 2. Vertex (Node)
A **vertex** (or node) represents an **entity** in a graph.

Example:
- Person in a social network
- City in a road map

---

## 3. Edge
An **edge** represents a **connection** between two vertices.

- Can be **directed** or **undirected**
- Can have **weight** or no weight

---

## 4. Components of a Graph
A **component** is a **connected subgraph** of a graph.

- In an undirected graph, a component means all vertices are reachable from each other
- A graph may have **one or more components**

---

## 5. Directed Graph (Digraph)
A **Directed Graph** is a graph where:
- Edges have a **direction**
- Represented as ordered pairs `(u → v)`

Example:
- Instagram follow (A follows B)

---

## 6. Undirected Graph
An **Undirected Graph** is a graph where:
- Edges have **no direction**
- Connection is **bidirectional**

Example:
- Facebook friendship

---

## 7. Degree of a Node
The **degree** of a node is:
- The number of edges connected to that node

### For Undirected Graph
```
Degree = Number of connected edges
```

---

## 8. In-degree and Out-degree
Applicable only to **Directed Graphs**.

- **In-degree**: Number of edges coming **into** a vertex
- **Out-degree**: Number of edges going **out** of a vertex

```
Total Degree = In-degree + Out-degree
```

---

## 9. Weighted Graph
A **Weighted Graph** is a graph where:
- Each edge has a **weight or cost**
- Weight may represent distance, time, or cost

Example:
- Google Maps (distance between cities)

---

## 10. Unweighted Graph
An **Unweighted Graph** is a graph where:
- All edges have **equal weight**
- Only connectivity matters

Example:
- Friend connections in a social network

---

## 11. Summary
- Graph is a **non-linear data structure**
- Vertices represent entities, edges represent relationships
- Graphs can be directed/undirected and weighted/unweighted
- Degree, in-degree, and out-degree define node connectivity
