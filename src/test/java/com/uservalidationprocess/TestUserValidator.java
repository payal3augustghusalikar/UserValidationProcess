package com.uservalidationprocess;

import org.junit.Assert;
import org.junit.Test;

public class TestUserValidator {
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Payal");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenFirstNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("payal");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinimumThreeLetters_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Pay");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenFirstName_WhenFirstNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("Pa");
        Assert.assertEquals(false, result);
    }
}