package org.example.InterfaceSegregation.sinfishi.discount.typeoftransport;

class Bicycle extends Vehicle {
    private double bicycleSpeed;

    public Bicycle(double speed) {
        this.bicycleSpeed = speed;
    }

    @Override
    public double speed() {
        return bicycleSpeed;
    }
}