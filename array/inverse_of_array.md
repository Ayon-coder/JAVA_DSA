# Inverse of an Array (`inverse_of_array.java`)

## Description
Computes the mathematical inverse of a permutation array. If an array has a value `v` at index `i`, its inverted array will hold the value `i` at index `v`.

## How it Works
1. Creates a new array `new_arr` of the same size.
2. Loops through the original array: `new_arr[arr[i]] = i;`.
3. Prints the resulting inverted array.
