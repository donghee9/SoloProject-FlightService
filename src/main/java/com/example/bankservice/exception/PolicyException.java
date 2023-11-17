package com.example.bankservice.exception;

public class PolicyException extends Exception {

    private final ErrorCode errorCode;

    public PolicyException(ErrorCode errorCode) {
        super(errorCode.getDescription());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }


    public static PolicyException phoneNumberInvalid() {
        return new PolicyException(ErrorCode.INVALID_PHONE_NUMBER);
    }

    public static PolicyException phoneNumberExists() {
        return new PolicyException(ErrorCode.PHONE_NUMBER_EXISTS);
    }

    public static PolicyException pidExists() {
        return new PolicyException(ErrorCode.IDENTIFICATION_EXISTS);
    }

    public static PolicyException pidInvalid() {
        return new PolicyException(ErrorCode.INVALID_IDENTIFICATION_NUMBER);
    }

    public static PolicyException userIdInvalid() {
        return new PolicyException(ErrorCode.INVALID_USER_ID);
    }

    public static PolicyException userIdExists() {
        return new PolicyException(ErrorCode.USER_ID_EXISTS);
    }
}
