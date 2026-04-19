# infix_evaluation.java

## Problem
Evaluate an **infix expression** with single-digit operands directly, without first converting to postfix/prefix.

## Approach
1. Use two stacks:
   - `oprnd` — operand stack (integers)
   - `oprtr` — operator stack (characters)
2. Traverse the expression:
   - **Digit:** Push `(char - '0')` onto the operand stack.
   - **Operator:** While the top operator has higher or equal precedence, pop two operands and the operator, evaluate, push result. Then push the new operator.
   - **`(`:** Push onto operator stack.
   - **`)`:** Evaluate until `(` is found and removed.
3. After traversal, evaluate remaining operators.
4. The final result is on top of the operand stack.

## Supported Operators
`+`, `-`, `*`, `/`

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  2+3*4
Output: 14

Input:  (2+3)*4
Output: 20
```

## How to Run
```bash
javac infix_evaluation.java
java infix_evaluation
```
