package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        Scanner fileScanner = new Scanner(file);
        List<String> result = new ArrayList<>();

        while (fileScanner.hasNextLine()) {
            String data = fileScanner.nextLine();
            result.add(data);
        }
        return result;
    }
}
