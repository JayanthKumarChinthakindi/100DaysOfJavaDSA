# Day 9 - 1D Arrays in Java

## 📚 Topics Covered

- Introduction to Arrays
- Array Declaration
- Array Initialization
- Array Indexing
- Accessing Elements
- Updating Elements
- Array Length
- Array Traversal
- Enhanced For Loop
- Taking Array Input
- Sum and Average
- Maximum and Minimum
- Linear Search
- Reverse Array
- Counting Elements
- Frequency
- Sorted Array Check

## 📂 Files

### ArrayDemo.java

Demonstrates:

- Array declaration
- Array initialization
- Accessing elements
- Updating elements
- Array length

### ArrayInputDemo.java

Demonstrates:

- Taking array size from user
- Taking array elements using Scanner
- Printing the array

### ArrayTraversalDemo.java

Demonstrates:

- Traditional for loop
- Enhanced for loop
- Index-based traversal

### ArrayOperations.java

Implements:

- Sum
- Average
- Maximum
- Minimum
- Even count
- Odd count

### LinearSearch.java

Demonstrates:

- Linear search
- Finding an element
- Returning the element index

### ReverseArray.java

Demonstrates:

- Printing an array in reverse
- Creating a reversed array

## 🧠 Important Array Concept

Java arrays use zero-based indexing.
Example:
Array → 10 20 30 40 50
Index → 0 1 2 3 4
First index:
0
Last index:
array.length - 1

## 🔄 Array Traversal

Traditional loop:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Enhanced for loop:

```java
for (int value : arr) {
    System.out.println(value);
}
```

Use the traditional loop when the index is required.

## 🔍 Linear Search

Linear Search checks each element one by one.

Example:
10 20 30 40 50
Target = 30
10 → Check
20 → Check
30 → Found

Time Complexity:
O(n)

## 📊 Common Array Operations

| Operation       | Complexity |
| --------------- | ---------: |
| Access by index |       O(1) |
| Update by index |       O(1) |
| Traversal       |       O(n) |
| Linear Search   |       O(n) |

## 🎯 Learning Goal

By the end of Day 9, I should be able to:

- Create and initialize arrays.
- Understand zero-based indexing.
- Access and update elements.
- Traverse arrays.
- Take array input.
- Find sum and average.
- Find maximum and minimum.
- Search for an element.
- Reverse an array.
- Solve basic array problems.
- Use methods to organize array operations.

## 📖 Resources

- GeeksforGeeks

## ✅ Status

Completed ✔️
