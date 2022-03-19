package andersenlab.lesson7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderText {
    public static <AppData> void setDataFromFile(AppData appData, File file) {
        String line;
        String[] stringData;
        String[] header;
        int counter = 0, items;
        int lines = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            lines = (int) in.lines().count() - 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] data = new int[lines][];

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            header = in.readLine().split(";");
            while ((line = in.readLine()) != null) {
                stringData = line.split(";");
                items = 0;
                data[counter] = new int[stringData.length];
                for (String tempString : stringData) {
                    data[counter][items] = Integer.parseInt(tempString);
                    items++;
                }
                counter++;
            }
           // appData.setHeader(header);
           // appData.setData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
