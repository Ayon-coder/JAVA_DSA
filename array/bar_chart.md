# Bar Chart (`bar_chart.java`)

## Description
Takes an array of integers representing heights and visualizes them as a vertical bar chart using asterisks in the console.

## How it Works
1. Finds the maximum element in the array to determine the highest bar.
2. Iterates from the `max` value down to `1` (representing each row/floor).
3. For each row, iterates through the array. If the array value is $\ge$ the current row, it prints an `*`; otherwise, it prints a blank space `\t`.
