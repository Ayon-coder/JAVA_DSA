# Subsets (`subsets.java`)

## Description
Generates and prints all possible **subsets** (or subsequences) of an array. The order of elements is preserved.

## How it Works
1. Calculates the total number of subsets, which is $2^n$ (`Math.powExact(2, arr.length)`).
2. Uses the binary representation of numbers from $0$ to $2^n - 1$ to decide whether an element should be included in the subset.
3. A `0` bit means exclusion (prints `-`), a `1` bit means inclusion (prints the number).
