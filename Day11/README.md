# Day 11 - Strings & StringBuilder

## 📚 Topics Covered

- String Basics
- String Creation
- String Indexing
- `length()`
- `charAt()`
- String Traversal
- String Concatenation
- `concat()`
- `equals()`
- `equalsIgnoreCase()`
- `==` vs `equals()`
- `substring()`
- `contains()`
- `indexOf()`
- `lastIndexOf()`
- `startsWith()`
- `endsWith()`
- `trim()`
- `toUpperCase()`
- `toLowerCase()`
- `replace()`
- String Immutability
- StringBuilder
- `append()`
- `insert()`
- `delete()`
- `deleteCharAt()`
- `setCharAt()`
- `replace()`
- `reverse()`
- `toString()`

---

## 📂 Files

### StringDemo.java

Demonstrates:

- Creating Strings
- String indexing
- String length
- Concatenation
- String immutability

### StringMethodsDemo.java

Demonstrates common String methods:

- `length()`
- `charAt()`
- `trim()`
- `toUpperCase()`
- `toLowerCase()`
- `substring()`
- `contains()`
- `startsWith()`
- `endsWith()`
- `indexOf()`
- `lastIndexOf()`
- `replace()`
- `concat()`

### StringComparisonDemo.java

Demonstrates:

- `==`
- `equals()`
- `equalsIgnoreCase()`
- `compareTo()`
- `compareToIgnoreCase()`

### StringTraversalDemo.java

Demonstrates:

- Forward traversal
- Reverse traversal
- Character-by-character processing

### StringOperations.java

Implements:

- Count vowels
- Count consonants
- Count digits
- Count spaces
- Reverse String
- Palindrome check
- Character frequency
- Remove spaces
- Replace vowels

### StringBuilderDemo.java

Demonstrates:

- Creating StringBuilder
- `append()`
- `insert()`
- `setCharAt()`
- `reverse()`
- `length()`

### StringBuilderOperations.java

Demonstrates:

- `append()`
- `insert()`
- `delete()`
- `deleteCharAt()`
- `setCharAt()`
- `replace()`
- `reverse()`
- `toString()`

### PracticePrograms.java

Contains practice programs for:

1. Count vowels
2. Count consonants
3. Count digits
4. Count spaces
5. Reverse String
6. Palindrome check
7. Character frequency
8. Remove spaces
9. Replace vowels
10. Count words
11. Find longest word
12. Anagram check
13. First non-repeating character

---

# 🧠 Important Concepts

## String Indexing

Example:

```text
String: Java

Index:   0  1  2  3
         J  a  v  a
```

Access a character:

```java
str.charAt(0);
```

---

## String Length

For Strings:

```java
str.length();
```

For arrays:

```java
arr.length;
```

Remember the difference.

---

# ⚠️ `==` vs `equals()`

Use:

```java
str1.equals(str2);
```

for comparing String content.

Avoid using:

```java
str1 == str2;
```

when your goal is content comparison.

`==` compares references, while `equals()` compares String content.

---

# 🔒 String Immutability

Strings are immutable in Java.

Example:

```java
String name = "Java";

name.concat(" DSA");

System.out.println(name);
```

The original String remains:

```text
Java
```

To keep the new value:

```java
name = name.concat(" DSA");
```

---

# 🛠️ StringBuilder

StringBuilder is mutable and useful when a String needs frequent modifications.

Example:

```java
StringBuilder sb =
        new StringBuilder("Java");

sb.append(" DSA");
```

Result:

```text
Java DSA
```

---

## Common StringBuilder Methods

```java
sb.append("Java");

sb.insert(0, "Learn ");

sb.delete(0, 6);

sb.deleteCharAt(0);

sb.setCharAt(0, 'J');

sb.reverse();

String result = sb.toString();
```

---

# 📊 String vs StringBuilder

| Feature      | String             | StringBuilder            |
| ------------ | ------------------ | ------------------------ |
| Mutable      | No                 | Yes                      |
| Modification | Creates new object | Modifies existing object |
| `append()`   | No                 | Yes                      |
| `insert()`   | No                 | Yes                      |
| `delete()`   | No                 | Yes                      |
| `reverse()`  | No                 | Yes                      |
| Common Use   | Fixed text         | Frequently modified text |

---

# 🔥 Important DSA Pattern

A common String traversal pattern:

```java
for (int i = 0; i < str.length(); i++) {

    char ch = str.charAt(i);

    // Process character
}
```

This pattern is used in many problems involving:

- Character counting
- Frequency
- Palindromes
- Vowels
- Consonants
- Searching
- String validation

---

# 🎯 Learning Goals

By the end of Day 11, I should be able to:

- Understand String indexing.
- Traverse Strings.
- Compare Strings correctly.
- Use common String methods.
- Understand String immutability.
- Use StringBuilder for modifications.
- Reverse Strings.
- Check palindromes.
- Count characters.
- Check anagrams.
- Find unique characters.
- Solve basic String DSA problems.

---

# 📖 Resources

- GeeksforGeeks

## ✅ Status

Completed ✔️
ss
