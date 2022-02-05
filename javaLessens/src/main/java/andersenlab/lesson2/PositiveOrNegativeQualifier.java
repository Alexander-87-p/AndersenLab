package andersenlab.lesson2;
// Task 2

public class PositiveOrNegativeQualifier {
    public static void printPositiveOrNegative(int number) {
        if (number < 0) {
            System.out.println("This number " + number + " is negative.");
        } else {
            System.out.println("This number " + number + " is positive.");
        }
    }
}
