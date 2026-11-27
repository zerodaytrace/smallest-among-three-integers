public class FindSmallestOfThreeIntegers {
    public static int smallestOfThreeIntegers(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // This logic reports how many of the inputs share the minimum.
    public static SmallestResult smallestWithTieInfo(int num1, int num2, int num3) {
        int smallest = smallestOfThreeIntegers(num1, num2, num3);
        int count = 0;

        if (num1 == smallest) count++;
        if (num2 == smallest) count++;
        if (num3 == smallest) count++;

        return new SmallestResult(smallest, count);
    }
}
