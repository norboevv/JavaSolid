package org.example.discount;

public class BlackFridayDiscount implements Discount {
    @Override
    public void discount(double price) {
        System.out.println("Black Friday Discount" + price * 0.5);
    }
}
