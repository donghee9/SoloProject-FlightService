package com.example.bankservice.dto;

public enum TransactionType {
    DEPOSIT(1),
    WITHDRAWAL(2);

    private final int value;

    TransactionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static TransactionType fromValue(int value) {
        for (TransactionType type : values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("No transaction type for value " + value);
    }
}
