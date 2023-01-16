package com.alan.dal;

import com.alan.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class EmployeeManager {

    private static EmployeeManager instance;

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeList);
    }

    private EmployeeManager(){
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Pero", 10));
        employeeList.add(new Employee("Ivan", 11));
    }

    public static EmployeeManager getInstance(){
        if (instance == null){
            instance = new EmployeeManager();
        }
        return instance;
    }

    public Employee getRandomEmployee() {
        return this.employeeList.get(new Random().nextInt(2));
    }
}
