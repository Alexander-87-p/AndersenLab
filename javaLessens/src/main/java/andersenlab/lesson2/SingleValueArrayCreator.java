package andersenlab.lesson2;
// Task 9*

public class SingleValueArrayCreator {
    public static int[] buildArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
