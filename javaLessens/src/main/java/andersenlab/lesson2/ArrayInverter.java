package andersenlab.lesson2;
// Task 5

public class ArrayInverter {
    static int[] array = {1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0};

    public static int[] invertArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }
}
