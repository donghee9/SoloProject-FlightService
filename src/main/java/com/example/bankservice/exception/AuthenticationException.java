package com.example.bankservice.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(ErrorCode errorCode){
        super(errorCode.getDescription());

    }
    public static AuthenticationException authentication(String id,String secretKey){
        return new AuthenticationException(ErrorCode.USER_NOT_FOUND);
    }
}
