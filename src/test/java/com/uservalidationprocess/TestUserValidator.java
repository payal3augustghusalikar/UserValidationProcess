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
        boolean result = userValidationProcess.validateEmail("payalghusalikar@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validateEmail("Payalghusalikar@gmail.com");
        Assert.assertFalse(result);
    }
   @Test
    public void givenEmail_WhenEmailContainMinimumOneLetterAfterDot_ShouldReturn_True() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.c");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailNotWhenEmailContainMinimumOneLetterAfterDot_ShouldReturn_False() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.");
        Assert.assertFalse(result);
    }
}