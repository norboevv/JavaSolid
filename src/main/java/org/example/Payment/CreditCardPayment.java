package org.example.Payment;

public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Kredit karta orqali to'lob bajarilmoqda" + amount + "karta raqami orqali " + cardNumber);
    }
}