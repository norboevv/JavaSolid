package org.example.uyishi1;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi son: ");
        int a = scanner.nextInt();

        System.out.print("Ikkinchi son: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Natija: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Nolga bo'lish mumkin emas");
        }
    }
}

