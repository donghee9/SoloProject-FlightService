package com.example.filghtApp.domain.service;
import com.example.filghtApp.domain.dto.*;
import java.util.ArrayList;
import java.util.List;


public class DataStore {
    private static final List<PassengerDTO> userList = new ArrayList<>();
    public static final List<FlightsDTO> flightsList=new ArrayList<>();
    private static final List<TicketsDTO> ticketsList = new ArrayList<>();
    private static final List<ReservationDTO>  reservationList = new ArrayList<>();

    static {
        initializeStaticUserList();
        initializeStaticFlightList();
        initializeStaticTicketList();
        initializeStaticReservationList();


    }

    private static void initializeStaticUserList() {


    }


    private static void initializeStaticFlightList() {

        flightsList.add(FlightsDTO.of("SEO926", "Gimpo", "USA", "2023-12-01 09:00", "2023-12-01 19:00", 150));
        flightsList.add(FlightsDTO.of("SEO408", "Incheon", "USA", "2023-12-02 10:00", "2023-12-02 22:00", 160));
        flightsList.add(FlightsDTO.of("SEO998", "Gimpo", "USA", "2023-12-03 11:00", "2023-12-03 20:00", 170));


        flightsList.add(FlightsDTO.of("KYY841", "Gimpo", "China", "2023-12-04 12:00", "2023-12-04 23:00", 180));
        flightsList.add(FlightsDTO.of("KYY565", "Incheon", "China", "2023-12-05 13:00", "2023-12-05 22:00", 190));
        flightsList.add(FlightsDTO.of("KYY803", "Gimpo", "China", "2023-12-06 14:00", "2023-12-07 01:00", 200));


        flightsList.add(FlightsDTO.of("HJS336", "Gimpo", "Japan", "2023-12-07 15:00", "2023-12-08 02:00", 210));
        flightsList.add(FlightsDTO.of("HJS512", "Incheon", "Japan", "2023-12-08 16:00", "2023-12-09 03:00", 220));
        flightsList.add(FlightsDTO.of("HJS266", "Gimpo", "Japan", "2023-12-09 17:00", "2023-12-10 04:00", 230));


        flightsList.add(FlightsDTO.of("JHJ377", "Gimpo", "Germany", "2023-12-10 18:00", "2023-12-11 05:00", 240));
        flightsList.add(FlightsDTO.of("JHJ353", "Incheon", "Germany", "2023-12-11 19:00", "2023-12-12 06:00", 250));
        flightsList.add(FlightsDTO.of("JHJ606", "Gimpo", "Germany", "2023-12-12 20:00", "2023-12-13 07:00", 260));


        flightsList.add(FlightsDTO.of("FRA123", "Gimpo", "France", "2023-12-13 08:00", "2023-12-13 18:00", 270));
        flightsList.add(FlightsDTO.of("FRA456", "Incheon", "France", "2023-12-14 09:00", "2023-12-14 20:00", 280));
        flightsList.add(FlightsDTO.of("FRA789", "Gimpo", "France", "2023-12-15 10:00", "2023-12-15 21:00", 290));


        flightsList.add(FlightsDTO.of("ITA111", "Gimpo", "Italy", "2023-12-16 11:00", "2023-12-16 23:00", 300));
        flightsList.add(FlightsDTO.of("ITA222", "Incheon", "Italy", "2023-12-17 12:00", "2023-12-17 01:00", 310));
        flightsList.add(FlightsDTO.of("ITA333", "Gimpo", "Italy", "2023-12-18 13:00", "2023-12-18 03:00", 320));


        flightsList.add(FlightsDTO.of("THA777", "Gimpo", "Thailand", "2023-12-19 14:00", "2023-12-19 05:00", 330));
        flightsList.add(FlightsDTO.of("THA888", "Incheon", "Thailand", "2023-12-20 15:00", "2023-12-20 07:00", 340));
        flightsList.add(FlightsDTO.of("THA999", "Gimpo", "Thailand", "2023-12-21 16:00", "2023-12-21 09:00", 350));


        flightsList.add(FlightsDTO.of("CAN444", "Gimpo", "Canada", "2023-12-22 17:00", "2023-12-22 11:00", 360));
        flightsList.add(FlightsDTO.of("CAN555", "Incheon", "Canada", "2023-12-23 18:00", "2023-12-23 13:00", 370));
        flightsList.add(FlightsDTO.of("CAN666", "Gimpo", "Canada", "2023-12-24 19:00", "2023-12-24 15:00", 380));

    }



    private static void initializeStaticTicketList() {
    }
    private static void initializeStaticReservationList() {
    }
}