package com.uservalidationprocess;

import java.util.regex.Pattern;

public class UserValidationProcess {
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String firstName)
    {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public void validateFirstName() {
    }
}
