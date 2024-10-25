package org.example.Perimetr;

public class Triangle implements Shape {
    private double A;
    private double B;
    private double C;


    public Triangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public double calculatePerimeter() {
        return A + B + C;
    }
}