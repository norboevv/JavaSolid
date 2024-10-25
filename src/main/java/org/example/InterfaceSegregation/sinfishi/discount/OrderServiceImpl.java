package org.example.InterfaceSegregation.sinfishi.discount;

public class OrderServiceImpl implements OrderService {

    private final Discount percentageDiscount;
    private final Discount flatDiscount;

    public OrderServiceImpl() {
        percentageDiscount = new PercentageDiscountImpl();
        flatDiscount = new FlatDiscountImpl();
    }

    @Override
    public double calculateFlatDiscount(double sum) {
        return flatDiscount.discount(sum);
    }

    @Override
    public double calculatePercentageDiscount(double sum) {
        return percentageDiscount.discount(sum);
    }
}
