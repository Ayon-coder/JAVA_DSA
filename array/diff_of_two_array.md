# Difference of Two Arrays (`diff_of_two_array.java`)

## Description
Subtracts two large numbers represented as arrays where each element is a single digit. It assumes the first array represents the larger number.

## How it Works
1. Uses three pointers starting from the rightmost (least significant) digits of both arrays.
2. Subtracts digits and manages **borrowing** (represented as `c` or carry).
3. If the top digit + carry is less than the bottom digit, it adds 10 to the top digit and sets the next carry to `-1`.
4. Finally, skips over any leading zeroes to print the result properly.
