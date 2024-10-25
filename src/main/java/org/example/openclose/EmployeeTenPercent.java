package org.example.openclose;

public class EmployeeTenPercent extends Employee{
    @Override
    public double calculateBonus() {
        { return super.salary * 0.1;}
    }
}
