package com.uservalidationprocess;

import org.junit.Assert;
import org.junit.Test;

public class TestUserValidator {
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Payal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("payal");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinimumThreeLetters_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Pay");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("Pa");
        Assert.assertFalse( result);
    }

    @Test
    public void givenFirstName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateLastName("Payal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenFirstNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("payal");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenLastNameHaveMinimumThreeLetters_ShouldReturn_True() {
        boolean result = userValidationProcess.validateLastName("Pay");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenFirstNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        boolean result = userValidationProcess.validateLastName("Pa");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateEmail("payal64@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validateEmail("Abc@gmail.com");
        Assert.assertFalse(result);
    }

   @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.co");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailNotContainMinimumTwoLetterAfterDot_ShouldReturn_False() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.c");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        boolean result = userValidationProcess.validateMobileNumber("91 9604445258");
        Assert.assertTrue( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        boolean result = userValidationProcess.validateMobileNumber("8105215414");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_ShouldReturn_True() {
        boolean result =  userValidationProcess.validateMobileNumber("91 9604445258");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
        boolean result = userValidationProcess.validateMobileNumber("91 8105215");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        boolean result = userValidationProcess.validatePassword("Payal34$");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        boolean result =userValidationProcess.validatePassword("payal");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validatePassword("Payal234$");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validatePassword("payald@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {
        boolean result = userValidationProcess.validatePassword("Payalghusali2@");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {
        boolean result = userValidationProcess.validatePassword("payalkkk@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpecialCharacter_ShouldReturn_True() {
        boolean result = userValidationProcess.validatePassword("Payal@234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpecialCharacter_ShouldReturn_False() {
        boolean result = userValidationProcess.validatePassword("Payalh123");
        Assert.assertFalse(result);
    }
}