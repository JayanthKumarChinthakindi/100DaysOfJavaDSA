Day 12 — Revision & Practice

Day 12 focuses on revising and strengthening the Java fundamentals covered during Days 1–11 through three practical programs.

The goal is to combine multiple concepts and improve problem-solving and logic-building skills.

📚 Topics Revised
Variables
Data Types
Operators
Type Casting
User Input using Scanner
Conditional Statements
if, if-else, else-if
switch
Ternary Operator
for, while, do-while loops
break and continue
Nested Loops
Pattern Printing
Methods
Parameters and Return Types
Scope
Static Methods
1D Arrays
2D Arrays
Matrix Operations
Strings
StringBuilder

📁 Project Structure
Day-12/
├── StudentPerformanceAnalyzer.java
├── MatrixAnalyzer.java
├── StringAnalyzer.java
└── README.md

1. Student Performance Analyzer
   📌 Description

A Java program that accepts marks for five subjects and analyzes the student's overall performance.

Subjects
English
Mathematics
Java
DSA
Computer Science
✨ Features
Accept marks using Scanner
Validate marks between 0 and 100
Calculate total marks
Calculate average marks
Find highest mark
Find lowest mark
Count passed subjects
Count failed subjects
Calculate overall grade
Display pass/fail result

|  Average | Grade |
| -------: | :---: |
|   90–100 |   A   |
|    80–89 |   B   |
|    70–79 |   C   |
|    60–69 |   D   |
|    50–59 |   E   |
| Below 50 |   F   |

A subject is considered passed when marks are 40 or above.
🧠 Concepts Used
Scanner
Variables
Arrays
Loops
if-else
Methods
Type Casting

2. Matrix Analyzer
   📌 Description

A Java program that accepts a matrix from the user and performs different matrix operations.

✨ Features
Accept matrix input
Display matrix
Calculate total sum
Find maximum element
Find minimum element
Calculate row sums
Calculate column sums
Display main diagonal
Display secondary diagonal
Calculate diagonal sums
Search for an element
Detect whether the matrix is square
🧠 Concepts Used
2D Arrays
Nested Loops
Methods
Scanner
Searching
Conditional Statements
Matrix Operations

Example Matrix
1 2 3
4 5 6
7 8 9

Expected Results
Total Sum: 45
Maximum: 9
Minimum: 1
Main Diagonal:
1 5 9
Secondary Diagonal:
3 5 7

3. String Analyzer
   📌 Description

A Java program that accepts a sentence and performs multiple String operations.

✨ Features
Display original String
Calculate String length
Count vowels
Count consonants
Count digits
Count spaces
Count words
Convert to uppercase
Convert to lowercase
Reverse the String
Remove spaces
Replace vowels
Find the longest word
Check palindrome
Find the first non-repeating character
🧠 Concepts Used
String
StringBuilder
Loops
Methods
charAt()
length()
replace()
split()
equalsIgnoreCase()

🧠 Problem-Solving Approach
For each program, follow this process:
Understand the Problem
↓
Identify Input
↓
Identify Expected Output
↓
Break Into Smaller Tasks
↓
Design the Logic
↓
Write Java Code
↓
Test With Different Inputs
↓
Debug Errors
↓
Refactor Using Methods
↓
Analyze Complexity
↓
Push to GitHub

⏱️ Time Complexity

Student Performance Analyzer
For n subjects:
Time Complexity: O(n)
Space Complexity: O(n)

Matrix Analyzer
For an m × n matrix:
Time Complexity: O(m × n)
Space Complexity: O(m × n)

String Analyzer
For a String of length n:
Most operations:
Time Complexity: O(n)
The first non-repeating character implementation uses nested loops:
Time Complexity: O(n²)

📖 Learning Resources
For theory and concept revision:
GeeksforGeeks

✅ Day 12 Status
Completed — Revision & Practice
