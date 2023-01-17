package com.alan.dal;

import com.alan.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void shouldReturnFullyInitializableEmployeeObject() {
        Employee randomEmployee = EmployeeManager.getInstance().getRandomEmployee();
        assertNotNull(randomEmployee);
    }
    @Test
    void shouldReturnFullyInitializableEmployeeManagerObject() {
        assertNotNull(EmployeeManager.getInstance());
    }
}