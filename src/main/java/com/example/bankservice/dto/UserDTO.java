package com.example.bankservice.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;

@ToString
@Getter
public class UserDTO {
    private int id;
    private String name;
    private String phone;
    private String userId;
    private Map<Integer, Integer> secretKey;


    private UserDTO() {}


    public static UserDTO of(String name, String phone, String userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = IdGenerator.getNextUserId();
        userDTO.name = name;
        userDTO.phone = phone;
        userDTO.userId = userId;
        userDTO.secretKey = generateSecretKey();
        return userDTO;
    }


    public static UserDTO ofWithSecretKey(String name, String phone, String userId, Map<Integer, Integer> secretKey) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = IdGenerator.getNextUserId();
        userDTO.name = name;
        userDTO.phone = phone;
        userDTO.userId = userId;
        userDTO.secretKey = secretKey;
        return userDTO;
    }


    private static Map<Integer, Integer> generateSecretKey() {
        Map<Integer, Integer> secretKeyMap = new HashMap<>();
        Random random = new Random();
        for (int i = 1; i <= 16; i++) {
            secretKeyMap.put(i, 1 + random.nextInt(99));
        }
        return secretKeyMap;
    }
}
