# previous_greater_element.java

## Problem
For each element in an array, find the **Previous Greater Element (PGE)** — the nearest element to its **left** that is strictly greater. If none exists, output `-1`.

## Approach
1. Traverse the array from **left to right**.
2. Maintain a stack of elements.
3. For each element `arr[i]`:
   - Pop all elements from the stack that are ≤ `arr[i]`.
   - If the stack is non-empty, the top is the PGE.
   - If the stack is empty, PGE = `-1`.
   - Push `arr[i]` onto the stack.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 5, 9, 3, 1, 12, 6, 8, 7]
Output: [-1, -1, -1, 9, 3, -1, 12, 12, 8]
```

## How to Run
```bash
javac previous_greater_element.java
java previous_greater_element
```
