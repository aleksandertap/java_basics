package week9.ex21;

import java.io.File;
import java.util.Scanner;

public class Printer {
    private String fileName;
    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) throws Exception {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
