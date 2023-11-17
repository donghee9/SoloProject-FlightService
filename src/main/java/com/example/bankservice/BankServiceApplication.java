package com.example.bankservice;

import com.example.bankservice.controller.AuthenticationController;
import com.example.bankservice.dto.UserDTO;

import com.example.bankservice.presention.UserLoginCLI;
import com.example.bankservice.presention.UserValidationCLI;
import com.example.bankservice.service.Impl.AuthenticationServiceImpl;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BankServiceApplication {

    public static void main(String[] args) {
        runCLI();
    }

    private static void runCLI() {
        Scanner scanner = new Scanner(System.in);
        Map<String, UserDTO> userStorage = new HashMap<>();
        AuthenticationController authenticationController = new AuthenticationController(new AuthenticationServiceImpl(userStorage));
        while (true) {
            System.out.println("\nWelcome to BankApplication");
            System.out.println("1.로그인");
            System.out.println("2.회원가입");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 2:
                    UserValidationCLI userValidationCLI = new UserValidationCLI(authenticationController);
                    userValidationCLI.run();
                    break;
                case 1:
                    UserLoginCLI userLoginCLI = new UserLoginCLI(authenticationController);
                    userLoginCLI.run();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
