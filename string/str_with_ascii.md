# String with ASCII Difference

This program transforms a given string by inserting the ASCII difference between adjacent characters.

## Problem Statement
Given a string, insert the difference of the ASCII values of every two consecutive characters between them in the new string.

## Approach
1. Create a `StringBuilder` for efficient string manipulation.
2. Use two pointers `i` and `j`, where `j = i + 1`, to traverse the string.
3. For each pair of consecutive characters, append the character at `i` to the `StringBuilder`, followed by the integer difference of their ASCII values: `s.charAt(j) - s.charAt(i)`.
4. Append the final character of the string after the loop completes.
5. Convert the builder to a string and print.

## Example
**Input**
```
abdgca
```

**Output**
```
a1b2d3g-4c-2a
```
