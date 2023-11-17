package com.example.bankservice.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class AccountDTO {
    private int id;
    private String accountNumber;
    private String userName;
    private String userId;
    private String accountName;
    private double balance;

    private AccountDTO(){}
    public static AccountDTO of(String userName,String userId,String accountName,double initialDeposit){
        AccountDTO accountDTO=new AccountDTO();
        accountDTO.id=IdGenerator.getNextAccountId();
        accountDTO.accountNumber=generateAccountNumber();
        accountDTO.userName=userName;
        accountDTO.userId=userId;
        accountDTO.accountName=accountName;
        accountDTO.balance= initialDeposit;
        return accountDTO;
    }
    private static String generateAccountNumber() {
        String datePart = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String randomNumberPart = String.format("%04d", new Random().nextInt(10000));
        return datePart + randomNumberPart;
    }

}
