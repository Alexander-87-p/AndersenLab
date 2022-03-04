package andersenlab.lesson7;

import java.io.IOException;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String[] strings = {"Value1", "Value2", "Value3"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        String path = "D:\\IdeaProjects\\AndersenLab\\Less.csv";
        AppDate.printData(path);

        AppDate date = new AppDate();
        date.readFileHeader(path);
        System.out.println(Arrays.toString(date.getHeader()));
        System.out.println(Arrays.deepToString(date.getData()));
    }
}
