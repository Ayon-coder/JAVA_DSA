# duplicate_bracket.java

## Problem
Given a balanced expression, check if it contains any **duplicate/redundant brackets** — brackets that enclose no operator or meaningful sub-expression.

## Approach
1. Traverse the expression character by character.
2. Push every character onto the stack **except** `)`.
3. When `)` is encountered:
   - If the top of the stack is `(`, it means the pair encloses nothing → **duplicate found**, return `true`.
   - Otherwise, pop elements until `(` is found and removed.
4. If the full traversal completes with no duplicate detected, return `false`.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  ((a+b))
Output: true   (outer parentheses are redundant)

Input:  (a+b)
Output: false
```

## How to Run
```bash
javac duplicate_bracket.java
java duplicate_bracket
```
