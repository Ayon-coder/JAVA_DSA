# next_smaller_element.java

## Problem
For each element in an array, find the **Next Smaller Element (NSE) to its right**. If no smaller element exists, output `-1`.

## Approach
1. Traverse the array from **right to left**.
2. Maintain a stack of elements.
3. For each element `arr[i]`:
   - Pop all elements from the stack that are ≥ `arr[i]`.
   - If the stack is non-empty, the top is the NSE.
   - If the stack is empty, NSE = `-1`.
   - Push `arr[i]` onto the stack.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — each element is pushed/popped at most once |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 5, 9, 3, 1, 12, 6, 8, 7]
Output: [1, 3, 3, 1, -1, 6, -1, 7, -1]
```

## How to Run
```bash
javac next_smaller_element.java
java next_smaller_element
```
