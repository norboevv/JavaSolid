package org.example.Payment;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        Payment payPalPayment = new PayPalPayment("user@example.com");
        Payment bankTransferPayment = new BankTransferPayment();

        creditCardPayment.processPayment(100.0);
        payPalPayment.processPayment(200.0);
        bankTransferPayment.processPayment(300.0);
    }
}
