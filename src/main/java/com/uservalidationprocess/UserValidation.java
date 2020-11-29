package com.uservalidationprocess;
import java.util.Scanner;

public class UserValidation {
    String validEmailSamples[] = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                                  "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                                 "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

    String invalidEmailSamples[] = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                                   ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                                   "abc.@gmail.com", "abc.@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};


    UserValidationProcess userValidationProcess = new UserValidationProcess();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        System.out.println("\n ******* Welcome to User validation process *******");

        userValidation.validateUserFirstName();
        userValidation.validateUserLastName();
        userValidation.validateUserEmail();
        userValidation.validateUserMobileNumber();
        userValidation.validateUserPassword();
        userValidation.validateValidEmailSamples();
        userValidation.validateInvalidEmailSamples();

    }


    public void validateUserFirstName() {

        while (true) {
            System.out.println("Enter your First Name starting with capital letter and minimum 3 Character");
            String firstName = scanner.nextLine();
            boolean isValid = userValidationProcess.validateFirstName(firstName);
            if (isValid) {
                System.out.println("Your Entered Name is valid");
                break;
            } else {
                System.out.println("Your Entered Name is invalid");
            }
        }
        System.out.println("------------------------------");
    }

    public void validateUserLastName() {

        while (true) {
            System.out.println("Enter your Last Name starting with capital letter and minimum 3 Character");
            String lastName = scanner.nextLine();
            boolean isValid = userValidationProcess.validateLastName(lastName);
            if (isValid) {
                System.out.println("Your Entered Name is valid");
                break;
            } else {
                System.out.println("Your Entered Name is invalid");
            }
        }
        System.out.println("------------------------------");
    }

    public void validateUserEmail() {

        while (true) {
            System.out.println("Enter your Email");
            String email = scanner.nextLine();
            boolean isValid = userValidationProcess.validateEmail(email);
            if (isValid) {
                System.out.println("Your Entered Email-id is valid");
                break;
            } else {
                System.out.println("Your Entered Email-id is invalid");
            }
        }
        System.out.println("------------------------------");
    }

    public void validateUserMobileNumber() {

        while (true) {
            System.out.println("Enter your mobile Number, with country code");
            String mobileNumber = scanner.nextLine();
            boolean isValid = userValidationProcess.validateMobileNumber(mobileNumber);
            if (isValid) {
                System.out.println("Your Entered mobile Number is valid");
                break;
            } else {
                System.out.println("Your Entered mobile Number is invalid, Enter again");
            }
        }
        System.out.println("------------------------------");
    }

    public void validateUserPassword() {

        while (true) {
            System.out.println("Enter your password, with minimum 8 character");
            String password = scanner.nextLine();
            boolean isValid = userValidationProcess.validatePassword(password);
            if (isValid) {
                System.out.println("Your Entered password is valid");
                break;
            } else {
                System.out.println("Your Entered password is invalid, Enter again");
            }
        }
        System.out.println("------------------------------");
    }

    public void validateValidEmailSamples() {
        System.out.println("-----Check for Valid Email Samples-----");

        for(int i=0; i < validEmailSamples.length; i++) {
        boolean isValid = userValidationProcess.validateEmail(validEmailSamples[i]);
        if (isValid)
            System.out.println("sample valid Email is passed");
            else
            System.out.println("sample valid Email is not passed");
        }
        System.out.println("------------------------------");
    }

    public void validateInvalidEmailSamples() {
        System.out.println("-----Check for invalid Email Samples-----");

        for(int i=0; i < invalidEmailSamples.length; i++) {
            boolean isValid = userValidationProcess.validateEmail(invalidEmailSamples[i]);
            if (isValid)
                System.out.println("sample invalid Email is not passed");
            else
                System.out.println("sample invalid Email is passed");
        }
    }
}