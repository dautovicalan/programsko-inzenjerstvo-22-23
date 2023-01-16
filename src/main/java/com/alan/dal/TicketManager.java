package com.alan.dal;

public final class TicketManager {

    private static TicketManager instance;

    private TicketManager(){
    }

    public static TicketManager getInstance(){
        if (instance == null){
            instance = new TicketManager();
        }
        return instance;
    }
    private int ticketIncome;

    public void addTicketIncome(int ticketPrice){
        this.ticketIncome += ticketPrice;
    }

    public int getTicketIncome(){
        return this.ticketIncome;
    }

}
