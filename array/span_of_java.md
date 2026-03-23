# Span of Array (`span_of_java.java`)

## Description
Calculates the **span** of an array, which is defined strictly as the difference between the maximum and minimum elements present in the array.

## How it Works
1. Initializes `max` to a very small number (`Integer.MIN_VALUE`) and `min` to a very large number (`Integer.MAX_VALUE`).
2. Iterates through the array in a single pass to find the true `max` and `min` values.
3. Returns `max - min`.
