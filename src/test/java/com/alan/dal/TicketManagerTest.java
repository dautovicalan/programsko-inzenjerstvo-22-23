package com.alan.dal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    @Test
    void shouldReturnFullyInitializableTicketManagerObject(){
        assertTrue(TicketManager.getInstance() != null);
    }
    @Test
    void shouldCorrectlyAddHundredIncome(){
        TicketManager.getInstance()
                        .addTicketIncome(100);
        assertEquals(100, TicketManager.getInstance().getTicketIncome());
    }

}