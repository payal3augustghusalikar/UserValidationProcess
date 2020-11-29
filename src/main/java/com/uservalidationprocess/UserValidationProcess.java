package com.uservalidationprocess;

import java.util.regex.Pattern;

public class UserValidationProcess {
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern = "^([a-z]{3,})([\'.\'-\'+]{0,1}[a-z0-9]*)@([a-z]{1,4}).([a-z]{2,3})(^[.]{0,1}[a-z]{2,3}){0,1}$";
    String mobileNumberPattern = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
    String passwordPattern = "^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public boolean validateLastName(String lastName) {

        return Pattern.matches(lastNamePattern,lastName);
    }

    public boolean validateEmail(String email) {

        return Pattern.matches(emailPattern,email);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(mobileNumberPattern,mobileNumber);
    }

    public boolean validatepassword(String password) {

        return Pattern.matches(passwordPattern,password);
    }
}
