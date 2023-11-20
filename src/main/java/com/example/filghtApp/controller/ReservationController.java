package com.example.filghtApp.controller;

import com.example.filghtApp.common.exception.CommonException;
import com.example.filghtApp.domain.dto.FlightsDTO;
import com.example.filghtApp.infra.Impl.ReservationServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ReservationController {
    private ReservationServiceImpl reservationService;

    public ReservationController(ReservationServiceImpl reservationService) {
        this.reservationService = reservationService;
    }
    public List<FlightsDTO> showAllFlightList() {
        try {
            return reservationService.getAllFlightList();
        } catch (CommonException e) {
            System.out.println("Error occurred: " + e.getErrorMessage() + " (Code: " + e.getErrorCode() + ")");
            return null;
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return null;
        }
    }
    public List<FlightsDTO> showFilteredFlights(String departure, String destination) {
        try {
            return reservationService.getFilterList(departure, destination);
        } catch (CommonException e) {
            System.out.println("Error occurred: " + e.getErrorMessage() + " (Code: " + e.getErrorCode() + ")");
           return new ArrayList<>();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            return new ArrayList<>();
        }
    }

}

