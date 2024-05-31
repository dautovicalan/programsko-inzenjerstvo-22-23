package com.alan.model;

public class Employee {

    private String fullName;
    private double percentageCut;

    public double calculateIncome(double terminalIncome){
        return terminalIncome * (percentageCut / 100);
    }
    public Employee(String fullName, int percentageCut) {
        this.fullName = fullName;
        this.percentageCut = percentageCut;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", percentageCut=" + percentageCut +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void checkFuelStatus(Vehicle vehicle) {
        if (vehicle.getEngine().showCapacity() < 10){
            System.out.println("Otiso sam na pumpu i natocijo malo ovo prijevozno sredstvno " +
                    vehicle);
        }
    }
}