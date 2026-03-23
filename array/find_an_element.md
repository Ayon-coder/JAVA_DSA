# Find an Element (`find_an_element.java`)

## Description
Implements the **Recursive Binary Search** algorithm to find the exact index of an element in a sorted array.

## How it Works
1. Recursively checks the middle element.
2. If `arr[mid] == key`, it returns the index `mid`.
3. If `arr[mid] < key`, the search continues in the right half (`mid + 1` to `high`).
4. Else, the search continues in the left half (`low` to `mid - 1`).
5. Returns `-1` if the element does not exist.
