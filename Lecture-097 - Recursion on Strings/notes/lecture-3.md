#  Recursion Series – Lecture 3: Recursion on Strings (Index-Based Approach)

---

##  Objective

In this lecture, we’ll explore **recursion on strings** — one of the most common topics in interviews.
We’ll use the **index-based approach**, which makes recursion easier to visualize and more efficient (O(n) time).

By the end, you’ll clearly understand:

* How to process a string recursively using an index
* When to perform work before or after the recursive call
* How to solve classic string problems using recursion

---

##  Core Idea

We’ll use a helper function with an **index parameter** that represents the current position in the string.

```java
void process(String s, int index) {
    if (index == s.length()) return; // Base case
    char ch = s.charAt(index);
    process(s, index + 1); // Recursive call
}
```

Each call processes **one character**, then moves forward recursively.

---

##  Example 1: Print All Characters of a String

```java
public class PrintChars {
    static void printChars(String s, int index) {
        if (index == s.length()) return; // Base case
        System.out.println(s.charAt(index));
        printChars(s, index + 1); // Move to next index
    }

    public static void main(String[] args) {
        printChars("abc", 0);
    }
}
```

**Dry Run (for "abc"):**

```
printChars("abc", 0) → prints 'a'
printChars("abc", 1) → prints 'b'
printChars("abc", 2) → prints 'c'
printChars("abc", 3) → return
```

 **Output:**

```
a
b
c
```

 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

##  Example 2: Reverse a String Recursively

Here we print the character **after** the recursive call (so it reverses order).

```java
public class ReverseString {
    static void reverse(String s, int index) {
        if (index == s.length()) return;
        reverse(s, index + 1); // Go till end first
        System.out.print(s.charAt(index)); // Print on return
    }

    public static void main(String[] args) {
        reverse("hello", 0);
    }
}
```

**Dry Run (for "abc"):**

```
reverse("abc", 0)
→ reverse("abc", 1)
→ reverse("abc", 2)
→ reverse("abc", 3) → return
→ print 'c'
→ print 'b'
→ print 'a'
```

 **Output:** `cba`

 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

##  Example 3: Check if String is Palindrome

Use **two pointers** (`left`, `right`) to compare characters recursively.

```java
public class Palindrome {
    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam", 0, 4)); // true
        System.out.println(isPalindrome("hello", 0, 4)); // false
    }
}
```

 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

##  Example 4: Remove a Character from a String

Remove all occurrences of a given character, using index-based recursion.

```java
public class RemoveChar {
    static void removeChar(String s, int index, char ch, StringBuilder result) {
        if (index == s.length()) {
            System.out.println(result.toString());
            return;
        }

        if (s.charAt(index) != ch)
            result.append(s.charAt(index));

        removeChar(s, index + 1, ch, result);
    }

    public static void main(String[] args) {
        removeChar("banana", 0, 'a', new StringBuilder());
    }
}
```

 **Output:** `bnn`
 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

##  Example 5: Replace “pi” with “3.14”

This one is easier to understand using substring logic, because we deal with **two-character patterns**.

```java
public class ReplacePi {
    static String replacePi(String s, int index) {
        if (index >= s.length()) return "";
        if (index + 1 < s.length() && s.charAt(index) == 'p' && s.charAt(index + 1) == 'i') {
            return "3.14" + replacePi(s, index + 2);
        } else {
            return s.charAt(index) + replacePi(s, index + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(replacePi("xpipix", 0)); // Output: x3.143.14x
    }
}
```

 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

##  Example 6: Remove Duplicates from a String

We’ll use a boolean array to keep track of which characters have appeared.

```java
public class RemoveDuplicates {
    static void removeDup(String s, int index, boolean[] seen, StringBuilder result) {
        if (index == s.length()) {
            System.out.println(result.toString());
            return;
        }

        char ch = s.charAt(index);
        if (!seen[ch - 'a']) {
            seen[ch - 'a'] = true;
            result.append(ch);
        }

        removeDup(s, index + 1, seen, result);
    }

    public static void main(String[] args) {
        removeDup("aabbccdde", 0, new boolean[26], new StringBuilder());
    }
}
```

 **Output:** `abcde`
 **Time Complexity:** O(n)
 **Space Complexity:** O(n)

---

## Example 7: Count and Say Sequence

The *Count and Say* sequence is a classic recursion problem where each term describes the previous one.  
It starts with `"1"`, and each subsequent term is generated by reading the previous term aloud.

| n | Term |
|---|------|
| 1 | "1" |
| 2 | "11" → one 1 |
| 3 | "21" → two 1s |
| 4 | "1211" → one 2, one 1 |
| 5 | "111221" → one 1, one 2, two 1s |

---

### 💡 Recursive Approach

- **Base case:**  
  If `n == 1`, return `"1"`.

- **Recursive case:**  
  Generate the previous term using `countAndSay(n - 1)` and then construct the current term by counting consecutive identical digits.

---

```java
class Solution {
    public String countAndSay(int n) {

        if (n == 1)
            return "1";

        String nums = countAndSay(n - 1);

        int freq = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < nums.length(); i++) {
            freq++;
            if (i == nums.length() - 1 || nums.charAt(i) != nums.charAt(i + 1)) {
                res.append(freq).append(nums.charAt(i));
                freq = 0;
            }
        }

        return res.toString();
    }
}
```
- **Example Walkthrough (n = 5):** 

1
11
21
1211
111221

Each step “reads” the previous one — for example:

"1211" → one 1, one 2, two 1s → "111221"

- **Time Complexity:** 

O(N × M)
where

N = number of recursive calls

M = average length of intermediate strings

- **Space Complexity:** 

O(L(n)) due to recursion and the StringBuilder.


##  Patterns Observed

| Problem Type      | Base Case             | Action                 | Index Used For     |
| ----------------- | --------------------- | ---------------------- | ------------------ |
| Print / Reverse   | `index == s.length()` | Before/After recursion | Track current char |
| Palindrome        | `left >= right`       | Compare both ends      | Two-pointer        |
| Remove / Replace  | `index == s.length()` | Conditionally append   | Build result       |
| Remove Duplicates | `index == s.length()` | Use boolean array      | Track seen chars   |

---

##  Common Mistakes

1. Forgetting to increment `index` → infinite recursion
2. Using `substring` unnecessarily → O(n²) time
3. Forgetting base case: `if (index == s.length()) return;`
4. Using `String` concatenation instead of `StringBuilder`

---

##  Key Takeaways

* Prefer **index-based recursion** for efficiency and clarity.
* Always define a **clear base case** before accessing `s.charAt(index)`.
* Decide **when** to perform work:

  * Before recursion → top-down
  * After recursion → bottom-up
* Use **StringBuilder** when building strings recursively.

---

##  Practice Questions

1. Reverse a string recursively
2. Check palindrome string
3. Remove all ‘x’ from a string
4. Replace “hi” with “hello” recursively
5. Remove consecutive duplicates
6. Count occurrences of a character recursively
7. Convert uppercase letters to lowercase recursively

---

##  What’s Next

**Lecture 5 – Subsequence Pattern Problems**

* Print all subsequences of a string
* Count total subsequences
* Generate subsequences with/without spaces
* Visualize recursion trees

---
