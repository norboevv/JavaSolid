package org.example.InterfaceSegregation.sinfishi.discount;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        System.out.println(orderService.calculateFlatDiscount(100000));
        System.out.println(orderService.calculatePercentageDiscount(100000));
    }
}
