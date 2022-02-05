package andersenlab.lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int[] array = {1, 2, 3, 4, 5};
        String string = "Hello there General Kenobi";

        //Task 1
        System.out.println(Within10and20checker.isWithin10and20(a, b));

        // Task 2
        PositiveOrNegativeQualifier.printPositiveOrNegative(b);

        // Task 3
        System.out.println(NegativeNumberQualifier.isNegative(b));

        // Task 4
        StringPrinter.printStringNTimes(string, a);

        // Task 4*
        System.out.println(LeapYearFinder.isLeapYear(2022));

        // Task 5
        System.out.println(Arrays.toString(ArrayInverter.invertArray()));

        // Task 6
        System.out.println(Arrays.toString(ArrayCreator.fillArray()));

        // Task 7
        System.out.println(Arrays.toString(ArrayChanger.multiplyNumbersLessThanSix()));

        // Task 8
        for (int i = 0; i < SquareArrayCreator.fillDiagonals().length; i++) {
            for (int j = 0; j < SquareArrayCreator.fillDiagonals()[i].length; j++) {
                System.out.print(" " + SquareArrayCreator.fillDiagonals()[i][j] + " ");
            }
            System.out.println();
        }

        // Task 9*
        System.out.println(Arrays.toString(SingleValueArrayCreator.buildArray(a, b)));

        // Task with ***
        System.out.println(Arrays.toString(ArrayShifter.shiftArrayNTimes(array, a)));
    }
}
