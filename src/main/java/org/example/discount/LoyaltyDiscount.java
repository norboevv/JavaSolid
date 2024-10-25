package org.example.discount;

public class LoyaltyDiscount implements Discount {
    @Override
    public void discount(double price) {
        System.out.println("Loyalty Discount"+ price * 0.2);
    }
}
