package andersenlab.lesson2;
// Task 6

public class ArrayCreator {
    static int[] array = new int[100];

    public static int[] fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
