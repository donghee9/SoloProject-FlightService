package com.example.filghtApp.domain.service;

import com.example.filghtApp.domain.dto.FlightsDTO;

import java.util.List;

public interface ReservationService {
    List<FlightsDTO> getAllFlightList();
    List<FlightsDTO> getFilterList(String departure,String destination);


}
