package andersenlab.lesson5;

public class Swapper {

    public static Object[] swapsTwoElementsAnArray(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex - 1];
        array[firstIndex - 1] = array[secondIndex - 1];
        array[secondIndex - 1] = temp;
        return array;
    }
}
