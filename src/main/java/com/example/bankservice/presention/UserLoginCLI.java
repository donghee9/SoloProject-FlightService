package com.example.bankservice.presention;

import com.example.bankservice.controller.AuthenticationController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UserLoginCLI {
    private AuthenticationController authenticationController;
    private Scanner scanner;

    public UserLoginCLI(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        String userId = promptForUserId();
        Map<Integer, Integer> secretKeyParts = promptForKeyFragment();
        authenticationController.login(userId, secretKeyParts);
    }

    private String promptForUserId() {
        System.out.print("사용자 ID를 입력하세요: ");
        return scanner.nextLine();
    }

    private Map<Integer, Integer> promptForKeyFragment() {
        Map<Integer, Integer> keyFragment = new HashMap<>();
        Random random = new Random();

        System.out.println("1부터 16 중에서 제시되는 숫자 값을 입력해주세요");

        for (int i = 0; i < 4; i++) {
            int randomKey = random.nextInt(16) + 1;
            System.out.print((i + 1) + "번째 숫자를 입력하세요: " + randomKey +"번키 값 ="+ " ");
            int value = Integer.parseInt(scanner.nextLine());
            keyFragment.put(randomKey, value);
        }
        return keyFragment;
    }
}
