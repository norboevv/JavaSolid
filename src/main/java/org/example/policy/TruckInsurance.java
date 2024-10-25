package org.example.policy;



public class TruckInsurance implements InsurancePolicy {
    private double truckValue;

    public TruckInsurance(double truckValue) {
        this.truckValue = truckValue;
    }

    @Override
    public double calculatePremium() {
        return truckValue * 0.07;
    }
}
