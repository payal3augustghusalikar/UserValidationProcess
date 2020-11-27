package com.uservalidationprocess;
import java.util.Scanner;

public class UserValidation {

    UserValidationProcess userValidationProcess = new UserValidationProcess();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        System.out.println("******* Welcome to User validation process *******");

        userValidation.validateUserFirstName();
        userValidation.validateUserLastName();
        userValidation.validateEmail();
        userValidation.mobileNumber();
        userValidation.validatepassword();
    }

    boolean check = true;

    public void validateUserFirstName() {

        while (check) {
            System.out.println("Enter your First Name starting with capital letter and minimum 3 Character");
            String firstName = scanner.nextLine();
            boolean isValid = userValidationProcess.validateFirstName(firstName);
            if (isValid == check) {
                System.out.println("Your Entered Name is valid");
                break;
            } else {
                System.out.println("Your Entered Name is invalid");
                check = true;
            }
        }
        System.out.println("------------------------------");
    }

    public void validateUserLastName() {

        while (check) {
            System.out.println("Enter your Last Name starting with capital letter and minimum 3 Character");
            String lastName = scanner.nextLine();
            boolean isValid = userValidationProcess.validateLastName(lastName);
            if (isValid == check) {
                System.out.println("Your Entered Name is valid");
                break;
            } else {
                System.out.println("Your Entered Name is invalid");
                check = true;
            }
        }
        System.out.println("------------------------------");
    }

    public void validateEmail() {

        while (check) {
            System.out.println("Enter your Email");
            String email = scanner.nextLine();
            boolean isValid = userValidationProcess.validateEmail(email);
            if (isValid == check) {
                System.out.println("Your Entered Email-id is valid");
                break;
            } else {
                System.out.println("Your Entered Email-id is invalid");
                check = true;
            }
        }
        System.out.println("------------------------------");
    }

    public void mobileNumber() {

        while (check) {
            System.out.println("Enter your mobile Number, with country code");
            String mobileNumber = scanner.nextLine();
            boolean isValid = userValidationProcess.validateMobileNumber(mobileNumber);
            if (isValid == check) {
                System.out.println("Your Entered mobile Number is valid");
                break;
            } else {
                System.out.println("Your Entered mobile Number is invalid, Enter again");
                check = true;
            }
        }
        System.out.println("------------------------------");
    }

    public void validatepassword() {

        while (check) {
            System.out.println("Enter your password, with minimum 8 character");
            String password = scanner.nextLine();
            boolean isValid = userValidationProcess.validatepassword(password);
            if (isValid == check) {
                System.out.println("Your Entered password is valid");
                break;
            } else {
                System.out.println("Your Entered password is invalid, Enter again");
                check = true;
            }
        }
        System.out.println("------------------------------");
    }
}