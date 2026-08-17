# Day 7 - Advanced Pattern Printing

## 📚 Topics Covered

- Nested Loops
- Spaces in Patterns
- Right-Aligned Patterns
- Pyramid Patterns
- Inverted Pyramid
- Diamond Pattern
- Hollow Patterns
- Butterfly Pattern
- Number Pyramid
- Palindrome Number Pyramid
- Floyd's Triangle
- Pattern Dry Runs
- Logic Building

## 📂 Files

- RightTriangle.java
- Pyramid.java
- InvertedPyramid.java
- Diamond.java
- HollowSquare.java
- HollowTriangle.java
- Butterfly.java
- NumberPyramid.java
- PalindromeNumberPyramid.java
- FloydTriangle.java
- PracticePatterns.java

## 🎯 Patterns Covered

### 1. Right-Aligned Triangle

```text
    *
   **
  ***
 ****
*****
```

### 2. Pyramid

```text
    *
   ***
  *****
 *******
*********
```

### 3. Inverted Pyramid

```text
*********
 *******
  *****
   ***
    *
```

### 4. Diamond

```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### 5. Hollow Square

```text
*****
*   *
*   *
*   *
*****
```

### 6. Hollow Triangle

```text
*
**
* *
*  *
*****
```

### 7. Butterfly

```text
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

### 8. Number Pyramid

```text
    1
   123
  12345
 1234567
123456789
```

### 9. Palindrome Number Pyramid

```text
    1
   121
  12321
 1234321
123454321
```

### 10. Floyd's Triangle

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

## 🧠 Pattern Solving Strategy

Before writing code, identify:

1. Number of rows
2. Number of spaces
3. Number of stars/numbers
4. What should be printed
5. How the pattern changes between rows

### Important Rules

**Outer Loop → Rows**

**Inner Loop → Columns / Elements**

For centered patterns:

```text
Spaces = n - row
```

For a pyramid:

```text
Stars = 2 * row - 1
```

For a decreasing pyramid:

```text
Stars = 2 * (n - row) + 1
```

---

## 📖 Resources

- GeeksforGeeks

## 🎯 Practice Goal

Don't memorize these programs.
Try to:

- Dry-run each pattern
- Change the value of `n`
- Modify the symbols
- Create variations
- Rebuild patterns without looking at the solution

## ✅ Status

Completed ✔️
