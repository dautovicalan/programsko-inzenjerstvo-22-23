package com.alan;

import com.alan.dal.Terminal;
import com.alan.model.*;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = Terminal.getInstance();

        terminal.insertVehicle(new Car("BMW", "M8", new GasEngine()));
        terminal.insertVehicle(new Car("BMW", "i8", new ElectricEngine()));
        terminal.insertVehicle(new Van("Volkswagen", "Caddy", new ElectricEngine()));
        terminal.insertVehicle(new Bus("Man", "ZET", new GasEngine()));
        terminal.insertVehicle(new Truck("Scannia", "Velika", new GasEngine()));

        terminal.showTerminalTicketIncome();
        terminal.showEmployeeIncomes();
    }
}
