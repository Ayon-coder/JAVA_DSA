# nge_from_left.java

## Problem
For each element in an array, find the **Next Greater Element using a left-to-right traversal** (index-based approach). Each element gets assigned the next value to its right that is strictly greater.

## Approach
1. Traverse **left to right**, pushing indices onto the stack.
2. For each index `i`, while `arr[i] > arr[st.peek()]`:
   - Pop the index from the stack.
   - Record `arr[i]` as the NGE for that popped index.
3. After full traversal, remaining indices in the stack have no NGE → set to `-1`.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 5, 9, 3, 1, 12, 6, 8, 7]
Output: [5, 9, 12, 12, 12, -1, 8, -1, -1]
```

## How to Run
```bash
javac nge_from_left.java
java nge_from_left
```
