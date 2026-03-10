# Data Structures and Algorithms - Stack Operations

This repository contains solutions for 5 different algorithmic problems utilizing the Stack data structure in Java. 

## Repository Structure
- `Question1.java`: Bracket Balancer
- `Question2.java`: Reverse Polish Notation (RPN) Evaluator
- `Question3.java`: Chrono Stack Engine (Time Distortion Simulation)
- `Question4.java`: Stack Sorting using an auxiliary stack
- `Question5.java`: Momentum Sequence (Division by 2)
- `/report`: Directory containing the project report



## How to Compile and Run
To compile and run any of the programs, you need to have the Java Development Kit (JDK) installed. Open your terminal or command prompt, navigate to the directory containing the files, and use the following commands:

**Compilation:**
"```bash"
javac QuestionX.java
(Replace X with the question number, e.g., javac Question1.java)

Execution:
java QuestionX


## Details, Input Format, and Examples

### Question 1: Bracket Balancer
Checks if a sequence of brackets is balanced by splitting the string in half and comparing characters using two stacks.

Input Format: A single string containing bracket characters (e.g., (), [], {}).
Example Usage:
Input: {([])}
Output: Hasil: BALANCED (Seimbang) / NOT BALANCED (Tidak Seimbang)

Assumptions & Edge Cases:
- Assumes the input string length must be even (odd length immediately returns false).
- Note on logic: Based on the implementation, the program splits the string perfectly in half and pushes them to two separate stacks. This specific implementation expects a very rigid mirrored sequence. An empty string will not cause an error but will be considered balanced.



### Question 2: Reverse Polish Notation (RPN) Evaluator
Evaluates mathematical expressions written in Reverse Polish Notation using a Stack.

Input Format: No dynamic terminal input is required. The test cases are hardcoded in the main method using String arrays.
Example Usage:
Just run the program. It will print the evaluations for the predefined tokens:
Input 1: 2 1 + 3 *
Output 1: 9
Input 2: 4 13 5 / +
Output 2: 6

Assumptions & Edge Cases:
- Assumes the RPN expression is strictly valid.
- Assumes no division by zero (will throw ArithmeticException if it happens).
- Only handles basic integer arithmetic (+, -, *, /).



### Question 3: Chrono Stack Engine
Generates the optimal sequence of timeline operations (1, d, +) to achieve a specific target stack configuration from the bottom up, accounting for the + operation's side-effect (reducing the value of all underlying stack elements).

Input Format:
- An integer N representing the number of timeline elements.
- N space-separated integers representing the target values from bottom to top of the stack.

Example Usage:
Input: 
5
1 5 6 3 2
Output: 
1d+1+d+d+1d+1+d+d+1d+d+d+1+1d+d+1d+

Assumptions & Edge Cases:
- Assumes the input sequence consists of valid integers.
- Edge Case Handled: Deep nested operations cause massive integer accumulation. The code uses long instead of int to prevent Integer Overflow.



### Question 4: Stack Sorting
Sorts an array of integers in ascending order using only one main stack and one temporary/auxiliary stack.

Input Format: A single line containing space-separated integers.
Example Usage:
Input: 34 3 31 98 92 23
Output: 3 23 31 34 92 98

Assumptions & Edge Cases:
- Assumes inputs are perfectly space-separated integers. Non-integer inputs will throw a NumberFormatException.
- Duplicate numbers are supported and will be placed adjacent to each other.



### Question 5: Momentum Sequence
Generates a sequence by continually dividing the initial momentum N by 2 until it reaches 1, and prints the sequence in reverse order (using a Stack).

Input Format: A single integer N.
Example Usage:
Input: 10
Output: 1 2 5 10

Assumptions & Edge Cases:
- Assumes N >= 1. If N is 0 or negative, the loop condition fails, the stack remains empty, and the program simply outputs a blank line safely.