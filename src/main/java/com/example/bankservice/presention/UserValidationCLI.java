package com.example.bankservice.presention;

import com.example.bankservice.controller.AuthenticationController;
import com.example.bankservice.dto.UserDTO;

import java.util.Scanner;

public class UserValidationCLI {
    private AuthenticationController authenticationController;
    private  Scanner scanner;
    public UserValidationCLI(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
        this.scanner = new Scanner(System.in);
    }

    public void run() {

        System.out.println("회원가입 창입니다 이름 전화번호 아이디를 생성해주세요");

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("전화번호를 입력하세요 (예: 01012345678): ");
        String phone = scanner.nextLine();

        System.out.print("사용자 ID를 입력하세요 (최소 6자, 영문자와 숫자만): ");
        String userId = scanner.nextLine();

        UserDTO userDTO=UserDTO.of(name,phone,userId);

        String response = authenticationController.registerUser(userDTO);
        System.out.println(response);
    }
}