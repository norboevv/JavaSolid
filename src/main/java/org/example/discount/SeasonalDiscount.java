package org.example.discount;

public class SeasonalDiscount implements Discount {
    @Override
    public void discount(double price) {
        System.out.println("Seasonal" + price * 0.1);
    }
}
