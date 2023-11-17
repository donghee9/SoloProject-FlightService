package com.example.bankservice.controller;

import com.example.bankservice.dto.UserDTO;
import com.example.bankservice.exception.ErrorCode;
import com.example.bankservice.exception.InputException;
import com.example.bankservice.exception.PolicyException;
import com.example.bankservice.service.AuthenticationService;
import com.example.bankservice.service.Helper;
import com.example.bankservice.service.Impl.AuthenticationServiceImpl;

import java.util.Map;

public class AuthenticationController {
    private AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    public String registerUser(UserDTO userDTO) {
        try {
            if (userDTO == null) {
                throw new InputException(ErrorCode.INVALID_INPUT);
            }
            Helper.validateUserDetails(userDTO.getPhone(), userDTO.getUserId());
            Map<Integer, Integer> response = authenticationService.createUser(userDTO);

            String secretKeyString = response.toString()
                    .replace(", ", ",\n ")
                    .replace("{", "{\n ")
                    .replace("}", "\n}");

            return "고객 생성이 완료되었습니다.\nSECRETKEY:" + secretKeyString;
        } catch (InputException e) {
            return "고객 생성 실패: " + e.getMessage();
        } catch (Exception e) {
            return "고객 생성 실패: " + e.getMessage();
        }
    }

    public void login(String userId, Map<Integer, Integer> secretKeyParts) {
        boolean isAuthenticated = authenticationService.loginUser(userId, secretKeyParts);
        if (isAuthenticated) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패: 잘못된 정보입니다.");
        }
    }

}



