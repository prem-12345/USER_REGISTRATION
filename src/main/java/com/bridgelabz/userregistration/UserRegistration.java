package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z A-Z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z A-Z]{2,}$";

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

        // UC2 Lastname validation test
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("The Given Last Name Is Valid");
        } else {
            System.out.println("The Given Last Name Is Not Valid");
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



    }

}
