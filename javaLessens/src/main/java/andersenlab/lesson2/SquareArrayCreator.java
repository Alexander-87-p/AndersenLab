package andersenlab.lesson2;
// Task 8

public class SquareArrayCreator {
    static int arrayLength = 7;
    static int[][] squareArray = new int[arrayLength][arrayLength];

    public static int[][] fillDiagonals() {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                if (i == j) {
                    squareArray[i][j] = 1;
                }
            }
        }
        for (int i = 0, j = squareArray.length - 1; i < squareArray.length; i++, j--) {
            squareArray[i][j] = 1;
        }
        return squareArray;
    }
}
