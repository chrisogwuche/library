import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class shelve {
    private static final String CSV_FILE_PATH = "./bookShelve.csv";
    public static String info;

    public static void main(String[] args) {
        addToShelve("./bookShelve.csv");
    }

    public static void addToShelve(String output) {
        File file = new File(output);
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<>();
        String[] data = new String[4];

        try {
            FileWriter outputFile = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(outputFile);
            System.out.print("Enter Authors Name: ");
            info = sc.nextLine();
            data[0] = info;
            System.out.print("Enter Title: ");
            info = sc.nextLine();
            data[1] = info;
            System.out.print("Enter Published: ");
            info = sc.nextLine();
            data[2] = info;
            System.out.print("Enter Content: ");
            info = sc.nextLine();
            data[3] = info;
            list.add(data);
            writer.writeAll(list);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
