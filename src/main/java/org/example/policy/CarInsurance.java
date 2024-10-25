package org.example.policy;

public class CarInsurance implements InsurancePolicy {
    private double carValue;

    public CarInsurance(double carValue) {
        this.carValue = carValue;
    }

    @Override
    public double calculatePremium() {
        return carValue * 0.05;
    }
}