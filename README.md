# Student Grade Calculator

A beginner-friendly Java console application that calculates the total marks, percentage, grade, and pass/fail result for five subjects.

## Features

* Takes marks for five subjects
* Calculates total marks
* Calculates percentage
* Assigns a grade based on percentage
* Checks pass/fail status
* Uses Java Scanner for user input
* Simple and easy-to-understand console interface

## Technologies Used

* Java
* Java Scanner
* Conditional Statements (if-else)

## Subjects

The application takes marks for:

* Maths
* Java
* DSA
* DBMS

## Grade System

| Percentage | Grade |
| ---------- | ----- |
| 90% - 100% | A+    |
| 80% - 89%  | A     |
| 70% - 79%  | B     |
| 60% - 69%  | C     |
| 50% - 59%  | D     |
| Below 50%  | F     |

A student is considered **FAIL** if any subject has marks below 35.

## How to Run

### 1. Clone or download the project

Download the project files to your computer.

### 2. Open the project in VS Code

Open the project folder in Visual Studio Code.

### 3. Open the terminal

Open the VS Code terminal and run:

```bash
javac StudentGradeCalculator.java
```

### 4. Run the program

```bash
java StudentGradeCalculator
```

## Sample Output

```text
===== Student Grade Calculator =====

Enter marks for Maths: 78
Enter marks for Java: 85
Enter marks for DSA: 72
Enter marks for DBMS: 81

===== Result =====
Total Marks: 385.0 / 500
Percentage: 77.0%
Grade: B
Result: PASS
What I Learned

While building this project, I practiced:

Taking user input using Scanner
Declaring and using variables
Performing arithmetic calculations
Using conditional statements
Working with if-else and else-if
Displaying formatted output
Building a simple Java console application
Future Improvements

Some possible improvements for future versions:

Add validation for marks between 0 and 100
Allow the user to enter any number of subjects
Add a graphical user interface
Store student records
Add multiple student support
Author

Dev Shah

B.Tech Computer Science Engineering Student