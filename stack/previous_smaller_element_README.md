# previous_smaller_element.java

## Problem
For each element in an array, find the **Previous Smaller Element (PSE)** — the nearest element to its **left** that is strictly smaller. If none exists, output `-1`.

## Approach
1. Traverse the array from **left to right**.
2. Maintain a stack of elements.
3. For each element `arr[i]`:
   - Pop all elements from the stack that are ≥ `arr[i]`.
   - If the stack is non-empty, the top is the PSE.
   - If the stack is empty, PSE = `-1`.
   - Push `arr[i]` onto the stack.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 5, 9, 3, 1, 12, 6, 8, 7]
Output: [-1, 2, 5, 2, -1, 1, 1, 6, 6]
```

## How to Run
```bash
javac previous_smaller_element.java
java previous_smaller_element
```
