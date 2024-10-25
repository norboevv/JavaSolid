package org.example.InterfaceSegregation.sinfishi.discount.typeoftransport;

class Car extends Vehicle implements EngineVehicle {
    private double carSpeed;

    public Car(double speed) {
        this.carSpeed = speed;
    }

    @Override
    public double speed() {
        return carSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }
}