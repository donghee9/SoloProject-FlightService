package com.example.bankservice.service;

import com.example.bankservice.dto.AccountDTO;
import com.example.bankservice.dto.BankStatementDTO;
import com.example.bankservice.dto.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private static final List<UserDTO> userList = new ArrayList<>();
    private static final Map<String,UserDTO> userSecretKey=new HashMap<>();
    private static final List<AccountDTO> accountList = new ArrayList<>();

    private static final List<BankStatementDTO> statementList = new ArrayList<>();

    static {
        initializeStaticUserList();
        initializeStaticAccountList();
        initializeStaticStatementList();

    }

    private static void initializeStaticUserList() {
        Map<Integer, Integer> customSecretKey = new HashMap<>();
        customSecretKey.put(1, 30);
        customSecretKey.put(2, 45);
        customSecretKey.put(3, 60);
        customSecretKey.put(4, 75);
        customSecretKey.put(5, 88);
        customSecretKey.put(6, 22);
        customSecretKey.put(7, 10);
        customSecretKey.put(8, 55);
        customSecretKey.put(9, 34);
        customSecretKey.put(10, 47);
        customSecretKey.put(11, 62);
        customSecretKey.put(12, 81);
        customSecretKey.put(13, 19);
        customSecretKey.put(14, 26);
        customSecretKey.put(15, 43);
        customSecretKey.put(16, 57);

        UserDTO userWithCustomKey = UserDTO.ofWithSecretKey("seo", "01075551234", "seod", customSecretKey);
        userList.add(userWithCustomKey);
        userSecretKey.put(userWithCustomKey.getUserId(), userWithCustomKey);

    }


    private static void initializeStaticAccountList() {
        accountList.add(AccountDTO.of("seo","seod","heeAccount",40000.00));
    }

    private static void initializeStaticStatementList() {
    }

}