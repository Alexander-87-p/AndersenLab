package andersenlab.lesson7;

import java.io.*;
import java.util.Scanner;

public class AppDate {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public AppDate(String[] header, int[][] data) throws IOException {
        this.header = header;
        this.data = data;
    }

    public AppDate() throws IOException {
    }

    public void readFileHeader(String path) throws IOException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        setHeader(line.split(";"));
        scanner.close();
    }

    public static void printData(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String stringsFile;
            while ((stringsFile = reader.readLine()) != null) {
                System.out.println(stringsFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
