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

This project uses [Gradle](https://gradle.org/) via the Gradle **wrapper**, so
you do not need Gradle installed — the wrapper downloads the exact pinned
version (Gradle 9.9.2) and verifies it against a checksum. You only need a
JDK 21.

From the project root:

```bash
# Build (compiles and produces build/libs/SmallestAmongThreeIntegers.jar)
./gradlew build

# Run the application
./gradlew run
```

On Windows, use `gradlew.bat` instead of `./gradlew`.

### Reproducible builds

The build is configured to be **reproducible** — building the same source
produces a byte-for-byte identical jar on any machine. This is achieved by:

- Pinning the Gradle version and JDK toolchain (Gradle 9.9.2 + Java 21).
- Stripping embedded timestamps and normalizing file order/permissions in all
  archives.

You can verify it:

```bash
./gradlew clean jar && sha256sum build/libs/*.jar
./gradlew clean jar && sha256sum build/libs/*.jar   # same hash both times
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
