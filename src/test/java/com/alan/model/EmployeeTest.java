package com.alan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void incomeOfHundredShouldCalculateCorrectPercentage() {
        Employee employee = new Employee("Alan", 10);
        assertEquals(10, employee.calculateIncome(100));
    }
}