package org.example.InterfaceSegregation.sinfishi.discount;

public interface OrderService {

    double calculateFlatDiscount(double sum);
    double calculatePercentageDiscount(double sum);
}
