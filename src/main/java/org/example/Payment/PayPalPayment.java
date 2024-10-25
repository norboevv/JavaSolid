package org.example.Payment;

public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal to'lovi jarayonda" + amount + "Email orqali" + email);
    }
}