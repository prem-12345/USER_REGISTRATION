package com.bridgelabz.userregistration;

public class UserRegistrationException extends Exception {

    enum ExceptionType {
        ENTERED_INVALID_NAME, ENTERED_INVALID_PHONE_NUMBER, ENTERED_INVALID_PASSWORD, ENTERED_INVALID_EMAIL
    }

    ExceptionType type;

    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}
