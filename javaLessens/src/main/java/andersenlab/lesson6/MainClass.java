package andersenlab.lesson6;

public class MainClass {
    public static void main(String[] args) throws StringToIntegerConverter.MyArraySizeException {
        String[][] incorrectMatrixSize = new String[][]{
                {"11", "74", "41", "70", "91"},
                {"10", "82", "47", "65", "10"},
                {"32", "11", "08", "41", "10"},
                {"77", "46", "12", "55", "56"},
        };

        String[][] correctMatrix = new String[][]{
                {"5", "1", "7", "7"},
                {"7", "2", "6", "8"},
                {"3", "7", "4", "1"},
                {"1", "6", "3", "2"},
        };

        String[][] incorrectFormatMatrix = new String[][]{
                {"9", "5", "aaa", "7"},
                {"8", "4", "0", "6"},
                {"7", "3", "9", "5"},
                {"6", "2", "8", "4"},
        };
        try {
            System.out.println(StringToIntegerConverter.convertStringToIntInMatrix(incorrectFormatMatrix));
        } catch (StringToIntegerConverter.MyArraySizeException ignored) {

        } catch (StringToIntegerConverter.MyArrayDataException ignored) {

        }
    }
}
