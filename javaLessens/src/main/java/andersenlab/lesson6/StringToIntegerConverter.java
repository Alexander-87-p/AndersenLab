package andersenlab.lesson6;

public class StringToIntegerConverter {
    public static int convertStringToIntInMatrix(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    static class MyArraySizeException extends Exception {
        MyArraySizeException() {
            System.out.println("Incorrect matrix size");
        }
    }

    static class MyArrayDataException extends NumberFormatException {
        MyArrayDataException(int row, int colum) {
            int correctRow = row + 1;
            int correctColum = colum + 1;
            System.out.println("Incorrect cell format: row = " + correctRow + ", colum = " + correctColum);
        }
    }
}
