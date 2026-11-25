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
}
