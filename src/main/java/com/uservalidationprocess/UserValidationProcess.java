package com.uservalidationprocess;

import java.util.regex.Pattern;

public class UserValidationProcess {
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String firstName)
    {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(lastNamePattern,lastName);
    }
}
