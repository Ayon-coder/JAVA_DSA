# sliding_window.java

## Problem
Find the **maximum element in every sliding window of size `k`** as it moves across the array from left to right.

## Approach
1. Precompute the **Next Greater Element (index-based)** array using a monotonic stack (right-to-left).
2. For each window starting at index `i`:
   - Start with index `j` (maintained across iterations).
   - Jump through the NGE chain: while `next_greater[j] < i + k`, move `j = next_greater[j]`.
   - `arr[j]` is the maximum for the current window.
3. The NGE chain ensures amortized `O(1)` per window.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — amortized via NGE preprocessing |
| **Space** | `O(n)` |

## Example
```
Input:  [2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6], k = 3
Output: [9, 9, 8, 8, 12, 12, 14, 14, 32, 32, 32, 19, 19, 19, 12]
```

## How to Run
```bash
javac sliding_window.java
java sliding_window
```
