package org.example.policy;

public class MotorbikeInsurance implements InsurancePolicy {
    private double bikeValue;

    public MotorbikeInsurance(double bikeValue) {
        this.bikeValue = bikeValue;
    }

    @Override
    public double calculatePremium() {
        return bikeValue * 0.03;
    }
}
