package org.example.InterfaceSegregation.sinfishi.discount.typeoftransport;

class TransportService {
    public void showSpeed(Vehicle vehicle) {
        System.out.println("Tezlik: " + vehicle.speed() + " km/h");
    }

    public void startEngine(EngineVehicle vehicle) {
        vehicle.startEngine();
    }
}