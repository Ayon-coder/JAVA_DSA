# Rotate Array (`rotate_array.java`)

## Description
Rotates an array to the right by `k` steps using an optimized algorithm.

## How it Works
Uses the mathematical **three-step reversal algorithm**:
1. Reverses the first part of the array (`0` to `length - k - 1`).
2. Reverses the second part of the array (`length - k` to `length - 1`).
3. Reverses the entire combined array (`0` to `length - 1`).
*Note: Depending on $k$, it effectively rotates the array.*
