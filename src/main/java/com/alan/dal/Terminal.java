package com.alan.dal;

import com.alan.model.Vehicle;

public final class  Terminal implements Repository{

    private static Terminal instance;

    private Terminal(){

    }

    public static Terminal getInstance(){
        if (instance == null){
            instance = new Terminal();
        }
        return instance;
    }

    public void showTerminalTicketIncome(){
        System.out.println(
                "All Ticket Income: " +
                TicketManager.getInstance().getTicketIncome()
        );
    }

    public void showEmployeeIncomes(){
        EmployeeManager.getInstance()
                .getEmployeeList()
                .forEach(e -> System.out.println(
                        e.getFullName() + " income: " +
                        e.calculateIncome(
                        TicketManager
                                .getInstance()
                                .getTicketIncome()
                )));
    }

    @Override
    public void insertVehicle(Vehicle vehicle) {
        System.out.println("Welcome to terminal.  Vehicle fuel staatus: " + vehicle.getEngine().showCapacity());
        TrainManager.getInstance().insertVehicleInTrain(vehicle);
    }
}
