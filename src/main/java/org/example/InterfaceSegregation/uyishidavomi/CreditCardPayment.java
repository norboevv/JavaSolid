package org.example.InterfaceSegregation.uyishidavomi;

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card orqali $" + amount + " tolandi. Kart raqami: " + cardNumber);
    }
}