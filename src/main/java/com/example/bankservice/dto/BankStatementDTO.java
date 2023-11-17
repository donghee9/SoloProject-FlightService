package com.example.bankservice.dto;

import java.time.LocalDateTime;

public class BankStatementDTO {
    private int transactionId;
    private String userName;
    private String userId;

    private String accountNumber;
    private TransactionType transactionType;
    private double amount;
    private double balance;
    private LocalDateTime transactionDate;



    private BankStatementDTO(){}
    public static BankStatementDTO of(String userId,
                                      String accountNumber,
                                      TransactionType transactionType,
                                      double amount,
                                      double balance) {
        BankStatementDTO bankStatementDTO = new BankStatementDTO();
        bankStatementDTO.transactionId = IdGenerator.getBankStatementHistory();
        bankStatementDTO.userId = userId;
        bankStatementDTO.accountNumber = accountNumber;
        bankStatementDTO.transactionType = transactionType;
        bankStatementDTO.amount = amount;
        bankStatementDTO.balance = balance;
        bankStatementDTO.transactionDate = LocalDateTime.now();
        return bankStatementDTO;
    }
}
