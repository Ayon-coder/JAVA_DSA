# StockSpan.java

## Problem
Given daily stock prices, compute the **stock span** for each day — the number of consecutive previous days (including today) where the price was less than or equal to today's price.

## Approach
1. Use a **Previous Greater Element (index-based)** pattern.
2. Traverse from **right to left**, pushing indices onto the stack.
3. For each popped index `idx`, the span = `idx - i` (distance to its previous greater element).
4. Elements remaining in the stack have no previous greater element, so span = `idx + 1`.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]
```

## How to Run
```bash
javac StockSpan.java
java StockSpan
```
