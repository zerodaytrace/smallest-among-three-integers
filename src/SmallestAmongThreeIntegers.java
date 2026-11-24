import java.util.Scanner;

public class SmallestAmongThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstNum = scanner.nextInt();

        System.out.print("Input second integer: ");
        int secondNum = scanner.nextInt();

        System.out.print("Input third integer: ");
        int thirdNum = scanner.nextInt();


        System.out.println(FindSmallestOfThreeIntegers.smallestOfThreeIntegers(firstNum, secondNum, thirdNum));

        scanner.close();
    }

}
