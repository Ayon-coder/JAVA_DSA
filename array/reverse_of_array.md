# Reverse of an Array (`reverse_of_array.java`)

## Description
Reverses the elements of an array internally (in-place) without using any extra memory allocation for another array.

## How it Works
1. Uses a highly efficient **two-pointer approach**.
2. Initializes `i = 0` (start) and `j = array.length - 1` (end).
3. Swaps `arr[i]` and `arr[j]`, then increments `i` and decrements `j`.
4. Continues swapping until `i` reaches the middle of the array (`length / 2`).
