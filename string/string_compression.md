# String Compression

This program accepts a string and performs two different types of string compression.

## Problem Statements
- **Compression 1:** Removing consecutive duplicate characters.
- **Compression 2:** Replacing consecutive duplicate characters with a single instance of the character followed by the count of its occurrences (if strictly greater than 1).

## Approach
1. Iterate over the string character by character.
2. Compare the current character with the preceding one.
3. For the first compression type `compression_1`, append a character to the `StringBuilder` only if it is different from the previous character.
4. For the second compression type `compression_2`, maintain a frequency `count`. Once a character is different from the preceding one, append the preceding character and its count (if `count != 1`), and then reset the count to 1.

## Example
**Input**
```
aaabbbccdee
```

**Output**
```
abcde
a3b3c2de2
```
