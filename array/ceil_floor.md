# Ceil and Floor (`ceil_floor.java`)

## Description
Uses binary search to find the **ceiling** and **floor** values for a given key in a sorted array.
- **Ceiling**: The smallest element in the array that is greater than or equal to the key.
- **Floor**: The largest element in the array that is less than or equal to the key.

## How it Works
1. Implements standard `Binary Search`.
2. If the key is found, both `ceil` and `floor` are equal to the key itself.
3. If the loop ends without finding the key, the `low` pointer indicates the `ceil` placement, and the `high` pointer indicates the `floor`.
