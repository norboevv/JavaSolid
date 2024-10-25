package org.example.InterfaceSegregation.sinfishi.discount.calculatesalary;

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
