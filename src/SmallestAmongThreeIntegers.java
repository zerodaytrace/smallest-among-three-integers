import java.util.Scanner;

public class SmallestAmongThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Session loop: play a round, then ask whether to go again.
        // The loop exits as soon as the user answers 'n'/'no'.
        do {
            playRound(scanner);
        } while (CheckUserInput.readYesOrNo(scanner, "Try again? (y/n): "));

        scanner.close();
    }

    // One round: collect three integers, then print the smallest (with tie info)
    private static void playRound(Scanner scanner) {
        int firstNum = CheckUserInput.readInteger(scanner, "Input first integer: ");
        int secondNum = CheckUserInput.readInteger(scanner, "Input second integer: ");
        int thirdNum = CheckUserInput.readInteger(scanner, "Input third integer: ");

        SmallestResult result = FindSmallestOfThreeIntegers.smallestWithTieInfo(firstNum, secondNum, thirdNum);

        if (result.isTie()) {
            System.out.printf("Tie! %d is the smallest, appearing %d of 3 times.%n",
                    result.value(), result.occurrences());
        } else {
            System.out.println(result.value());
        }
    }

}
