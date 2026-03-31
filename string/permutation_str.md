# String Permutations

This program calculates all permutations of a given input string using an iterative approach based on factorial logic.

## Problem Statement
Given a string, find and print all possible permutations of its characters.

## Approach
1. Calculate the total number of permutations using the factorial of the string's length (`N!`).
2. Run a loop `N!` times to generate each permutation.
3. Inside the loop, string characters are picked using iterative division and remainder logic `(idx = i % len)`. 
4. The selected character is appended to a temporary string and removed from the original string builder for the next inner iteration.
5. Add each generated permutation to an `ArrayList` and print the resulting list.

## Example
**Input**
```
abc
```

**Output**
```
[abc, bac, cab, acb, bca, cba]
```
