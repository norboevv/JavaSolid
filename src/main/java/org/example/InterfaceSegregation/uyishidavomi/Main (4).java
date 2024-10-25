package org.example.InterfaceSegregation.uyishidavomi;

public class Main {
    public static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        creditCardPayment.pay(100.0);

        Payment payPalPayment = new PayPalPayment("user@example.com");
        payPalPayment.pay(50.0);
    }
}