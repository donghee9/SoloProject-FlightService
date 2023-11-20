package com.example.filghtApp.presention;

import com.example.filghtApp.controller.ReservationController;
import com.example.filghtApp.domain.dto.FlightsDTO;

import java.util.*;

public class ReservationCLI {

    private ReservationController reservationController;
    private Scanner scanner;

    public ReservationCLI(ReservationController reservationController) {
        this.reservationController = reservationController;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== Flight Reservation CLI ===");
            System.out.println("1. View All Flights");
            System.out.println("2. Filter Flights");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewAllFlights();
                    break;
                case 2:
                    filterFlights();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void viewAllFlights() {
        List<FlightsDTO> flightsList = reservationController.showAllFlightList();


        System.out.printf("%-12s | %-10s | %-10s | %-19s | %-19s | %-15s%n",
                "Flight Number", "Departure", "Destination", "Departure Time", "Arrival Time", "Seats Available");
        System.out.println("---------------------------------------------------------------");


        for (FlightsDTO flight : flightsList) {
            System.out.printf("%-12s | %-10s | %-10s | %-19s | %-19s | %-15d%n",
                    flight.getFlightNumber(), flight.getDeparture(), flight.getDestination(),
                    flight.getDepartureTime(), flight.getArrivalTime(), flight.getSeatAvailable());
        }
    }


    private void filterFlights() {
        List<FlightsDTO> allFlightsList = reservationController.showAllFlightList();

        Set<String> departures = new HashSet<>();
        Set<String> destinations = new HashSet<>();
        for (FlightsDTO flight : allFlightsList) {
            departures.add(flight.getDeparture());
            destinations.add(flight.getDestination());
        }

        String selectedDeparture = selectOption("Departure", new ArrayList<>(departures));
        String selectedDestination = selectOption("Destination", new ArrayList<>(destinations));

        List<FlightsDTO> filteredFlights = reservationController.showFilteredFlights(selectedDeparture, selectedDestination);

        if (filteredFlights.isEmpty()) {
            System.out.println("No flights found matching the criteria.");
        } else {
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.printf("%-10s %-15s %-15s %-20s %-20s %-15s%n", "Flight #", "Departure", "Destination", "Departure Time", "Arrival Time", "Seat Available");
            System.out.println("----------------------------------------------------------------------------------------------");
            for (FlightsDTO flight : filteredFlights) {
                System.out.printf("%-10s %-15s %-15s %-20s %-20s %d%n",
                        flight.getFlightNumber(),
                        flight.getDeparture(),
                        flight.getDestination(),
                        flight.getDepartureTime(),
                        flight.getArrivalTime(),
                        flight.getSeatAvailable()
                );
            }
            System.out.println("----------------------------------------------------------------------------------------------");
        }
    }

    private String selectOption(String optionType, List<String> options) {
        System.out.println("Select " + optionType + ":");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return options.get(choice - 1);
    }
}
