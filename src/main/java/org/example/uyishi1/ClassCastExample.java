package org.example.uyishi1;

public class ClassCastExample {
    public static void main(String[] args) {
        Object obj = "Matn";

        try {
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Xato: O'zgartirib bo'lmadi: " + e.getMessage());
        }
    }
}