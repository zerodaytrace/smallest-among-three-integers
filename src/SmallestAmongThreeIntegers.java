import java.util.Scanner;

public class SmallestAmongThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }

}

