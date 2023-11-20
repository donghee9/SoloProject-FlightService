package com.example.filghtApp.common.Helper;
import com.example.filghtApp.domain.dto.FlightsDTO;
import java.util.ArrayList;
import java.util.List;

public class CommonUtil {
    public static void sortFlightsByDepartureTime(List<FlightsDTO> flights) {
        int n = flights.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flights.get(j).getDepartureTime().compareTo(flights.get(j + 1).getDepartureTime()) > 0) {
                    FlightsDTO temp = flights.get(j);
                    flights.set(j, flights.get(j + 1));
                    flights.set(j + 1, temp);
                }
            }
        }
    }

    public static List<FlightsDTO> filterFlights(List<FlightsDTO> flightsList, String departure, String destination) {
        List<FlightsDTO> filteredList = new ArrayList<>();
        for (FlightsDTO flight : flightsList) {
            if (flight.getDeparture().equals(departure) && flight.getDestination().equals(destination)) {
                filteredList.add(flight);
            }
        }
        return filteredList;
    }

}



