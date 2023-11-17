package com.example.bankservice.exception;

public class InputException extends Exception {

    public InputException(ErrorCode errorCode) {
        super(errorCode.getDescription());
    }

    public static InputException invalidInput() {
        return new InputException(ErrorCode.INVALID_INPUT);
    }
}
