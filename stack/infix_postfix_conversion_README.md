# infix_postfix_conversion.java

## Problem
Convert an **infix expression** to **postfix** (Reverse Polish Notation).

## Approach
1. Use an operator stack with precedence rules.
2. Traverse the expression:
   - **Operand (digit):** Append directly to the postfix output.
   - **`(`:** Push onto the operator stack.
   - **`)`:** Pop operators and append to output until `(` is found.
   - **Operator:** Pop and append operators with higher or equal precedence, then push the current operator.
3. Pop all remaining operators to the output.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  2+3*4
Output: 234*+

Input:  (2+3)*4
Output: 23+4*
```

## How to Run
```bash
javac infix_postfix_conversion.java
java infix_postfix_conversion
```
