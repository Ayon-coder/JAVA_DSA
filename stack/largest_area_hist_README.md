# largest_area_hist.java

## Problem
Given an array representing bar heights in a histogram, find the **largest rectangular area** that can be formed.

## Approach
1. Compute the **Previous Smaller Element index (PSE)** for each bar using a monotonic stack (right-to-left traversal). If no PSE exists, set to `-1`.
2. Compute the **Next Smaller Element index (NSE)** for each bar using a monotonic stack (left-to-right traversal). If no NSE exists, set to `arr.length`.
3. For each bar at index `i`:
   - Width = `NSE[i] - PSE[i] - 1`
   - Area = `width * arr[i]`
4. Return the maximum area across all bars.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — two linear passes |
| **Space** | `O(n)` — stack + result arrays |

## Example
```
Input:  [6, 2, 5, 4, 5, 1, 6]
Output: 12
```

## How to Run
```bash
javac largest_area_hist.java
java largest_area_hist
```
