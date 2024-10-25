package org.example.InterfaceSegregation.uyishidavomi;

class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("PayPal orqali $" + amount + " to'landi. Email: " + email);
    }
}