package com.uservalidationprocess;

import java.util.regex.Pattern;

@FunctionalInterface
interface IlambdaValidationFunction {
    boolean userValidate(String Input, String Pattern);
}
public class UserValidationProcess {
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern = "^([a-z]{3,}.*[a-z0-9]*)(.*[.+_-]{0,1})(.*[.]{0,1})([a-z0-9]+)@([a-z]{3,4}).[a-z]{0,3}(.[a-z]{2}){0,1}$";
    String mobileNumberPattern = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
    String passwordPattern = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}$";

    IlambdaValidationFunction matchPatternLambda = (Input, Pattern) -> {
        boolean result = Pattern.matches(Input);
        return result;
    };

    private boolean matchPatternLambda(String Pattern,String Input){
        return Pattern.matches(Input);
    }

    public boolean validateFirstName(String firstName) {
        return matchPatternLambda(firstName,firstNamePattern);
    }

    public boolean validateLastName(String lastName) {
        return matchPatternLambda(lastName,firstNamePattern);
    }

    public boolean validateEmail(String email) {
        return matchPatternLambda(email,emailPattern);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return matchPatternLambda(mobileNumber,mobileNumberPattern);
    }

    public boolean validatePassword(String password) {
        return matchPatternLambda(password,passwordPattern);
    }
}
