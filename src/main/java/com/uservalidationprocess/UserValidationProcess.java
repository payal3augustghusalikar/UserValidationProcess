package com.uservalidationprocess;

import java.util.regex.Pattern;

public class UserValidationProcess {
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern = "^([a-z]{3,})([.]{0,1}[a-z]*)@([a-z]{2}).([a-z]{2})([.]{1}[a-z]{2}){0,1}$";


    public boolean validateFirstName(String firstName) {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(lastNamePattern,lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }
}
