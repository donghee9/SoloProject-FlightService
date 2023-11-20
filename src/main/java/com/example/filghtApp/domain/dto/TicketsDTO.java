package com.example.filghtApp.domain.dto;

public class TicketsDTO {
    private int ticketsId;
    private FlightsDTO flights;
    private PassengerDTO userLoginId;
    private String seatNumber;
    private double price;


    private TicketsDTO(){}
    public static TicketsDTO of(PassengerDTO userLoginId,
                                String seatNumber,
                                double price) {
        TicketsDTO ticketsDTO = new TicketsDTO();
        ticketsDTO.ticketsId = IdGenerator.getNextTicketsId();
        ticketsDTO.userLoginId = userLoginId;
        ticketsDTO.seatNumber=seatNumber;
        ticketsDTO.price=price;

        return ticketsDTO;
    }
}
