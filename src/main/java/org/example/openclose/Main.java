package org.example.openclose;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.salary = 10;
        System.out.println(employee.calculateBonus());

        Employee employeeFivePercent = new EmployeeFivePercent();
        Employee employeeTenPercent = new EmployeeTenPercent();

    }
}
