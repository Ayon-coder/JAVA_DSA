# Palindromic Substrings

This program accepts a string and prints all of its substrings that are palindromes.

## Problem Statement
Given a string, find and print every contiguous substring that reads the same forwards and backwards.

## Approach
1. Two nested loops are used to select the starting index `i` and ending index `j` of all possible contiguous substrings.
2. The generated `substring(i, j)` is passed to a helper function `palindrom()`.
3. The helper function creates a reversed copy of the substring using `StringBuilder.reverse()` and checks if it is equal to the original substring.
4. If it matches, the substring is recognized as a palindrome and printed to the console.

## Example
**Input**
```
abccbc
```

**Output**
```
a
b
c
cc
c
cbc
b
c
```
