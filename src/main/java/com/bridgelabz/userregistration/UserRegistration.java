package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z A-Z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z A-Z]{2,}$";
    private static final String PHONE_NUMBER_PATTERN = "^[0-9]{3} [1-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "[a-z A-Z]{8,}$";
    private static final String UPPERCASE_PASSWORD_PATTERN = "((?=.*[A-Z]))[a-z A-Z].{7,}$";

    public static boolean firstname(String firstName) {

        // UC1 Firstname validation
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("The Given First Name Is Valid");
        } else {
            System.out.println("The Given First Name Is Not Valid");
        }
        return matcher.matches();
    }

    public static boolean lastname(String lastName) {

        // UC2 Lastname validation
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("The Given Last Name Is Valid");
        } else {
            System.out.println("The Given Last Name Is Not Valid");
        }
        return matcher.matches();

    }

    public static boolean phoneNumber(String phonenumber) {

        // UC3 Phone number validation
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phonenumber);
        if (matcher.matches()) {
            System.out.println("The Given Phone Number Is Valid");
        } else {
            System.out.println("The Given Phone Number Is Not Valid");
        }
        return matcher.matches();

    }

    public static boolean password(String passWord) {

        // UC4 Password validation
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches()) {
            System.out.println("The Given Password Is Valid");
        } else {
            System.out.println("The Given Password Is Not Valid");
        }
        return matcher.matches();

    }

    public static boolean uppercasePassword(String passWord) {

        // UC5 Uppercase Password validation
        Pattern pattern = Pattern.compile(UPPERCASE_PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches()) {
            System.out.println("The Given Password Is Valid");
        } else {
            System.out.println("The Given Password Is Not Valid");
        }
        return matcher.matches();

    }


    public static void main(String[] args) {

        // Welcome to Regular Expression Program

        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE FIRST NAME ");
        String firstname = sc.nextLine();
        firstname(firstname);

        System.out.println(" ENTER THE LAST NAME ");
        String lastname = sc.nextLine();
        lastname(lastname);

        System.out.println(" ENTER THE PHONE NUMBER ");
        String phoneNumber = sc.nextLine();
        phoneNumber(phoneNumber);

        System.out.println(" ENTER THE PASSWORD ");
        String password = sc.nextLine();
        password(password);

        System.out.println(" ENTER THE PASSWORD ");
        String uppercasePassword = sc.nextLine();
        uppercasePassword(uppercasePassword);


    }

}
