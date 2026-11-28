# Smallest Among Three Integers

A simple Java console program that reads three integers from the user and prints the smallest of the three.

## How It Works

1. The program prompts you to enter three integers, one at a time.
2. Each input is validated — if you enter a non-integer value, the program discards it, shows an error message, and prompts again until a valid integer is entered.
3. Once all three integers are collected, the program computes and prints the smallest value. If two or three inputs share that value, it reports a tie and how many times it appears.
4. The program then asks `Try again? (y/n)`. Answer `y`/`yes` to play another round, or `n`/`no` to exit. Anything else is rejected with a re-prompt, just like the integer inputs.

## Project Structure

- `src/SmallestAmongThreeIntegers.java` — Main entry point; handles prompting, output, and the play-again session loop.
- `src/CheckUserInput.java` — Validates and reads input from the user (integers, plus yes/no answers).
- `src/FindSmallestOfThreeIntegers.java` — Returns the smallest of three integers, with tie information.
- `src/SmallestResult.java` — A record carrying the smallest value and how many of the three inputs share it.

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
Try again? (y/n): maybe
Please answer with 'y' or 'n'.
Try again? (y/n): y
Input first integer: 4
Input second integer: 4
Input third integer: 9
Tie! 4 is the smallest, appearing 2 of 3 times.
Try again? (y/n): n
```
