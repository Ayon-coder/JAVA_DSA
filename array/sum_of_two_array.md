# Sum of Two Arrays (`sum_of_two_array.java`)

## Description
Computes the mathematical addition of two large numbers represented as arrays (where each element contains a single digit).

## How it Works
1. Uses two pointers starting from the rightmost end of both arrays.
2. Calculates the sum natively along with track of the `carry`.
3. Populates a new `new_arr` right-to-left.
4. Accounts for extra carries after arrays are fully processed.
5. Ignores any leading `0`s before printing the final array output.
