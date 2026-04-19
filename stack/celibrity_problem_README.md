# celibrity_problem.java

## Problem
In a party of `n` people represented by an `n x n` acquaintance matrix, find the **celebrity** — a person who is known by everyone but knows nobody.

- `arr[i][j] = 1` means person `i` knows person `j`.

## Approach
1. Push all person indices `0` to `n-1` onto the stack.
2. **Elimination phase:** Repeatedly pop two people `i` and `j`:
   - If `arr[i][j] == 1` → `i` knows `j`, so `i` is **not** the celebrity. Push `j` back.
   - Else → `j` is not known by `i`, so `j` is **not** the celebrity. Push `i` back.
3. The last remaining person is the **potential celebrity**.
4. **Verification:** Check that the potential celebrity's row is all `0` (knows nobody) and their column is all `1` (known by everyone).

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — elimination + verification |
| **Space** | `O(n)` — stack storage |

## Example
```
Input:
  3
  010
  000
  010
Output: 1  (Person 1 is the celebrity)
```

## How to Run
```bash
javac celibrity_problem.java
java celibrity_problem
```
