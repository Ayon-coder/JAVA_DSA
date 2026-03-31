# Remove Prime Numbers from ArrayList

This program takes an arbitrary number of integers from the user, stores them in an `ArrayList`, and then removes all the numbers that are prime.

## Problem Statement
Given an array of integers, remove all prime numbers from the array and print the modified array.

## Approach
1. Read the number of elements and then iterate to add each element into an `ArrayList`.
2. Iterate through the `ArrayList`.
3. For each element, a helper function `isPrime()` checks if the number is prime. The `isPrime` function tests factors from `2` up to the square root of the number to optimize performance.
4. If the number is prime, it is removed from the list.
5. Print the resulting array.

## Example
**Input**
```
5
7 10 11 12 15
```

**Output**
```
Your new array is: 
[10, 12, 15]
```
