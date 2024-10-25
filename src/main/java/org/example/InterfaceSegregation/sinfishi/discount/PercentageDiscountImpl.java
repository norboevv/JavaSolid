package org.example.InterfaceSegregation.sinfishi.discount;

public class PercentageDiscountImpl implements Discount {
    @Override
    public double discount(double sum) {
        return sum - sum * 0.15;
    }
}
