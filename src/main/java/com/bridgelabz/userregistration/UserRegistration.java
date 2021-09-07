package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

interface FirstNameInterface {
    boolean firstNameValidation();
}

interface LastNameInterface {
    boolean lastNameValidation();
}

interface PhoneValidationInterface {
    boolean phoneValidation();
}

interface PasswordValidationInterface {
    boolean passwordValidation();
}

interface EmailValidationInterface {
    boolean emailValidation();
}

public class UserRegistration {
    public static void main(String[] args) {       // Welcome to Lamda Expression Program

        System.out.println("Enter The First Name: ");
        FirstNameInterface person1 = () -> {
            Scanner scanner = new Scanner(System.in);
            String firstName = scanner.nextLine();
            return Pattern.matches("^[A-Z]{1}[a-z A-Z]{2,}$", firstName);
        };
        System.out.println(person1.firstNameValidation());

        System.out.println("Enter The Last Name: ");
        LastNameInterface person2 = () -> {
            Scanner scanner = new Scanner(System.in);
            String lastName = scanner.nextLine();
            return Pattern.matches("^[A-Z]{1}[a-z A-Z]{2,}$", lastName);
        };
        System.out.println(person2.lastNameValidation());

        System.out.println("Enter The Phone Number: ");
        PhoneValidationInterface person3 = () -> {
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.nextLine();
            return Pattern.matches("^[0-9]{2,3} [1-9][0-9]{9}$", phone);
        };
        System.out.println(person3.phoneValidation());

        System.out.println("Enter The Password: ");
        PasswordValidationInterface person4 = () -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            return Pattern.matches("[a-z A-Z]{8,}$", password);
        };
        System.out.println(person4.passwordValidation());

        System.out.println("Enter The Password: ");                     //uppercase password
        PasswordValidationInterface person5 = () -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            return Pattern.matches("((?=.*[A-Z]))[a-z A-Z].{7,}$", password);
        };
        System.out.println(person5.passwordValidation());

        System.out.println("Enter The Password: ");                    //numeric password
        PasswordValidationInterface person6 = () -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            return Pattern.matches("(?=.*[0-9])(?=.*[A-Z])[a-z A-Z].{7,}$", password);
        };
        System.out.println(person6.passwordValidation());

        System.out.println("Enter The Password: ");                   //special character password
        PasswordValidationInterface person7 = () -> {
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            return Pattern.matches("(?=.*[$@%&!*?])(?=.*[0-9])(?=.*[A-Z])[a-z A-Z].{7,}$", password);
        };
        System.out.println(person7.passwordValidation());

        System.out.println("Enter The Email: ");
        EmailValidationInterface person8 = () -> {
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            return Pattern.matches("^[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}$", email);
        };
        System.out.println(person8.emailValidation());

    }


}
