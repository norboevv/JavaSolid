package org.example.uyishi1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFIle {
    public static void main(String[] args) {
        String filePath = "text.txt";
        File file = new File(filePath);

        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Fayl topilmadi: " + filePath);
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

