# Toggle Case

This program toggles the case of every character in a specified string. Lowercase characters become uppercase, and uppercase characters become lowercase.

## Problem Statement
Given a string consisting of alphabetic characters, change all lowercase letters to uppercase and all uppercase letters to lowercase.

## Approach
1. Iterate over every character in the string.
2. Check if the character `ch` falls in the lowercase range `a` to `z` or uppercase range `A` to `Z`.
3. If passing `a-z`, compute its uppercase equivalent by adding the ascii difference `'A' - 'a'`: `(char) ('A' + ch - 'a')`.
4. If passing `A-Z`, similarly compute its lowercase equivalent: `(char) ('a' + ch - 'A')`.
5. Append all computed characters into a `StringBuilder` and print the resulting string.

## Example
**Input**
```
pepCODing
```

**Output**
```
PEPcodING
```
