package com.example.bankservice.service.Impl;

import com.example.bankservice.dto.UserDTO;
import com.example.bankservice.exception.PolicyException;
import com.example.bankservice.service.AuthenticationService;
import com.example.bankservice.service.Helper;

import java.util.*;



public class AuthenticationServiceImpl implements AuthenticationService {
    private Map<String, UserDTO> userStorage;

    public AuthenticationServiceImpl(Map<String, UserDTO> userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public Map<Integer, Integer> createUser(UserDTO userDTO) throws PolicyException {
    Helper.isValidatePhone(userDTO.getPhone());
    Helper.isValidUserId(userDTO.getUserId());
    userStorage.put(userDTO.getUserId(), userDTO);
    Map<Integer, Integer> secretKeyMap = userDTO.getSecretKey();
    return secretKeyMap;
    }

    @Override
    public boolean loginUser(String userId, Map<Integer, Integer> keyParts) {
        UserDTO user = userStorage.get(userId);
        if (user == null) {
            return false;
        }

        return Helper.validateSecretKey(user.getSecretKey(), keyParts);
    }
}
