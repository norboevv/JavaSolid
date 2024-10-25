package org.example.InterfaceSegregation.sinfishi.discount;

public class FlatDiscountImpl implements Discount{
    @Override
    public double discount(double sum) {
        return sum - sum * 0.3;
    }
}
