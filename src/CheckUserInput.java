import java.util.Scanner;

public class CheckUserInput {
    static int readInteger(Scanner scanner, String prompt) {
        System.out.print(prompt);

        // The while loop will continue to run as long as the input is not an integer (e.g., strings, char, etc)
        // Once an invalid input is received, it is discarded with scanner.next(), and the program displays
        // the non-integer message, reprompts the user, and loops again until a valid integer is entered

        while (!scanner.hasNextInt()) {
            scanner.next();   // This discards invalid inputs/bad token from buffer
            System.out.println("You've entered a non-integer value. Please enter an integer!");
        }
        return scanner.nextInt();
    }

    // Asks a yes/no question and keeps re-prompting until the user enters a valid
    // answer: 'y'/'yes' returns true, 'n'/'no' returns false, all case-insensitive
    static boolean readYesOrNo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                return true;
            }
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                return false;
            }

            System.out.println("Please answer with 'y' or 'n'.");
        }
    }
}
