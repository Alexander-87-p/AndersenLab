package andersenlab.lesson2;
//Task with ***

public class ArrayShifter {
    public static int[] shiftArrayNTimes(int[] array, int shiftValue) {
        int temp;
        if (shiftValue > 0) {
            for (int i = 0; i < shiftValue; i++) {
                temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
        } else {
            int positiveShiftValue = shiftValue * -1;
            for (int i = 0; i < positiveShiftValue; i++) {
                temp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
        }
        return array;
    }
}
