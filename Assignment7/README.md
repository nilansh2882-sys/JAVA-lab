# Assignment 7: Counting Steps and Complexity

## 1. Experiment Title
Counting Steps and Complexity

## 2. Aim
Count program steps and state time complexity in a comment.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code (VS Code) as the IDE/text editor (replace this with your actual IDE if different)
- Terminal / Command Prompt to compile and run Java programs
- Git and GitHub for version control and submission

## 4. Theory
A single loop is typically O(n), nested n-by-n loops O(n²), and repeated halving O(log n).

## 5. Algorithm / Procedure (question-wise)

### Question 1: Count iterations of a loop from 1 to 10; comment on complexity.

**Procedure:** Increment a counter once per iteration; comment O(n).

**Input:** No runtime input. Loop runs 10 times.

**Expected output:**
```text
Steps: 10
```

### Question 2: Count inner-loop executions for two nested loops from 1 to 10.

**Procedure:** Increment a counter inside the inner loop; comment O(n²).

**Input:** No runtime input. Each loop runs 10 times.

**Expected output:**
```text
Steps: 100
```

### Question 3: Halve n=1024 until it is 1 and count divisions.

**Procedure:** While n>1, divide by 2 and increment the counter; comment O(log n).

**Input:** No runtime input. n=1024.

**Expected output:**
```text
Halving steps: 10
```

## 6. Input (question-wise)

### Question 1
No runtime input. Loop runs 10 times.

### Question 2
No runtime input. Each loop runs 10 times.

### Question 3
No runtime input. n=1024.

## 7. Output (question-wise)

### Question 1
```text
Steps: 10
```

### Question 2
```text
Steps: 100
```

### Question 3
```text
Halving steps: 10
```

## 8. Result
The questions in this assignment are documented with their aim, theory, procedure, input, and expected output. Run each program yourself and capture its actual output screenshot before submission.
