package org.example.InterfaceSegregation.sinfishi.discount.calculatesalary;
public abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    public abstract double calculateSalary();
}
