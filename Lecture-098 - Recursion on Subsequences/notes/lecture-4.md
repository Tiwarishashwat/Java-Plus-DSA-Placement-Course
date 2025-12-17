# Lecture 4 – Recursion with Subsequence Patterns

###  Goal:
To understand how recursion can be used to generate **all possible subsequences** of a string or array — and how this pattern becomes the *foundation* for solving complex problems like **Subsets, Combination Sum, Permutations**, etc.

---

##  Step 1: What is a Subsequence?

A **subsequence** is formed by **choosing or skipping** characters/elements while maintaining their original order.

Example:  
String = `"abc"`  
→ Subsequences are:  
`"", "a", "b", "c", "ab", "ac", "bc", "abc"`

💡 Total subsequences = `2^n`, where `n` is string length.  
Each character has **2 choices** → *Include or Exclude.*

---

##  Step 2: The Core Recursion Pattern

```java
void subsequence(String s, int index, String current) {
    if (index == s.length()) {
        System.out.println(current);
        return;
    }

    // 1️⃣ Include current character
    subsequence(s, index + 1, current + s.charAt(index));

    // 2️⃣ Exclude current character
    subsequence(s, index + 1, current);
}
```

---

###  Dry Run (for `"abc"`):

| Call | Index | Current | Action |
|------|--------|----------|--------|
| subsequence("abc", 0, "") | 0 | "" | choose 'a' or skip |
| → Include 'a' → subsequence("abc", 1, "a") | 1 | "a" | choose 'b' or skip |
| → Include 'b' → subsequence("abc", 2, "ab") | 2 | "ab" | choose 'c' or skip |
| → Include 'c' → subsequence("abc", 3, "abc") ✅ print |
| → Exclude 'c' → subsequence("abc", 3, "ab") ✅ print |
| → Exclude 'b' → subsequence("abc", 2, "a") … and so on |

---

## Step 3: Counting Subsequences

```java
int countSubsequence(String s, int index) {
    if (index == s.length()) return 1; // one valid subsequence (empty string)

    int include = countSubsequence(s, index + 1);
    int exclude = countSubsequence(s, index + 1);
    return include + exclude;
}
```

 Output for `"abc"` → 8

---

##  Step 4: Subsequence with Conditions

### Example: Print only subsequences starting with `'a'`

```java
void subsequenceStartingWithA(String s, int index, String current) {
    if (index == s.length()) {
        if (current.startsWith("a")) System.out.println(current);
        return;
    }

    subsequenceStartingWithA(s, index + 1, current + s.charAt(index));
    subsequenceStartingWithA(s, index + 1, current);
}
```
---
## Step 5: Counting Subsequences Starting with `'a'`

Now instead of **printing** subsequences, we’ll **count** how many subsequences start with the character `'a'`.

### Key Idea

- Generate all subsequences using recursion (include / exclude).
- At the **base case**, check whether the formed subsequence starts with `'a'`.
- If yes → count it as `1`, else `0`.

---

### Java Implementation

```java
int countSubsequenceStartingWithA(String s, int index, String current) {
    if (index == s.length()) {
        if (current.length() > 0 && current.startsWith("a")) {
            return 1;
        }
        return 0;
    }

    // Include current character
    int include = countSubsequenceStartingWithA(
        s, index + 1, current + s.charAt(index)
    );

    // Exclude current character
    int exclude = countSubsequenceStartingWithA(
        s, index + 1, current
    );

    return include + exclude;
}
```
---

##  Step 6: Building the Intuition

Each step gives **two paths** (include or exclude).  
That’s why recursion forms a **binary tree** of decisions.

For `"abc"`:

```
                ""
           /          \
         "a"            ""
       /    \         /    \
     "ab"   "a"     "b"     ""
    /  \   /  \    /  \    /  \
 "abc" "ab" "ac" "a" "bc" "b" "c" ""
```

Total leaves → `2^n` subsequences.



##  Step 9: Key Takeaways

- Subsequence = *Include–Exclude* recursion.  
- Total subsequences = 2^n.  
- Use `index` instead of substring manipulation.  
- This pattern is the **base** for backtracking.  
- Every choice expands into two branches — like a decision tree.  
- Understanding this is the **gateway** to solving advanced recursion problems.
