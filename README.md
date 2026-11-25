# Smallest Among Three Integers

A simple Java console program that reads three integers from the user and prints the smallest of the three.

## How It Works

1. The program prompts you to enter three integers, one at a time.
2. Each input is validated — if you enter a non-integer value, the program discards it, shows an error message, and prompts again until a valid integer is entered.
3. Once all three integers are collected, the program computes and prints the smallest value.

## Project Structure

- `src/SmallestAmongThreeIntegers.java` — Main entry point; handles prompting and output.
- `src/CheckUserInput.java` — Validates and reads integer input from the user.
- `src/FindSmallestOfThreeIntegers.java` — Returns the smallest of three integers.

## Build and Run

From the project root:

```bash
javac -d out/production/SmallestAmongThreeIntegers src/*.java
java -cp out/production/SmallestAmongThreeIntegers SmallestAmongThreeIntegers
```

## Example

```
Input first integer: 12
Input second integer: hello
You've entered a non-integer value. Please enter an integer!
Input second integer: 5
Input third integer: 8
5
```
