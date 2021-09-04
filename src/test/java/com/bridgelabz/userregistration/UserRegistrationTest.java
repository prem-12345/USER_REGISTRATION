package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // UC1 Firstname validation test
    @Test
    public void givenFirstname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.firstname("Prem");
        assertTrue(result);
    }

    // UC2 Lastname validation test
    @Test
    public void givenLastname_When_Valid_ShouldReturn_True() {
        UserRegistration nameValidation = new UserRegistration();
        boolean result = nameValidation.lastname("Patil");
        assertTrue(result);
    }

    // UC3 Phone number validation test
    @Test
    public void givenPhoneNumber_When_Valid_ShouldReturn_True() {
        UserRegistration phoneValidation = new UserRegistration();
        boolean result = phoneValidation.phoneNumber("192 1580741236");
        assertTrue((result));
    }

    // UC4 Password validation test
    @Test
    public void givenPassWord_When_Valid_ShouldReturn_True() {
        UserRegistration passWordValidation = new UserRegistration();
        boolean result = passWordValidation.password("PREMPATIL");
        assertTrue(result);
    }




}