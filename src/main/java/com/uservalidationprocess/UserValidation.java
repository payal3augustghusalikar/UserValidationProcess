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
    }

    boolean check = true;

    public void validateUserFirstName() {

        while (check) {
            System.out.println("Enter your First Name");
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
            System.out.println("Enter your Last Name");
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
}
