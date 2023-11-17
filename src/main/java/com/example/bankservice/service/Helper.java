package com.example.bankservice.service;
import com.example.bankservice.exception.ErrorCode;
import com.example.bankservice.exception.PolicyException;

import java.util.Map;


public class Helper {

    public static void validateUserDetails(String phone, String userId) throws PolicyException {
        isValidatePhone(phone);
        isValidUserId(userId);
    }

    public  static void isValidatePhone(String phone) throws PolicyException {
        if (phone == null || phone.isEmpty() || !phone.matches("\\d{10,11}")) {
            throw new PolicyException(ErrorCode.INVALID_PHONE_NUMBER);
        }

    }


    public  static void isValidUserId(String userId)throws PolicyException {
        if (userId == null || userId.length() < 6 || !userId.matches("[a-zA-Z0-9]+")) {
        throw new PolicyException(ErrorCode.INVALID_USER_ID);
    }}

    public static boolean validateSecretKey(Map<Integer, Integer> userSecretKey, Map<Integer, Integer> inputSecretKeyParts) {
        for (Map.Entry<Integer, Integer> entry : inputSecretKeyParts.entrySet()) {
            if (!userSecretKey.containsKey(entry.getKey()) || !userSecretKey.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
