import java.util.Scanner;

public class SmallestAmongThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = CheckUserInput.readInteger(scanner, "Input first integer: ");
        int secondNum = CheckUserInput.readInteger(scanner, "Input second integer: ");
        int thirdNum = CheckUserInput.readInteger(scanner, "Input third integer: ");

        System.out.println(FindSmallestOfThreeIntegers.smallestOfThreeIntegers(firstNum, secondNum, thirdNum));

        scanner.close();
    }

}
