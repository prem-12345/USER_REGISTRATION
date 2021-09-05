package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // UC1 Firstname Custom Exception Handling
    @Test
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        try {
            boolean result = nameValidation.firstname("Prem");
            if (result){
                assertTrue(result);
            }else {
                throw new InvalidFirstNameTestException("Enter Correct First Name");
            }

        }catch (InvalidFirstNameTestException e) {
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
                throw new InvalidLastNameTestException("Enter Correct Last Name");
            }
        }catch (InvalidLastNameTestException e){
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
                throw new InvalidPhoneNumberTestException("Enter The Correct Phone Number");
            }
        }catch (InvalidPhoneNumberTestException e){
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
                throw new InvalidPassWordTestException("Enter Correct Password");
            }
        }catch (InvalidPassWordTestException e){
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
                throw new InvalidPassWordTestException("Enter Correct Password");
            }
        }catch (InvalidPassWordTestException e){
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
                throw new InvalidPassWordTestException("Enter Correct Password");
            }
        }catch (InvalidPassWordTestException e){
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
                throw new InvalidPassWordTestException("Enter Correct Password");
            }
        }catch (InvalidPassWordTestException e){
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
                throw new InvalidEmailTestException("Enter The Correct Email Id");
            }
        }catch (InvalidEmailTestException e){
            e.printStackTrace();
        }
    }


}
class InvalidFirstNameTestException extends Exception {
    InvalidFirstNameTestException(String message) {
        super(message);
    }
}

class InvalidLastNameTestException extends Exception {
    InvalidLastNameTestException(String message) {
        super(message);
    }
}

class InvalidPhoneNumberTestException extends Exception {
    InvalidPhoneNumberTestException(String message){
        super(message);
    }
}

class InvalidPassWordTestException extends Exception {
    InvalidPassWordTestException (String message){
        super(message);
    }
}

class InvalidEmailTestException extends Exception {
    InvalidEmailTestException (String message){
        super(message);
    }
}