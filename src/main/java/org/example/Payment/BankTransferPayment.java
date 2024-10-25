package org.example.Payment;

public class BankTransferPayment implements Payment {
    private String bankName;

    @Override
    public void processPayment(double amount) {
        System.out.println("Bank to'lovi bajarilmoqda" + amount + "Bank nomi orqali" + bankName);

    }
}
