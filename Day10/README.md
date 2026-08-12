# Day 10 - 2D Arrays & Matrix Operations

## 📚 Topics Covered

- 2D Arrays
- Matrix Representation
- Rows and Columns
- Array Indexing
- Matrix Traversal
- Nested Loops
- Matrix Input
- Row Sum
- Column Sum
- Maximum and Minimum
- Even and Odd Count
- Main Diagonal
- Secondary Diagonal
- Matrix Addition
- Matrix Transpose
- Matrix Search
- Square Matrix
- Basic Matrix Problem Solving

---

## 📂 Files

### TwoDArrayDemo.java

Demonstrates:

- 2D array declaration
- Initialization
- Accessing elements
- Updating elements
- Number of rows
- Number of columns

### MatrixInputDemo.java

Demonstrates:

- Taking rows from user
- Taking columns from user
- Taking matrix elements using Scanner
- Printing the matrix

### MatrixTraversal.java

Demonstrates:

- Nested for loops
- Enhanced for loops
- Row and column traversal

### MatrixOperations.java

Implements:

- Total sum
- Average
- Maximum
- Minimum
- Even count
- Odd count
- Row sums
- Column sums

### DiagonalOperations.java

Implements:

- Main diagonal
- Secondary diagonal
- Main diagonal sum
- Secondary diagonal sum

### MatrixAddition.java

Demonstrates:

- Adding two matrices
- Creating a result matrix
- Printing the result

### MatrixTranspose.java

Demonstrates:

- Matrix transpose
- Converting rows into columns

### PracticePrograms.java

Contains multiple practice problems:

1. Print matrix
2. Find total sum
3. Find maximum
4. Find minimum
5. Count even numbers
6. Count odd numbers
7. Row sums
8. Column sums
9. Main diagonal
10. Secondary diagonal
11. Main diagonal sum
12. Secondary diagonal sum
13. Search element
14. Check square matrix
15. Find largest row sum

## 🧠 Important Concept

For a 2D array:

```java
matrix[row][column]
```

The first index represents the row.
The second index represents the column.
Example:

```text
        Column
        0   1   2
      ┌───┬───┬───┐
Row 0 │10 │20 │30 │
      ├───┼───┼───┤
Row 1 │40 │50 │60 │
      ├───┼───┼───┤
Row 2 │70 │80 │90 │
      └───┴───┴───┘
```

## 🔄 Matrix Traversal

The standard approach:

```java
for (int row = 0; row < matrix.length; row++) {

    for (int col = 0; col < matrix[row].length; col++) {

        System.out.println(matrix[row][col]);
    }
}
```

### Remember

```text
Outer Loop → Rows
Inner Loop → Columns
```

## 🔺 Main Diagonal

For a square matrix:

```text
1 2 3
4 5 6
7 8 9
```

Main diagonal:

```text
1 5 9
```

Condition:

```text
row == column
```

## 🔻 Secondary Diagonal

For:

```text
1 2 3
4 5 6
7 8 9
```

Secondary diagonal:

```text
3 5 7
```

Formula:

```text
column = n - 1 - row
```

## ➕ Matrix Addition

Two matrices can be added when they have the same dimensions.
Example:

```text
1 2     5 6
3 4  +  7 8
=>
6  8
10 12
```

Formula:

```text
result[row][col] =
    first[row][col] + second[row][col]
```

## 🔄 Matrix Transpose

Transpose changes:

```text
Rows → Columns
Columns → Rows
```

Example:

```text
1 2 3
4 5 6
```

Transpose:

```text
1 4
2 5
3 6
```

Core logic:

```java
transpose[col][row] = matrix[row][col];
```

## 📊 Time Complexity

For an `m × n` matrix:
| Operation | Complexity |
|---|---:|
| Access element | O(1) |
| Traverse matrix | O(m × n) |
| Search | O(m × n) |
| Matrix addition | O(m × n) |
| Transpose | O(m × n) |
For an `n × n` matrix:

```text
O(n²)
```

## 🎯 Learning Goal

By the end of Day 10, I should be able to:

- Create 2D arrays.
- Understand rows and columns.
- Traverse matrices using nested loops.
- Take matrix input.
- Calculate row and column sums.
- Find maximum and minimum.
- Work with diagonals.
- Add matrices.
- Transpose matrices.
- Search within a matrix.
- Solve basic matrix problems.
- Use methods to organize matrix operations.

## 📖 Resources

- GeeksforGeeks

## ✅ Status

Completed ✔️
