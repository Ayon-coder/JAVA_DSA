# infix_conversion.java

## Problem
Convert an **infix expression** simultaneously to both **prefix** and **postfix** notation in a single pass.

## Approach
1. Use three stacks:
   - `operators` — for operator characters
   - `postfix` — for building postfix sub-expressions
   - `pretfix` — for building prefix sub-expressions
2. Traverse the expression:
   - **Operand (digit):** Push onto both `postfix` and `pretfix` stacks.
   - **`(`:** Push onto operator stack.
   - **Operator (`+`, `-`, `*`, `/`):** Pop operators with higher or equal precedence, building both prefix and postfix expressions. Then push the current operator.
   - **`)`:** Pop and build until `(` is found.
3. Pop remaining operators and build final expressions.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  (2+3)*4
Output:
  Postfix: 23+4*
  Prefix:  *+234
```

## How to Run
```bash
javac infix_conversion.java
java infix_conversion
```
