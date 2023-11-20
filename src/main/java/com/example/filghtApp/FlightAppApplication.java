package com.example.filghtApp;


import com.example.filghtApp.controller.ReservationController;
import com.example.filghtApp.infra.Impl.ReservationServiceImpl;

import com.example.filghtApp.presention.ReservationCLI;



import java.util.Scanner;


public class FlightAppApplication {

    public static void main(String[] args) {
        runCLI();
    }

    private static void runCLI() {
        Scanner scanner = new Scanner(System.in);
        ReservationController reservationController = new ReservationController(new ReservationServiceImpl());

        while (true) {
            System.out.println("\nWelcome to FlightApp");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. View and Filter Flights");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // 로그인 로직 만들어야함
                    break;
                case 2:
                    // 회원가입 로직 만들어야함
                    break;
                case 3:
                    ReservationCLI reservationCLI = new ReservationCLI(reservationController);
                    reservationCLI.start();
                    break;
                case 4:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



