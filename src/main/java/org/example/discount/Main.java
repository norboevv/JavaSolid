package org.example.discount;

public class Main {
    public static void main(String[] args) {
        Discount seasonalDiscount = new SeasonalDiscount(20); // 20% chegirma
        Discount loyaltyDiscount = new LoyaltyDiscount(15); // $15 chegirma
        Discount blackFridayDiscount = new BlackFridayDiscount(30); // 30% chegirma

        double originalPrice = 100.0;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Price after Seasonal Discount: $" + seasonalDiscount.applyDiscount(originalPrice));
        System.out.println("Price after Loyalty Discount: $" + loyaltyDiscount.applyDiscount(originalPrice));
        System.out.println("Price after Black Friday Discount: $" + blackFridayDiscount.applyDiscount(originalPrice));
    }
}
