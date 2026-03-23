# Last Index (`last_index.java`)

## Description
Uses a slightly modified binary search algorithm to efficiently find the **last occurrence** (highest index) of a target key in a sorted array that may contain duplicate values.

## How it Works
1. Performs an iterative binary search.
2. When the key is matched (`arr[mid] == key`), instead of returning immediately, the algorithm records the `mid` index and continues searching in the right half (`low = mid + 1`) to find any subsequent occurrences.
