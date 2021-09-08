package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // UC1 Firstname Custom Exception Handling
    @Test
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        try {
            boolean result = nameValidation.firstname("prem");
            if (result){
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_NAME,"Enter Correct First Name");
            }
        }catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    // UC2 Lastname Custom Exception Handling
    @Test
    public void givenLastname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        try {
            boolean result = nameValidation.lastname("Patil");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_NAME,"Enter Correct Last Name");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC3 Phone number Custom Exception Handling
    @Test
    public void givenPhoneNumber_When_Valid_ShouldReturn_True() {
        UserRegistration phoneValidation = new UserRegistration();
        try {
            boolean result = phoneValidation.phoneNumber("192 1005841236");
            if(result) {
                assertTrue((result));
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PHONE_NUMBER,"Enter Correct Phone Number");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC4 Password Custom Exception Handling
    @Test
    public void givenPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.password("PREMPATIL");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD,"Enter Correct Password");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC5 Uppercase Password Custom Exception Handling
    @Test
    public void givenUppercasePassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.uppercasePassword("prePapuP");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD,"Enter Correct Password");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC6 Numeric Password Custom Exception Handling
    @Test
    public void givenNumericPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.numericPassword("p5RemPati");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD,"Enter Correct Password");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC7 Special Character Password Custom Exception Handling
    @Test
    public void givenSpecialCharPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        try {
            boolean result = passWordValidation.specialCharPassword("premp@6P");
            if(result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_PASSWORD,"Enter Correct Password");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    // UC8 Email Custom Exception Handling
    @Test
    public void givenEmail_When_Valid_ShouldReturn_True() {
        UserRegistration emailValidation = new UserRegistration();
        try {
            boolean result = emailValidation.emailValid("prem123@gmail.com.");
            if (result) {
                assertTrue(result);
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID_EMAIL,"Enter Correct Email");
            }
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }


}
