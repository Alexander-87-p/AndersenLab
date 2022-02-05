package andersenlab.lesson2;
// Task 1

public class Within10and20checker {
    static int lowerLimit = 10;
    static int upperLimit = 20;

    public static boolean isWithin10and20(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return lowerLimit <= sum && sum <= upperLimit;
    }
}
