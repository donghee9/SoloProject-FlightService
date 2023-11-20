package com.example.filghtApp.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class FlightsDTO {
    private String flightNumber;
    private String departure;
    private String destination;
    private  String departureTime;
    private  String arrivalTime;
    private int seatAvailable;

    private FlightsDTO(){}
    public static FlightsDTO of(String flightNumber ,String departure,String destination,String departureTime,String arrivalTime ,int seatAvailable){
        FlightsDTO flightsDTO=new FlightsDTO();
        flightsDTO.flightNumber=flightNumber;
        flightsDTO.departure=departure;
        flightsDTO.destination=destination;
        flightsDTO.departureTime=departureTime;
        flightsDTO.arrivalTime=arrivalTime;
        flightsDTO.seatAvailable=seatAvailable;
        return flightsDTO;
    }
}
