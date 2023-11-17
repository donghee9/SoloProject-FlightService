package com.example.bankservice.exception;

public enum ErrorCode {
    USER_NOT_FOUND(100, "User not found"),
    INVALID_INPUT(101, "Invalid input provided"),
    DATABASE_ERROR(102, "Database error occurred"),
    POLICY_ERROR(103, "Policy error occurred"),
    INVALID_PHONE_NUMBER(104, "Invalid phone number"),
    PHONE_NUMBER_EXISTS(105, "Phone number already exists"),
    INVALID_IDENTIFICATION_NUMBER(106, "Invalid identification number provided"),
    IDENTIFICATION_EXISTS(107, "Identification number already exists"),
    INVALID_USER_ID(108, "Invalid user ID"),
    USER_ID_EXISTS(109, "User ID already exists");

    private final int code;
    private final String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
