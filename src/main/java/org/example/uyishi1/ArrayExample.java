package org.example.uyishi1;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv o'lchamini kiriting: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print("Indeksni kiriting: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Element: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xato: Indeks massivning chegarasidan tashqarida.");
        }
    }
}

