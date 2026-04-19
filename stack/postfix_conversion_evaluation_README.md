# postfix_conversion_evaluation.java

## Problem
Given a **postfix expression**, simultaneously:
1. **Evaluate** it to get the numeric result.
2. **Convert** it to **infix** notation.
3. **Convert** it to **prefix** notation.

## Approach
1. Use three stacks:
   - `temp` — integer stack for evaluation
   - `infix` — StringBuilder stack for infix conversion
   - `prefix` — StringBuilder stack for prefix conversion
2. Traverse the postfix expression:
   - **Operand (digit):** Push the value onto all three stacks.
   - **Operator:** Pop two elements from each stack:
     - **Evaluate:** `calculate(op2, op1, operator)` and push result.
     - **Infix:** Build `(val2 op val1)` and push.
     - **Prefix:** Build `op val2 val1` and push.
3. Final answers are on top of each stack.

## Complexity
| | Value |
|---|---|
| **Time** | `O(n)` |
| **Space** | `O(n)` |

## Example
```
Input:  23+4*
Output:
  Postfix evaluation: 20
  Infix:  ((2+3)*4)
  Prefix: *+234
```

## How to Run
```bash
javac postfix_conversion_evaluation.java
java postfix_conversion_evaluation
```
