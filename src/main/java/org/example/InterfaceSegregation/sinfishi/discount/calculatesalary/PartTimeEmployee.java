package org.example.InterfaceSegregation.sinfishi.discount.calculatesalary;

class PartTimeEmployee extends Employee {

    public PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return salary / 2;
    }
}