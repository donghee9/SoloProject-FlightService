package com.example.bankservice.service;

import com.example.bankservice.dto.UserDTO;
import com.example.bankservice.exception.PolicyException;

import java.util.Map;

public interface AuthenticationService {
    Map<Integer, Integer> createUser(UserDTO userDTO)throws PolicyException;
   boolean loginUser(String userId, Map<Integer, Integer> keyParts);
}
