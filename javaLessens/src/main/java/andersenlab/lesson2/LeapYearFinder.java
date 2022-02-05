package andersenlab.lesson2;
// Task 4*

public class LeapYearFinder {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return (year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }
}
