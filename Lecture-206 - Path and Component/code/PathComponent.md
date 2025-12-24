# Graph Traversal & Concepts – Mini Notes

## 1. How to Traverse Multiple Components in a Graph
If a graph has **multiple disconnected components**, a single BFS or DFS will **not** visit all nodes.

### Idea
- Maintain a **visited[]** array
- Run DFS/BFS from **every unvisited node**

### Diagram
```
Component 1        Component 2

1 —— 2 —— 3        4 —— 5
                  
Traversal:
Start DFS/BFS from 1 → visits {1,2,3}
Then start DFS/BFS from 4 → visits {4,5}
```

---

## 2. Tree Traversal vs Graph Traversal

### Tree Traversal
- Always **connected**
- No cycles
- No need for visited[]
- Traversal types:
  - Inorder
  - Preorder
  - Postorder

```
    A
   / \
  B   C

Traversal is straightforward
```

### Graph Traversal
- May be **disconnected**
- May contain **cycles**
- **visited[] is mandatory**
- Traversal types:
  - BFS
  - DFS

```
1 —— 2
|    |
4 —— 3   ← cycle exists
```

---

## 3. Path in a Graph
A **path** is a sequence of vertices where:
- Each adjacent pair is connected by an edge
- A path may or may not be simple

### Diagram
```
A —— B —— C —— D

Valid Path:
A → B → C → D
```

---

## 4. Cycle in a Graph
A **cycle** exists if:
- You start from a node
- Traverse edges
- Come back to the **same node** again

### Undirected Cycle
```
1 —— 2
|    |
4 —— 3
```

### Directed Cycle
```
A → B → C
↑         ↓
└─────────┘
```

---

## 5. Directed Acyclic Graph (DAG)
A **DAG** is a graph that:
- Is **directed**
- Contains **no cycles**

### Diagram
```
A → B → D
↓
C
```

### Key Uses
- Task scheduling
- Dependency resolution
- Topological sorting

---

## 6. Find if a Path is Valid or Not (Conceptual)
To check if a path exists:
- Use **DFS or BFS**
- Start from source
- If destination is reached → path exists

### Diagram
```
Start (S) —— A —— B —— End (E)

If traversal reaches E → Valid Path
Else → Invalid Path
```

---

## 7. Summary
- Multiple components require **multiple BFS/DFS runs**
- Trees are special graphs with no cycles
- Graph traversal needs **visited[]**
- Cycles change traversal logic
- DAGs are powerful for dependency problems
