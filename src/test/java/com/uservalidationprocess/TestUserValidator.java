package com.uservalidationprocess;

import org.junit.Assert;
import org.junit.Test;

public class TestUserValidator {
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateFirstName("Payal");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateFirstName("payal");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinimumThreeLetters_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateFirstName("Pay");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenFirstNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateFirstName("Pa");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateLastName("Payal");

            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateFirstName("payal");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenLastNameHaveMinimumThreeLetters_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateLastName("Pay");

            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateLastName("Pa");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateEmail("payal@gmail.com");

            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateEmail("Abc@gmail.com");

            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True ()  {
        try {
            boolean result = userValidationProcess.validateEmail("abc@gmail.bl");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmailNotContainMinimumTwoLetterAfterDot_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateEmail("abc@gmail.c");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        try {
            boolean result = userValidationProcess.validateMobileNumber("91 9604445258");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateMobileNumber("8105215414");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validateMobileNumber("91 9604445258");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validateMobileNumber("91 8105215");
            Assert.assertFalse(result);

        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validatePassword("Payal34$");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validatePassword("payal");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validatePassword("Payal234$");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validatePassword("payald@");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {

        try {
            boolean result = userValidationProcess.validatePassword("Payalghusali2@");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {

        try {
            boolean result = userValidationProcess.validatePassword("payalkkk@");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpecialCharacter_ShouldReturn_True() {
        try {
            boolean result = userValidationProcess.validatePassword("Payal@234");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpecialCharacter_ShouldReturn_False() {
        try {
            boolean result = userValidationProcess.validatePassword("Payalh123");
            Assert.assertFalse(result);
        } catch (UserValidationException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
}