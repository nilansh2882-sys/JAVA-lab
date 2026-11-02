# Assignment 15: StringBuilder Methods

## 1. Experiment Title
StringBuilder Methods

## 2. Aim
Build and change text with StringBuilder using append, insert and deleteCharAt.

## 3. Software / Tools Required
- Java Development Kit (JDK)
- Visual Studio Code (VS Code) as the IDE/text editor (replace this with your actual IDE if different)
- Terminal / Command Prompt to compile and run Java programs
- Git and GitHub for version control and submission

## 4. Theory
StringBuilder is mutable. append adds at the end, insert adds at an index, deleteCharAt removes one character and length returns character count.

## 5. Algorithm / Procedure (question-wise)

### Question 1: Create StringBuilder Hello, append World with a leading space, then print text and length.

**Procedure:** Call append(" World"), print the builder and length().

**Input:** No runtime input. Initial text Hello.

**Expected output:**
```text
Hello World
Length: 11
```

### Question 2: Append 1 through 5, each followed by a comma, remove the final comma and print.

**Procedure:** Loop from 1 to 5 appending number and comma; delete the last character.

**Input:** No runtime input. Append 1 through 5.

**Expected output:**
```text
1,2,3,4,5
```

### Question 3: Insert Hello plus a space at index 0 of StringBuilder Java.

**Procedure:** Call insert(0,"Hello ") and print the builder.

**Input:** No runtime input. Initial text Java.

**Expected output:**
```text
Hello Java
```

## 6. Input (question-wise)

### Question 1
No runtime input. Initial text Hello.

### Question 2
No runtime input. Append 1 through 5.

### Question 3
No runtime input. Initial text Java.

## 7. Output (question-wise)

### Question 1
```text
Hello World
Length: 11
```

### Question 2
```text
1,2,3,4,5
```

### Question 3
```text
Hello Java
```

## 8. Result
The questions in this assignment are documented with their aim, theory, procedure, input, and expected output. Run each program yourself and capture its actual output screenshot before submission.
