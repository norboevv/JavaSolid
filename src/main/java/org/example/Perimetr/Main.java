package org.example.Perimetr;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
