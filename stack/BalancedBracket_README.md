# BalancedBracket.java

## Problem
Given a string expression containing brackets `()`, `{}`, `[]`, determine whether the brackets are **balanced** (every opening bracket has a matching closing bracket in the correct order).

## Approach
1. Maintain two lists: one for opening brackets and one for closing brackets.
2. Traverse the expression character by character:
   - If the character is an **opening bracket**, push it onto the stack.
   - If the character is a **closing bracket**, pop from the stack and check the ASCII difference between the closing and opening bracket.
     - `()` → difference = 1
     - `{}` and `[]` → difference = 2
   - If the difference doesn't match, return `false`.
3. After traversal, if the stack is non-empty, return `false`.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` — single pass |
| **Space** | `O(n)` — stack storage |

## Example
```
Input:  {[()]}
Output: true

Input:  {[(])}
Output: false
```

## How to Run
```bash
javac BalancedBracket.java
java BalancedBracket
```
