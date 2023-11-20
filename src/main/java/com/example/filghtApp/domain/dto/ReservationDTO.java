package com.example.filghtApp.domain.dto;

public class ReservationDTO {
    private  int reservationId;
    private PassengerDTO userLoginId;
    private PassengerDTO userName;
    private FlightsDTO flights;

    private ReservationDTO status;
    private TicketsDTO tickets;

    private ReservationDTO(){}
    public ReservationDTO of(PassengerDTO userLoginId,PassengerDTO userName,FlightsDTO flights,ReservationDTO status,TicketsDTO tickets){
        ReservationDTO reservationDTO=new ReservationDTO();
        reservationDTO.reservationId=IdGenerator.getNextReservationId();
        reservationDTO.userLoginId=userLoginId;
        reservationDTO.userName=userName;
        reservationDTO.flights=flights;
        reservationDTO.status=status;
        reservationDTO.tickets=tickets;
        return reservationDTO;
    }
}
