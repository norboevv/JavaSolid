package org.example.policy;

public class Main {
    public static void main(String[] args) {
        InsurancePolicy carInsurance = new CarInsurance(20000);
        InsurancePolicy motorbikeInsurance = new MotorbikeInsurance(10000);
        InsurancePolicy truckInsurance = new TruckInsurance(50000);

        System.out.println("Car Insurance Premium: $" + carInsurance.calculatePremium());
        System.out.println("Motorbike Insurance Premium: $" + motorbikeInsurance.calculatePremium());
        System.out.println("Truck Insurance Premium: $" + truckInsurance.calculatePremium());
    }
}
