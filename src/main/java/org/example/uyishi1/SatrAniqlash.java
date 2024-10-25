package org.example.uyishi1;

import java.util.Scanner;

public class SatrAniqlash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satrni kiriting: ");
        String input = scanner.nextLine();

        try {
            if (input == null) {
                throw new NullPointerException("Satr null");
            }
            System.out.println("Satr uzunligi: " + input.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

