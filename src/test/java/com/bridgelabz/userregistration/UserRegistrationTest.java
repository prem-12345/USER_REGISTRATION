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


}