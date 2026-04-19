# next_greater_ele_right.java

## Problem
For each element in an array, find the **Next Greater Element (NGE) to its right**. If no greater element exists to the right, output `-1`.

## Approach
1. Traverse the array from **right to left**.
2. Maintain a stack of elements seen so far.
3. For each element `arr[i]`:
   - Pop all elements from the stack that are ≤ `arr[i]` (they can't be NGE for any future element either).
   - If the stack is non-empty, the top is the NGE.
   - If the stack is empty, NGE = `-1`.
   - Push `arr[i]` onto the stack.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — each element is pushed/popped at most once |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 5, 9, 3, 1, 12, 6, 8, 7]
Output: [5, 9, 12, 12, 12, -1, 8, -1, -1]
```

## How to Run
```bash
javac next_greater_ele_right.java
java next_greater_ele_right
```
