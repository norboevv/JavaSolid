package org.example.openclose;

public class EmployeeFivePercent extends Employee{
    @Override
    public double calculateBonus() {
        {
            return super.salary * 0.5;
        }
    }
}
